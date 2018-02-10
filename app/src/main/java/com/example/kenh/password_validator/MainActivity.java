package com.example.kenh.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Validator val= new Validator();
    Button  button = null;
    EditText editText = null;
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                                        String pass = editText.getText().toString();
                                        if(val.validate(pass)==5){
                                                textView.setText("Sufficiently strong password");
                                        } else {
                                                textView.setText("Password is not strong enough");
                                        }
            }});
    }
}
