package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class user_reg7 extends AppCompatActivity {
Button btn;
TextView ftv;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg7);
        getSupportActionBar().hide();
        ftv = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.btn);

        Intent intent = getIntent();
        String fname = intent.getStringExtra(user_reg6.fnam4);
        String lname = intent.getStringExtra(user_reg6.lnam4);
        String bday = intent.getStringExtra(user_reg6.dp4);
        String gender = intent.getStringExtra(user_reg6.fgender2);
        String email = intent.getStringExtra(user_reg6.Email);
        String ph = intent.getStringExtra(user_reg6.phno);
        String pass = intent.getStringExtra(user_reg6.password);

        final String username="";
        if (email != null)
        {
            email= username.toString();
        }
        else {
            ph = username.toString();
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ftv.setText("First Name:\t" + fname + "Last Name:\t" + lname + "\nBirthday:\t" + bday + "\nGender:\t" + gender + "\nusername:\t" + username  + "\nPassword:\t" + pass);
                //  startActivity(new Intent(user_reg7.this,home.class));
                // Toast.makeText(user_reg7.this, "Registered success", Toast.LENGTH_SHORT).show();

            }
        });
    }
}