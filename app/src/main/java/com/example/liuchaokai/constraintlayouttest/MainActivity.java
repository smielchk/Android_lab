package com.example.liuchaokai.constraintlayouttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText accountEdit;
    private EditText passwordEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accountEdit = (EditText) findViewById(R.id.editSnumber);
        passwordEdit = (EditText) findViewById(R.id.editPassword);
        Button login = (Button) findViewById(R.id.button);
        Button signup = (Button) findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener()
          {
              @Override
              public void onClick(View view) {
                  String account = accountEdit.getText().toString();
                  String password = passwordEdit.getText().toString();
                  //Toast.makeText(MainActivity.this,"You click the signin button!",Toast.LENGTH_SHORT).show();
                  if(account.equals("15352223") && password.equals("123456"))
                  {
                      Intent intent = new Intent(MainActivity.this,Login.class);
                      startActivity(intent);
                      finish();
                  }
                  else
                  {
                      Toast.makeText(MainActivity.this,"account or password is invalid",Toast.LENGTH_SHORT).show();
                  }
              }
          }
        );
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ecampus.sysu.edu.cn/jwglxt/"));
                startActivity(intent);
                Toast.makeText(MainActivity.this,"You clickthe signup button!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
