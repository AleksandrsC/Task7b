package com.accenture.task7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText replies;
    EditText questions;
    Button send;

    public void sendAction(View view){
        String q=questions.getText().toString();
        replies.setText(replies.getText().toString()+"\n"+q+"\n"+"Sorry, I don't know.|");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //controls init
        replies = findViewById(R.id.replies);
        questions = findViewById(R.id.question);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendAction(view);
            }
        });
        //questions.on

    }
}