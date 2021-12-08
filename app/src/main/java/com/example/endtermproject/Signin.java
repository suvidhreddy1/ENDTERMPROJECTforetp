package com.example.endtermproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signin extends AppCompatActivity {
    EditText fname,uname,password;
    Button b1;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        fname =findViewById(R.id.namedt1);
        uname=findViewById(R.id.usredt1);
        password=findViewById(R.id.passedt1);
        mAuth=FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(Signin.this,Types.class));
            finish();

        }

    }


    public void Signinnnn(View view) {
        String namee =fname.getText().toString();
        String mail = uname.getText().toString();
        String passworde =password.getText().toString();
        if (TextUtils.isEmpty(namee)){
            Toast.makeText(getApplicationContext(), "Enter Name", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(mail)){
            Toast.makeText(getApplicationContext(), "Enter Email.Id", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(passworde)){
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (passworde.length() < 6){
            Toast.makeText(getApplicationContext(),"Password is short", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(mail,passworde).addOnCompleteListener(Signin.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful())
                {
                    Toast.makeText(Signin.this,"You are successfully Registered", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Signin.this,Types.class));
                }
                else
                {
                    Toast.makeText(Signin.this,"You are not Registered! Try again"+task.getException(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}