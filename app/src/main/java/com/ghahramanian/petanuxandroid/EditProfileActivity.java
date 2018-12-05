package com.ghahramanian.petanuxandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        String[] arraySpinnerGender = new String[] {
                "Male", "Female"
        };
        Spinner sGender = (Spinner) findViewById(R.id.spinnerGender);
        ArrayAdapter<String> adapterGender = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerGender);
        adapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sGender.setAdapter(adapterGender);

        String[] arraySpinnerAge = new String[] {
                "18", "19", "20", "21", "22"
        };
        Spinner sAge = (Spinner) findViewById(R.id.spinnerAge);
        ArrayAdapter<String> adapterAge = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerAge);
        adapterAge.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sAge.setAdapter(adapterAge);

        Button btnSaveChanges=findViewById(R.id.btnSaveChanges);
        btnSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditProfileActivity.this, ProfileActivity.class));
            }
        });
    }
}
