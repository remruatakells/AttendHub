package com.attendhub.bca;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        txt1 = findViewById(R.id.textView);
        
        txt1.setOnClickListener(v -> {
            txt1Click();
        });

    }

    private void txt1Click() {
        Toast.makeText(this, "Text View Clicked", Toast.LENGTH_SHORT).show();
    }
}