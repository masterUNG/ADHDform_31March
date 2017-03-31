package adhd.sirikan.pimpicha.adhdform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView userTextView,typeTextView;
    private ImageView imageView;
    private ListView listView;
    private String[] loginString;
    private String[] showTypeStrings = new String[]{"Teacher","Children"};
    private String tag = "31MarchV2";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        InitialView();
        //get value
        loginString = getIntent().getStringArrayExtra("Login");

        //show view
        showView();
        //Image controller
        imageView.setOnClickListener(ServiceActivity.this);

    }//main method

    @Override
    protected void onResume() {
        super.onResume();
        createListView();
    }

    private void createListView() {

        try {

            GetAllData getAllData = new GetAllData(ServiceActivity.this);
            MyConstant myConstant = new MyConstant();
            getAllData.execute(myConstant.getUrlGetChild());

            String strJSON = getAllData.get();
            Log.d(tag, "JSoN ==> " + strJSON);

            String[] columnChileStrings = myConstant.getColumnChild();

            JSONArray jsonArray = new JSONArray(strJSON);
            final String[] idStrings = new String[jsonArray.length()];
            String[] nameChildStrings = new String[jsonArray.length()];
            String[] imageStrings = new String[jsonArray.length()];

            for (int i=0;i<jsonArray.length();i++) {

                JSONObject jsonObject = jsonArray.getJSONObject(i);
                idStrings[i] = jsonObject.getString(columnChileStrings[0]);
                nameChildStrings[i] = jsonObject.getString(columnChileStrings[2]);
                imageStrings[i] = jsonObject.getString(columnChileStrings[4]);

            }   // for

            //Build ListView
            ChildAdapter childAdapter = new ChildAdapter(ServiceActivity.this,
                    imageStrings, nameChildStrings);
            listView.setAdapter(childAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(ServiceActivity.this, DetailActivity.class);
                    intent.putExtra("Login", loginString);
                    intent.putExtra("Index", idStrings[i]);
                    startActivity(intent);
                }
            });


        } catch (Exception e) {
            Log.d(tag, "e createListView ==> " + e.toString());
        }

    }   // createListView


    private void showView() {
        userTextView.setText(loginString[1]);
        typeTextView.setText(showTypeStrings[Integer.parseInt(loginString[3])]); // chang 0 1 from  to int
    }

    private void InitialView() {
        userTextView = (TextView) findViewById(R.id.txtUser);
        typeTextView = (TextView) findViewById(R.id.txtType);
        imageView = (ImageView) findViewById(R.id.imvChild);

        listView = (ListView) findViewById(R.id.livChild);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ServiceActivity.this,AddChildActivity.class);
        intent.putExtra("Login",loginString);
        startActivity(intent);

    }
}//main class
