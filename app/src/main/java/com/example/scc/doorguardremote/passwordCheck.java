package com.example.scc.doorguardremote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class passwordCheck extends AppCompatActivity {
    String password = "abc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_check);
    }

    public void login(View view)
    {

        EditText e11=(EditText)findViewById(R.id.e1);
        String s = e11.getText().toString();

        if ( s.equals(password))
        {
            Toast.makeText(getApplicationContext(),"PAssword matched",Toast.LENGTH_LONG).show();
            Intent w = new Intent (this, PairedDevice.class);
            startActivity(w);

        }
        else
        {
            Toast.makeText(getApplicationContext(),"PAssword  not matched",Toast.LENGTH_LONG).show();

        }
    }

}
