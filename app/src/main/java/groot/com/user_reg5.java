package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class user_reg5 extends AppCompatActivity {
EditText editText;
Button btnNext;
    public static final String femail="groot.com.email";
    public static final String fgender1 ="groot.com.gender";
    public static final String dp3 = "dd-MM-yyyy";
    public static final String fnam3 ="groot.com.firstname";
    public static final String lnam3 ="groot.com.lastname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg5);
        getSupportActionBar().hide();
        editText =(EditText) findViewById(R.id.editText);
        String email = editText.getText().toString();
        btnNext = (Button) findViewById(R.id.btnNext);

        Intent intent = getIntent();
        String fname = intent.getStringExtra(user_reg3.fnam2);
        String lname = intent.getStringExtra(user_reg3.lnam2);
        String bday = intent.getStringExtra(user_reg3.dp2);
        String gender = intent.getStringExtra(user_reg3.fgender);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(user_reg5.this,user_reg6.class);
                i.putExtra(femail,email);
                i.putExtra(fgender1,gender);
                i.putExtra(dp3,bday);
                i.putExtra(fnam3,fname);
                i.putExtra(lnam3,lname);
                startActivity(i);

            }
        });
    }
}