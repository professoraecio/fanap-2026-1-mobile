package com.professoraecio.exemplodatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.professoraecio.exemplodatepicker.util.UtilDate;

public class MainActivity extends AppCompatActivity {

    TextView dataEscolhidaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataEscolhidaTextView = findViewById(R.id.dataEscolhidaTextView);

    }

    public void escolherDataButtonAction(View view){
        UtilDate utilDate = new UtilDate();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
                // bug fix mes
                mes++;
                dataEscolhidaTextView.setText("" + dia + "/" + mes + "/" + ano);
            }
        }, utilDate.getAnoAtual(),utilDate.getMesAtual() ,utilDate.getDiaAtual() );
        datePickerDialog.show();
    }

}