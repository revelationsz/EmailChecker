package com.example.emailchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email = findViewById(R.id.editTextTextEmailAddress);
                String em = email.getText().toString();
                System.out.println(em);
                TextView label = findViewById(R.id.lable);
                if(checkEmail(em)){
                    label.setText("VALID");
                } else {
                    label.setText("INVALID");
                }
            }
        });

    }

    public boolean checkEmail(String email) {
        System.out.println(email);
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@') return true;
        }
        return false;
    }
}