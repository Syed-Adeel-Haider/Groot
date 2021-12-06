package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class user_reg6 extends AppCompatActivity {
Button btnNext;
EditText editText,editText1;
public static final String password ="groot.com.password";
    public static final String Email="groot.com.email";
    public static final String phno="groot.com.phone";
    public static final String fgender2 ="groot.com.gender";
    public static final String dp4 = "dd-MM-yyyy";
    public static final String fnam4 ="groot.com.firstname";
    public static final String lnam4 ="groot.com.lastname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg6);
        getSupportActionBar().hide();
        editText = (EditText) findViewById(R.id.editText);
        editText1 = (EditText) findViewById(R.id.editText1);
        String pass = editText.getText().toString();
        btnNext = (Button) findViewById(R.id.btnNext);

        Intent intent = getIntent();
        String fname = intent.getStringExtra(user_reg5.fnam3);
        String lname = intent.getStringExtra(user_reg5.lnam3);
        String bday = intent.getStringExtra(user_reg5.dp3);
        String gender = intent.getStringExtra(user_reg5.fgender1);
        String email = intent.getStringExtra(user_reg5.femail);
        String mobile = intent.getStringExtra(user_reg4.mbno);

        btnNext.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (editText.getText().toString().equals(editText1.getText().toString())){
        Intent i = new Intent(user_reg6.this,user_reg7.class);
            i.putExtra(password,pass);
            i.putExtra(Email, email);
            i.putExtra(phno, mobile);
            i.putExtra(fgender2,gender);
            i.putExtra(dp4,bday);
            i.putExtra(fnam4,fname);
            i.putExtra(lnam4,lname);
        startActivity(i);
        }
    }
});
    }
}