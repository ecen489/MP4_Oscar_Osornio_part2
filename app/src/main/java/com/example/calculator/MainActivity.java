package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText eView1 = (EditText) findViewById(R.id.editText1);
        EditText eView2 = (EditText) findViewById(R.id.editText2);
        TextView tView1 = (TextView) findViewById(R.id.textView);
        String f1 = eView1.getText().toString();
        Float f2 = Float.parseFloat(f1);
        String f3 = eView2.getText().toString();
        Float f4 = Float.parseFloat(f3);

        Float r = f2 + f4;
        String result = r.toString();

        tView1.setText(result);
    }

    public void subtract(View view) {
        EditText eView1 = (EditText) findViewById(R.id.editText1);
        EditText eView2 = (EditText) findViewById(R.id.editText2);
        TextView tView1 = (TextView) findViewById(R.id.textView);
        String f1 = eView1.getText().toString();
        Float f2 = Float.parseFloat(f1);
        String f3 = eView2.getText().toString();
        Float f4 = Float.parseFloat(f3);

        Float r = f2 - f4;
        String result = r.toString();

        tView1.setText(result);
    }

    public void multiply(View view) {
        EditText eView1 = (EditText) findViewById(R.id.editText1);
        EditText eView2 = (EditText) findViewById(R.id.editText2);
        TextView tView1 = (TextView) findViewById(R.id.textView);
        String f1 = eView1.getText().toString();
        Float f2 = Float.parseFloat(f1);
        String f3 = eView2.getText().toString();
        Float f4 = Float.parseFloat(f3);

        Float r = f2 * f4;
        String result = r.toString();

        tView1.setText(result);
    }
}
