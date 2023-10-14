package com.example.colormixer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private CheckBox choice1;
    private CheckBox choice2;
    private CheckBox choice3;
    private Button mix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        mix = findViewById(R.id.mix);

        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Vérifiez quelles cases sont cochées
                String username = usernameEditText.getText().toString();
                boolean isChoice1Selected = choice1.isChecked();
                boolean isChoice2Selected = choice2.isChecked();
                boolean isChoice3Selected = choice3.isChecked();

                // Déterminez le choix de l'utilisateur et naviguez vers l'activité appropriée
                if (isChoice1Selected) {
                    // L'utilisateur a choisi "Choix 1", naviguez vers l'activité correspondante
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("choice1Selected", choice1.isChecked());
                    startActivity(intent);
                } else if (isChoice2Selected) {
                    // L'utilisateur a choisi "Choix 2", naviguez vers l'activité correspondante
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("choice2Selected", choice2.isChecked());
                    startActivity(intent);
                } else if (isChoice3Selected) {
                    // L'utilisateur a choisi "Choix 3", naviguez vers l'activité correspondante
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("choice3Selected", choice3.isChecked());
                    startActivity(intent);
                }
            }
        });
    }

}