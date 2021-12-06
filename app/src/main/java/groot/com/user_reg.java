package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class user_reg extends AppCompatActivity {
Button btn;
EditText etfname,etlname;
public static final String fnam ="groot.com.firstname";
public static final String lnam ="groot.com.lastname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg);
        getSupportActionBar().hide();
        etfname =(EditText) findViewById(R.id.etfname);
        etlname =(EditText) findViewById(R.id.etlname);
        btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(user_reg.this,user_reg2.class);
                String fname = etfname.getText().toString();
                i.putExtra(fnam,fname);
                String lname = etlname.getText().toString();
                i.putExtra(lnam,lname);

                startActivity(i);

            }
        });
    }
}