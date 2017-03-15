package jp.techacademy.akito.shimbo.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textview1;
    EditText edittext1;
    EditText edittext2;

    float value1, value2;
    String text1;
    String text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.plus);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.minus);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.multiply);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.devide);
        button4.setOnClickListener(this);

        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);

        textview1 = (TextView) findViewById(R.id.textview01);
        Log.d("JAVATEST", String.valueOf(R.id.plus));
        Log.d("JAVATEST", String.valueOf(button1.getId()));
    }

    @Override
    public void onClick (View view) {
        text1 = edittext1.getText().toString();
        value1 = Float.parseFloat(text1);
        text2 = edittext2.getText().toString();
        value2 = Float.parseFloat(text2);

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("VALUE1", value1);
        intent.putExtra("VALUE2", value2);
        if(view.getId() == R.id.plus) {
            intent.putExtra("symbol", 0);
            startActivity(intent);
        } else if(view.getId() == R.id.minus) {
            intent.putExtra("symbol", 1);
            startActivity(intent);
        } else if(view.getId() == R.id.multiply) {
            intent.putExtra("symbol", 2);
            startActivity(intent);
        } else if(view.getId() == R.id.devide) {
            intent.putExtra("symbol", 3);
            startActivity(intent);
        }
    }
}
