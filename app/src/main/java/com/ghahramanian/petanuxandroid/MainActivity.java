package com.ghahramanian.petanuxandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivation=findViewById(R.id.btnActivation);
        btnActivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),ActivationActivity.class));
            }
        });

        Button btnChangePassword=findViewById(R.id.btnChangePassword);
        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),ChangePasswordActivity.class));
            }
        });
        Button btnDiscover=findViewById(R.id.btnDiscover);
        btnDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),DiscoverActivity.class));
            }
        });
        Button btnEditProfile=findViewById(R.id.btnEditProfile);
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),EditProfileActivity.class));
            }
        });
        Button btnFirstRun=findViewById(R.id.btnFirstRun);
        btnFirstRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),FirstRunActivity.class));
            }
        });
        Button btnItemDetails=findViewById(R.id.btnItemDetails);
        btnItemDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),ItemDetailsActivity.class));
            }
        });
        Button btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),LoginActivity.class));
            }
        });
        Button btnMap=findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),MapActivity.class));
            }
        });
        Button btnNewsFeed=findViewById(R.id.btnNewsFeed);
        btnNewsFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),NewsFeedActivity.class));
            }
        });
        Button btnProfile=findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),ProfileActivity.class));
            }
        });
        Button btnSignUp=findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),SignupActivity.class));
            }
        });
        Button btnStoreProfile=findViewById(R.id.btnStoreProfile);
        btnStoreProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),StoreProfileActivity.class));
            }
        });
        Button btnWelcome=findViewById(R.id.btnWelcome);
        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),WelcomeActivity.class));
            }
        });
    }
}
