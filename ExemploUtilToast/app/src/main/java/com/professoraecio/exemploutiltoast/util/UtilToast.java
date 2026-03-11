package com.professoraecio.exemploutiltoast.util;

import android.content.Context;
import android.widget.Toast;

public class UtilToast {

    public static void showToast(Context context,
                                 String mensagem,
                                 int duracaoMensagem){
        Toast.makeText(context,mensagem,duracaoMensagem).show();
    }

    public static void msgCurta(Context context,String mensagem){
        showToast(context,mensagem,Toast.LENGTH_SHORT);
    }

    public static void msgLonga(Context context,String mensagem){
        showToast(context,mensagem,Toast.LENGTH_LONG);
    }

}
