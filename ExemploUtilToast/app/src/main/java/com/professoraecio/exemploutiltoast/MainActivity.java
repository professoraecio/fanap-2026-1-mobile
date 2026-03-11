package com.professoraecio.exemploutiltoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.professoraecio.exemploutiltoast.util.UtilToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msgCurtaButtonAction(View view){
        UtilToast.msgCurta(this,"Oi rapidinho...");
    }

    public void msgLongaButtonAction(View view){
        UtilToast.msgLonga(this,"Msg vai demorar para sumir...");

    }

}