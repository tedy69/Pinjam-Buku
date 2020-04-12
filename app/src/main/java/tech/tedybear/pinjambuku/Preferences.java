package tech.tedybear.pinjambuku;

import android.content.Context;
import android.content.SharedPreferences;

/*
 * Created by Mochammad Tedy Fazrin on 4/12/20 7:36 PM
 * Copyright (c) 2020 . All rights reserved.
 */

public class Preferences {
    public static final String SP_HIDOC = "spHidoc";

    public static final String SP_NAMA = "spNama";
    public static final String SP_NOMOR = "spNomor";

    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public Preferences(Context context) {
        sp = context.getSharedPreferences(SP_HIDOC, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPString(String keySP, String value) {
        spEditor.putString(keySP, value);
        spEditor.commit();
    }

    public void saveSPInt(String keySP, int value) {
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value) {
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public String getSPNama() {
        return sp.getString(SP_NAMA, "");
    }

    public String getSPNomor() {
        return sp.getString(SP_NOMOR, "");
    }

    public Boolean getSPSudahLogin() {
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }
}
