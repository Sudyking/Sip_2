package com.sipdemo.dell.sip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button Login_B , Clear_B;
    private EditText editSipIP,editUser,editPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login_B = (Button)findViewById(R.id.B_login);
        Button Clear_B = (Button)findViewById(R.id.B_Clear);
        final EditText editSipIP = (EditText)findViewById(R.id.editSIPIP);
        final EditText editUser = (EditText)findViewById(R.id.editUser);
        final EditText editPass = (EditText)findViewById(R.id.editPassword);
        Clear_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                editSipIP.setText("");
                editUser.setText("");
                editPass.setText("");
            }
        });
        Login_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                if (editSipIP.equals("192.168.1.1")){
                 if (editUser.equals("889")){
                  if (editPass.equals("123")){
                      Intent in = new Intent(MainActivity.this , HomeActivity.class);
                      startActivity(in);
                      finish();
                  }
                 }
                }
            }
        });


    }
}
