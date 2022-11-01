package com.example.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {
    // begining of SharedPref
    private final SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context mContext){
        this.mSharedPreferences = mContext.getSharedPreferences("FestaFimAno", Context.MODE_PRIVATE);
    }                                                           // Name of Shared, Private is only for the app
    public void storeString(String Key, String Value){          // Public is all the apps can access this data
        this.mSharedPreferences.edit().putString(Key, Value).apply(); // Save data in a KEY
    }
    public String getStoredString(String Key) {                       // Load Data by the KEY
        return this.mSharedPreferences.getString(Key, "");      // if Key not found = Defaut Value is null
    }
}
