package com.comptech.login.pubgtournament;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText et_username,et_userid,et_email,et_phone,et_pass,et_conpass,et_ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et_username=(EditText)findViewById(R.id.username);
        et_userid=(EditText)findViewById(R.id.user_id);
        et_email=(EditText)findViewById(R.id.email);
        et_phone = (EditText)findViewById(R.id.phone);
        et_pass=(EditText)findViewById(R.id.pass);
        et_conpass = (EditText)findViewById(R.id.con_pass);
        et_ref =(EditText)findViewById(R.id.referral);

    }
    public void doSignup(View v){
        String username = et_username.getText().toString();
        String pubg_id = et_userid.getText().toString();
        String email = et_email.getText().toString();
        String phone = et_phone.getText().toString();
        String pass = et_pass.getText().toString();
        String con_pass = et_conpass.getText().toString();
        String referral = et_ref.getText().toString();
        String method = "register";

        if(username.matches("") || pubg_id .matches("") || email.matches("") || phone.matches("") || pass.matches("") ||con_pass.matches("") )
        {
            Toast.makeText(getApplicationContext(),"Please fill all the fields",Toast.LENGTH_SHORT).show();
        }
        else if (!pass.equals(con_pass)) {
            Toast.makeText(getApplicationContext(),"Password are not same",Toast.LENGTH_SHORT).show();

        } else {

            Backgroundtask backgroundtask = new Backgroundtask(this);
            backgroundtask.execute(method,username,pubg_id,email,phone,pass,referral);

        }


    }
}