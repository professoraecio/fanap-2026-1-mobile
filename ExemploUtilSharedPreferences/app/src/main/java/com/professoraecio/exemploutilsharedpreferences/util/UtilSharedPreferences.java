package com.professoraecio.exemploutilsharedpreferences.util;

import android.content.Context;
import android.content.SharedPreferences;

public class UtilSharedPreferences {

    // Definindo o nome do banco de dados a salvar os dados
    private static final String PREFERENCE_NAME = "MyPreferences";

    // Salvar o dado (String)
    public static void saveString(Context context,
                                  String key,
                                  String value){
        SharedPreferences
                sharedPreferences =
                context.getSharedPreferences(PREFERENCE_NAME,
                        Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply(); // salvando dados...
    }

    // Recuperar o dado (String)
    public static String getString(Context context,
                                   String key,
                                   String defaultValue){
        SharedPreferences
                sharedPreferences =
                context.getSharedPreferences(PREFERENCE_NAME,
                        Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,defaultValue);
    }
}
