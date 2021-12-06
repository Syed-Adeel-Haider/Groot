package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class user_reg3 extends AppCompatActivity {
Button btnNext,btnNext1;
RadioButton malerb1,fmalerb1,customrb1;
RadioGroup radioGroup;
public static final String fgender ="groot.com.gender";
    public static final String dp2 = "dd-MM-yyyy";
    public static final String fnam2 ="groot.com.firstname";
    public static final String lnam2 ="groot.com.lastname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg8);
        getSupportActionBar().hide();
        malerb1 = (RadioButton) findViewById(R.id.malerb);
        fmalerb1 = (RadioButton) findViewById(R.id.fmalerb);
        customrb1 = (RadioButton) findViewById(R.id.customrb);
        radioGroup=(RadioGroup) findViewById(R.id.rg);

        Intent intent = getIntent();
        String fname = intent.getStringExtra(user_reg2.fnam1);
        String lname = intent.getStringExtra(user_reg2.lnam1);
        String bday = intent.getStringExtra(user_reg2.dp1);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext1 = (Button) findViewById(R.id.btnNext1);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String gen = gender();
                Intent i = new Intent(user_reg3.this,user_reg4.class);

                i.putExtra(fgender,gen);
                i.putExtra(dp2,bday);
                i.putExtra(fnam2,fname);
                i.putExtra(lnam2,lname);

                startActivity(i);
            }
        });
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String gen = gender();
                Intent i = new Intent(user_reg3.this,user_reg5.class);

                i.putExtra(fgender,gen);
                i.putExtra(dp2,bday);
                i.putExtra(fnam2,fname);
                i.putExtra(lnam2,lname);

                startActivity(i);
            }
        });

    }
    private String gender() {
        String gender="";
        if (malerb1.isChecked())
            gender = malerb1.getText().toString();
        else if (fmalerb1.isChecked())
            gender = fmalerb1.getText().toString();
        else if (customrb1.isChecked())
            gender = customrb1.getText().toString();
        return gender;
    }
}