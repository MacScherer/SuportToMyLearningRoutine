package com.example.sharedpreferencesexemplo;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "switch1";

    private String text;
    private boolean switchOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewholder.textViewCaption = findViewById(R.id.textViewCaption);
        this.mViewholder.textViewField = findViewById(R.id.editTextTextField);
        this.mViewholder.buttonApplyText = findViewById(R.id.buttonApplyText);
        this.mViewholder.buttonSaveText = findViewById(R.id.buttonSaveData);
        this.mViewholder.switchSave = findViewById(R.id.switchSaveOnOff);

        this.mViewholder.buttonApplyText.setOnClickListener(this);
        this.mViewholder.buttonSaveText.setOnClickListener(this);

        loadData();
        updateViews();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.buttonApplyText):
                this.mViewholder.textViewCaption.setText(this.mViewholder.textViewField.getText().toString());
                break;

            case (R.id.buttonSaveData):
                saveData();
                break;

            default:
                break;
        }
    }

    public void saveData() {
        // Inicialyzing the class SharedPref to save
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, this.mViewholder.textViewField.getText().toString());
                        // TEXT = KEY + VALUE
        editor.putBoolean(SWITCH1, this.mViewholder.switchSave.isChecked());
        
        editor.apply();
        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }
    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        // 2 var to load our key
        text = sharedPreferences.getString(TEXT, "");
        switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
    }

    public void updateViews(){
        this.mViewholder.textViewCaption.setText(text);
        this.mViewholder.switchSave.setChecked(switchOnOff);
    }

    private static class ViewHolder{
        TextView textViewCaption;
        EditText textViewField;
        Button buttonApplyText;
        Button buttonSaveText;
        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch switchSave;
    }

    private final ViewHolder mViewholder = new ViewHolder();

}
