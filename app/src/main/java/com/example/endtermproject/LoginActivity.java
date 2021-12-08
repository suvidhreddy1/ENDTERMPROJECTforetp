package com.example.endtermproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    EditText ed1,ed2;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1=findViewById(R.id.edt1);
        ed2=findViewById(R.id.edt2);
        mAuth=FirebaseAuth.getInstance();

    }

    public void login(View view) {



        String passwordd =ed2.getText().toString();
        String name = ed1.getText().toString();
        if (TextUtils.isEmpty(name)){
            Toast.makeText(this, "Enter Email.Id", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(passwordd)){
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (passwordd.length() < 6){
            Toast.makeText(this,"Password is short", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.signInWithEmailAndPassword(name,passwordd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(LoginActivity.this,"Login successfull", Toast.LENGTH_SHORT).show();
                    LayoutInflater i = getLayoutInflater();
                    View l = i.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custmto1));
                    TextView tv = l.findViewById(R.id.cstmtxt1);
                    tv.setText(name);
                    Toast t = new Toast(getApplicationContext());
                    t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    t.setDuration(Toast.LENGTH_LONG);
                    t.setView(l);
                    t.show();
                    Intent intent = new Intent(getApplicationContext(), Types.class);
                    intent.putExtra("RNAME",name);
                    startActivity(intent);
                    startActivity(new Intent(LoginActivity.this,Types.class));
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Login Unsuccessful"+task.getException(),Toast.LENGTH_SHORT).show();
                }

            }
        });



    }

    public void signin(View v1) {
        Toast.makeText(LoginActivity.this, "Register User", Toast.LENGTH_SHORT).show();
        Intent intent122 = new Intent(this,Signin.class);
        startActivity(intent122);
    }
}