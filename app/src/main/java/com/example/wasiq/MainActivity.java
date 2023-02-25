package com.example.wasiq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button butn1, butn2, butn3, butn4, butn5, butn6, butn7;
    int counter;
    TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"App is successfully started!", Toast.LENGTH_SHORT).show();
        txt1=(TextView) findViewById(R.id.txt1);
        txt2=(TextView) findViewById(R.id.plaintext);

        butn1=(Button) findViewById(R.id.btn1);
        butn1.setOnClickListener(this);

        butn2=(Button) findViewById(R.id.btn2);
        butn2.setOnClickListener(this);

        butn3=(Button) findViewById(R.id.btn3);
        butn3.setOnClickListener(this);

        butn4=(Button) findViewById(R.id.btn4);
        butn4.setOnClickListener(this);

        butn5=(Button) findViewById(R.id.btn5);
        butn5.setOnClickListener(this);

        butn6=(Button) findViewById(R.id.btn6);
        butn6.setOnClickListener(this);

        butn7=(Button) findViewById(R.id.btn7);
        butn7.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
    switch (view.getId())
    {
        case R.id.btn1:
            txt1.setText(""+"Tasbeeh Fatima");
            counter = 0;
            txt2.setText(""+counter);
            break;

        case R.id.btn2:
            txt1.setText(""+"1st KALMA 100 TIMES");
            counter = 0;
            txt2.setText(""+counter);
            break;

        case R.id.btn3:
            txt1.setText(""+"ASTAGHFAR 100 TIMES");
            counter = 0;
            txt2.setText(""+counter);
            break;

        case R.id.btn4:
            txt1.setText(""+"DAROOD 100 TIMES");
            counter = 0;
            txt2.setText(""+counter);
            break;

        case R.id.btn5:
            txt1.setText(""+"AYAT E KAREEMA 100 TIMES");
            counter = 0;
            txt2.setText(""+counter);
            break;

        case R.id.btn6:
            txt1.setText(""+"SELECT  TASBEEH");
            counter = 0;
            txt2.setText(""+0);
            break;

        case R.id.btn7:
            counter++;
            if(counter<=100)
            {
                txt2.setText(""+counter);
            } else if (counter>100)
            {
                Toast.makeText(getApplicationContext(),"Tasbeeh is compleated 100 times! Please reset", Toast.LENGTH_SHORT).show();
            }
            break;
    };
    }
}