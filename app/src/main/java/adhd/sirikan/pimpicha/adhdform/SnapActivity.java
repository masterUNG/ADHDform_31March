package adhd.sirikan.pimpicha.adhdform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SnapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
        Spinner spinner8 = (Spinner) findViewById(R.id.spinner8);
        Spinner spinner9 = (Spinner) findViewById(R.id.spinner9);
        Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);
        Spinner spinner11= (Spinner) findViewById(R.id.spinner11);
        Spinner spinner12 = (Spinner) findViewById(R.id.spinner12);
        Spinner spinner13 = (Spinner) findViewById(R.id.spinner13);
        Spinner spinner14 = (Spinner) findViewById(R.id.spinner14);
        Spinner spinner15 = (Spinner) findViewById(R.id.spinner15);
        Spinner spinner16 = (Spinner) findViewById(R.id.spinner16);
        Spinner spinner17 = (Spinner) findViewById(R.id.spinner17);
        Spinner spinner18 = (Spinner) findViewById(R.id.spinner18);
        Spinner spinner19 = (Spinner) findViewById(R.id.spinner19);
        Spinner spinner20 = (Spinner) findViewById(R.id.spinner20);
        Spinner spinner21 = (Spinner) findViewById(R.id.spinner21);
        Spinner spinner22 = (Spinner) findViewById(R.id.spinner22);
        Spinner spinner23 = (Spinner) findViewById(R.id.spinner23);
        Spinner spinner24 = (Spinner) findViewById(R.id.spinner24);
        Spinner spinner25 = (Spinner) findViewById(R.id.spinner25);
        Spinner spinner26 = (Spinner) findViewById(R.id.spinner26);


        // Initializing a String Array
        String[] plants = new String[]{
                "ไม่เลย",
                "เล็กน้อย",
                "ค่อนข้างมาก",
                "มาก",

        };

        // Initializing an ArrayAdapter
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.spinner_item,plants
        );
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        spinner1.setAdapter(spinnerArrayAdapter);
        spinner2.setAdapter(spinnerArrayAdapter);
        spinner3.setAdapter(spinnerArrayAdapter);
        spinner4.setAdapter(spinnerArrayAdapter);
        spinner5.setAdapter(spinnerArrayAdapter);
        spinner6.setAdapter(spinnerArrayAdapter);
        spinner7.setAdapter(spinnerArrayAdapter);
        spinner8.setAdapter(spinnerArrayAdapter);
        spinner9.setAdapter(spinnerArrayAdapter);
        spinner10.setAdapter(spinnerArrayAdapter);
        spinner11.setAdapter(spinnerArrayAdapter);
        spinner12.setAdapter(spinnerArrayAdapter);
        spinner13.setAdapter(spinnerArrayAdapter);
        spinner14.setAdapter(spinnerArrayAdapter);
        spinner15.setAdapter(spinnerArrayAdapter);
        spinner16.setAdapter(spinnerArrayAdapter);
        spinner17.setAdapter(spinnerArrayAdapter);
        spinner18.setAdapter(spinnerArrayAdapter);
        spinner19.setAdapter(spinnerArrayAdapter);
        spinner20.setAdapter(spinnerArrayAdapter);
        spinner21.setAdapter(spinnerArrayAdapter);
        spinner22.setAdapter(spinnerArrayAdapter);
        spinner23.setAdapter(spinnerArrayAdapter);
        spinner24.setAdapter(spinnerArrayAdapter);
        spinner25.setAdapter(spinnerArrayAdapter);
        spinner26.setAdapter(spinnerArrayAdapter);



    }
    }

