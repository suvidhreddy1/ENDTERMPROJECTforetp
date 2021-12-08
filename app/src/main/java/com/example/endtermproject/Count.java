package com.example.endtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Count extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        setItem();
    }
    public void setItem()
    {

        int ttlamt=0;
        tv1=(TextView)findViewById(R.id.textView4);
        tv2=(TextView)findViewById(R.id.textView5);
        tv3=(TextView)findViewById(R.id.textView6);
        tv4=(TextView)findViewById(R.id.textView10);
        for(int i=0;i<12;i++)
        {

            if(SaveData.getQunty(i)>0)
            {
                int pr=SaveData.getPrice(i);
                String name =SaveData.getPdtName(i);
                name+="\n";
                int qua=SaveData.getQunty(i);
                tv1.append(name);
                tv2.append(""+qua+"*"+pr+"\n");
                tv3.append(""+(qua*pr)+"\n");
                ttlamt+=(qua*pr);



            }
            tv4.setText(""+ttlamt+"Rs");
        }
    }

    public void ordeer(View view) {
        Intent intent22=new Intent(Count.this,Types.class);
        Toast.makeText(getApplicationContext(),"Order Placed Successfully",Toast.LENGTH_LONG).show();

        startActivity(intent22);
    }
}