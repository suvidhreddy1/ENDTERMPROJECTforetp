package com.example.endtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Products extends AppCompatActivity {
    TextView[] tb =new TextView[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        tb[0]=(TextView)findViewById(R.id.tb1);
        tb[1]=(TextView)findViewById(R.id.tb2);
        tb[2]=(TextView)findViewById(R.id.tb3);
        tb[3]=(TextView)findViewById(R.id.tb4);
        tb[4]=(TextView)findViewById(R.id.tb5);
        tb[5]=(TextView)findViewById(R.id.tb6);
        tb[6]=(TextView)findViewById(R.id.tb7);
        tb[7]=(TextView)findViewById(R.id.tb8);
        tb[8]=(TextView)findViewById(R.id.tb9);

    }
    public void ss1(View view) {
        String srt= tb[0].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(0,prc,nam);
    }

    public void ss2(View view) {
        String srt= tb[1].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(1,prc,nam);
    }

    public void ss3(View view) {
        String srt= tb[2].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(2,prc,nam);
    }

    public void ss4(View view) {
        String srt= tb[3].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(3,prc,nam);
    }

    public void ss5(View view) {
        String srt= tb[4].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(4,prc,nam);
    }

    public void ss6(View view) {
        String srt= tb[5].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(5,prc,nam);
    }

    public void ss7(View view) {
        String srt= tb[6].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(6,prc,nam);
    }

    public void ss8(View view) {
        String srt= tb[7].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(7,prc,nam);
    }

    public void ss9(View view) {
        String srt= tb[8].getText().toString();
        String nam=getName(srt);
        String prc=getPrice(srt);
        Toast.makeText(this, "Item Successfully added to your cart,\nProduct Name-"+nam+"\nBest Price: "+prc, Toast.LENGTH_LONG).show();
        SaveData.productInc(8,prc,nam);
    }
    public String getPrice(String s)
    {
        String arg[] = s.split(" ");
        return arg[arg.length-2];
    }
    public String getName(String s)
    {
        String arg[] = s.split(" ");
        String res="";
        int i=arg.length-3;
        for(int j=0;j<i;j++)
        {
            res+=arg[j]+" ";
        }
        return res;
    }

}