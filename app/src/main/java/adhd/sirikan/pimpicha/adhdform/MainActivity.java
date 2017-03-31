package adhd.sirikan.pimpicha.adhdform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;
    private String userString,passString;
    private String[] loginStrings;
    private boolean aBoolean = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial widget
        initialWidget();




        //controller
        controller();
        Button buttonIntent = (Button)findViewById(R.id.toSnap);
        Button buttonIntent2 = (Button)findViewById(R.id.toThass);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SnapActivity.class);
                startActivity(intent);
            }
        });
        buttonIntent2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThassActivity.class);
                startActivity(intent);
            }
        });


    }// main method



    private void controller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);
    }

    private void initialWidget() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtpassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View v) {
        //for textView
        if (v == textView) {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        }
        //for Button
        if (v == button) {
            // get value from Edit text
            userString= userEditText.getText().toString().trim();
            passString = passwordEditText.getText().toString().trim();
            // check spece
            if (userString.equals("")|| passString.equals("")) {
                //have space
                myAlert myAlert = new myAlert(MainActivity.this);
                String s = getResources().getString(R.string.title_havespace);
                String s1 = getResources().getString(R.string.message_havespece);
                myAlert.myDialog(s,s1);
            } else {
                //no space
                checkAuthen();
            }
        }



    }//onclick

    private void checkAuthen() {
        try {

            MyConstant myConstant = new MyConstant();
            String strURL = myConstant.getUrlGetUser();
            String[] columnStrings = myConstant.getColumnUser();
            myAlert objMyAlert = new myAlert(MainActivity.this);

            GetAllData getAllData = new GetAllData(MainActivity.this);
            getAllData.execute(strURL);
            String strJSON = getAllData.get();
            Log.d("30MarchV2", "JSoN ==> " + strJSON);

            JSONArray jsonArray = new JSONArray(strJSON);
            for (int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (userString.equals(jsonObject.getString(columnStrings[1]))) {
                    loginStrings = new String[columnStrings.length];
                    for (int i1=0;i1<loginStrings.length;i1++) {
                        loginStrings[i1] = jsonObject.getString(columnStrings[i1]);
                        Log.d("30MarchV2", "loginStrings(" + i1 + ") ==> " + loginStrings[i1]);
                    }   //for
                    aBoolean = false;
                }   // if
            }   //for

            if (aBoolean) {
                //User False
                objMyAlert.myDialog(getResources().getString(R.string.title_userfalse),
                        getResources().getString(R.string.message_userfalse));
            }else if(!(passString.equals(loginStrings[2]))){ //if pw false
                objMyAlert.myDialog(getResources().getString(R.string.title_passwordfalse),
                        getResources().getString(R.string.message_passwordfalse));

            }else{
            //pass fail
                Intent intent = new Intent(MainActivity.this,ServiceActivity.class);
                intent.putExtra("Login", loginStrings);
                startActivity(intent);
                finish(); // protect back login
            }

        } catch (Exception e) {
            Log.d("30MarchV2", "e checkAuthen ==> " + e.toString());
        }
    }
}//main class
