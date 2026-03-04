package com.professoraecio.exemplocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gorjetaTextView;
    CheckBox gorjetaCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gorjetaTextView = findViewById(R.id.gorjetaTextView);
        gorjetaCheckBox = findViewById(R.id.gorjetaCheckBox);

        gorjetaTextView.setText("Modo de pagamento: Sem gorjeta");
        gorjetaCheckBox.setText("Gorjeta");

        gorjetaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    gorjetaTextView.setText("Modo de pagamento: Com gorjeta");
                }else{
                    gorjetaTextView.setText("Modo de pagamento: Sem gorjeta");
                }
            }
        });
    }
}