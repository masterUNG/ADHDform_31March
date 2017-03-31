package adhd.sirikan.pimpicha.adhdform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ThassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_thass);

            Spinner spinThass1 = (Spinner) findViewById(R.id.spinThass1);
            Spinner spinThass2 = (Spinner) findViewById(R.id.spinThass2);
            Spinner spinThass3 = (Spinner) findViewById(R.id.spinThass3);
            Spinner spinThass4 = (Spinner) findViewById(R.id.spinThass4);
            Spinner spinThass5 = (Spinner) findViewById(R.id.spinThass5);
            Spinner spinThass6 = (Spinner) findViewById(R.id.spinThass6);
            Spinner spinThass7 = (Spinner) findViewById(R.id.spinThass7);
            Spinner spinThass8 = (Spinner) findViewById(R.id.spinThass8);
            Spinner spinThass9 = (Spinner) findViewById(R.id.spinThass9);
            Spinner spinThass10 = (Spinner) findViewById(R.id.spinThass10);
            Spinner spinThass11= (Spinner) findViewById(R.id.spinThass11);
            Spinner spinThass12 = (Spinner) findViewById(R.id.spinThass12);
            Spinner spinThass13 = (Spinner) findViewById(R.id.spinThass13);
            Spinner spinThass14 = (Spinner) findViewById(R.id.spinThass14);
            Spinner spinThass15 = (Spinner) findViewById(R.id.spinThass15);
            Spinner spinThass16 = (Spinner) findViewById(R.id.spinThass16);
            Spinner spinThass17 = (Spinner) findViewById(R.id.spinThass17);
            Spinner spinThass18 = (Spinner) findViewById(R.id.spinThass18);
            Spinner spinThass19 = (Spinner) findViewById(R.id.spinThass19);
            Spinner spinThass20 = (Spinner) findViewById(R.id.spinThass20);
            Spinner spinThass21 = (Spinner) findViewById(R.id.spinThass21);
            Spinner spinThass22 = (Spinner) findViewById(R.id.spinThass22);
            Spinner spinThass23 = (Spinner) findViewById(R.id.spinThass23);
            Spinner spinThass24 = (Spinner) findViewById(R.id.spinThass24);
            Spinner spinThass25 = (Spinner) findViewById(R.id.spinThass25);
            Spinner spinThass26 = (Spinner) findViewById(R.id.spinThass26);
            Spinner spinThass27 = (Spinner) findViewById(R.id.spinThass27);
            Spinner spinThass28 = (Spinner) findViewById(R.id.spinThass28);
            Spinner spinThass29 = (Spinner) findViewById(R.id.spinThass29);
            Spinner spinThass30 = (Spinner) findViewById(R.id.spinThass30);


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
            spinThass1.setAdapter(spinnerArrayAdapter);
        spinThass2.setAdapter(spinnerArrayAdapter);
        spinThass3.setAdapter(spinnerArrayAdapter);
        spinThass4.setAdapter(spinnerArrayAdapter);
        spinThass5.setAdapter(spinnerArrayAdapter);
        spinThass6.setAdapter(spinnerArrayAdapter);
        spinThass7.setAdapter(spinnerArrayAdapter);
        spinThass8.setAdapter(spinnerArrayAdapter);
        spinThass9.setAdapter(spinnerArrayAdapter);
        spinThass10.setAdapter(spinnerArrayAdapter);
        spinThass11.setAdapter(spinnerArrayAdapter);
        spinThass12.setAdapter(spinnerArrayAdapter);
        spinThass13.setAdapter(spinnerArrayAdapter);
        spinThass14.setAdapter(spinnerArrayAdapter);
        spinThass15.setAdapter(spinnerArrayAdapter);
        spinThass16.setAdapter(spinnerArrayAdapter);
        spinThass17.setAdapter(spinnerArrayAdapter);
        spinThass18.setAdapter(spinnerArrayAdapter);
        spinThass19.setAdapter(spinnerArrayAdapter);
        spinThass20.setAdapter(spinnerArrayAdapter);
        spinThass21.setAdapter(spinnerArrayAdapter);
        spinThass22.setAdapter(spinnerArrayAdapter);
        spinThass23.setAdapter(spinnerArrayAdapter);
        spinThass24.setAdapter(spinnerArrayAdapter);
        spinThass25.setAdapter(spinnerArrayAdapter);
        spinThass26.setAdapter(spinnerArrayAdapter);
        spinThass27.setAdapter(spinnerArrayAdapter);
        spinThass28.setAdapter(spinnerArrayAdapter);
        spinThass29.setAdapter(spinnerArrayAdapter);
        spinThass30.setAdapter(spinnerArrayAdapter);




        }
    }

