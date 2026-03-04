package com.professoraecio.exemploswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout activity_main;
    Switch darkModeSwitch;
    Switch notificacoesSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = findViewById(R.id.activity_main);
        darkModeSwitch = findViewById(R.id.darkModeSwitch);
        notificacoesSwitch = findViewById(R.id.notificacoesSwitch);

        darkModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    activity_main.setBackgroundColor(Color.GRAY);
                    darkModeSwitch.setText(R.string.label_ligado);
                }else{
                    activity_main.setBackgroundColor(Color.WHITE);
                    darkModeSwitch.setText(R.string.label_desligado);
                }
            }
        });

        notificacoesSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    notificacoesSwitch.setText(R.string.label_ligado);
                    Toast.makeText(MainActivity.this,
                                      "Notificar!",
                                           Toast.LENGTH_LONG).show();
                }else{
                    notificacoesSwitch.setText(R.string.label_desligado);
                    Toast.makeText(MainActivity.this,
                                      "Não Notificar!",
                                           Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}