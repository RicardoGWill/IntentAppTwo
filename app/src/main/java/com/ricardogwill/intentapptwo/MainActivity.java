package com.ricardogwill.intentapptwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToIntentAppOneImplicitIntent(View view) {
        Intent implicitIntentToAppOne = new Intent("com.ricardogwill.intentappone");
        startActivity(implicitIntentToAppOne);
    }

}
