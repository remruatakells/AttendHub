package com.attendhub.bca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.test_btn);
        
        btn1.setOnClickListener(v -> {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
        });

    }

    private void btn1Click() {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
}