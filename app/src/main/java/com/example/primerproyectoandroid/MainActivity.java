package com.example.primerproyectoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enter = findViewById(R.id.btnEnter);
        enter.setOnClickListener(v ->
                Toast.makeText(this, getString(R.string.welcome), Toast.LENGTH_SHORT).show()
        );
    }
}
