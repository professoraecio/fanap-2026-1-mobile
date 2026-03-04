package com.professoraecio.exemploradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup formaPgtoRadioGroup;
    TextView formaPgtoSelectTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formaPgtoRadioGroup = findViewById(R.id.formaPgtoRadioGroup);
        formaPgtoSelectTextView = findViewById(R.id.formaPgtoSelectTextView);

        formaPgtoRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                String opcao = radioButton.getText().toString();
                formaPgtoSelectTextView.setText(opcao);
            }
        });

    }
}