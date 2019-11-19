package com.example.googleloginandanimation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class animation extends AppCompatActivity {

    Button sign_out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        sign_out = findViewById(R.id.signout);

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                //startActivity(new Intent(act_menu.this,MainActivity.class));
                Intent i = new Intent(animation.this, MainActivity.class);
                startActivity(i);
                finish();
                Toast.makeText(animation.this,"Cierre de sesion Exitoso!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
