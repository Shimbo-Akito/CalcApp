package jp.techacademy.akito.shimbo.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        float result=0;
        Intent intent = getIntent();
        float value1 = intent.getFloatExtra("VALUE1", 0);
        float value2 = intent.getFloatExtra("VALUE2", 0);
        int symbol = intent.getIntExtra("symbol", 0);

        TextView textView = (TextView) findViewById(R.id.textview01);

        switch (symbol){
            case 0:
                textView.setText(String.valueOf(value1 + value2));
                break;
            case 1:
                textView.setText(String.valueOf(value1 - value2));
                break;
            case 2:
                textView.setText(String.valueOf(value1 * value2));
                break;
            case 3:
                textView.setText(String.valueOf(value1 / value2));
                break;

        }
    }
}
