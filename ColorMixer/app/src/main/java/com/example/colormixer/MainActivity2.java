package com.example.colormixer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView resultMessageTextView;
    private Button submitButton;
    private CheckBox choice11;
    private CheckBox choice22;
    private CheckBox choice33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultMessageTextView = findViewById(R.id.resultMessageTextView);
        submitButton = findViewById(R.id.submitButton);

        // Récupérez les états des cases à cocher depuis l'Intent de la dernière activité
        Intent intent = getIntent();
        boolean isChoice1Selected = choice11.isSelected();
        boolean isChoice2Selected = choice22.isSelected();
        boolean isChoice3Selected = choice33.isSelected();

        // Créez un message en fonction des choix
        String message = "Vous avez choisi : ";
        if (isChoice1Selected && isChoice2Selected) {
            message += "blue et rouge ";
        }
        else if (isChoice1Selected && isChoice3Selected) {
            message += "blue et Jaune ";
        }
        else if (isChoice2Selected && isChoice3Selected) {
            message += "rouge et jaune ";
        }


        // Affichez le message
        resultMessageTextView.setText(message);

        // Définissez un OnClickListener pour le bouton "Submit" pour passer à l'activité suivante
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Naviguez vers l'activité suivante
                Intent nextIntent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(nextIntent);
            }
        });
    }
}