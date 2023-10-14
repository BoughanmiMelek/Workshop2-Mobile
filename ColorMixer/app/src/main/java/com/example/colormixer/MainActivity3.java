package com.example.colormixer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView messageTextView;
    private TextView resultMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        messageTextView = findViewById(R.id.messageTextView);

        // Définissez le message que vous souhaitez afficher
        String message = "correct";
        messageTextView.setText(message);
    }
}