package com.professoraecio.exemploutilsharedpreferences.persistencia;

import android.content.Context;

import com.professoraecio.exemploutilsharedpreferences.ENUM.DEFAULT_VALUES;
import com.professoraecio.exemploutilsharedpreferences.ENUM.SHARED_PREFERENCES;
import com.professoraecio.exemploutilsharedpreferences.util.UtilSharedPreferences;

public class Persistencia {

    public static void salvarUsuario(Context context,
                                     String usuario){
        UtilSharedPreferences.saveString(context,
                SHARED_PREFERENCES.USUARIO_KEY.chave, usuario);
    }

    public static String lerUsuario(Context context){
        return UtilSharedPreferences.getString(context,
                SHARED_PREFERENCES.USUARIO_KEY.chave,
                DEFAULT_VALUES.USUARIO_DEFAULT_VALUE.valor);
    }

}
