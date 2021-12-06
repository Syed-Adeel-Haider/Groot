package groot.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class user_reg2 extends AppCompatActivity {
Button btn;
DatePicker dp;
public static final String dp1 = "dd-MM-yyyy";
public static final String fnam1 ="groot.com.firstname";
public static final String lnam1 ="groot.com.lastname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg2);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        String fname1 = intent.getStringExtra(user_reg.fnam);
        String lname1 = intent.getStringExtra(user_reg.lnam);

        btn =(Button) findViewById(R.id.btn);
        dp = (DatePicker) findViewById(R.id.dp);
        int day = dp.getDayOfMonth();
        int month = dp.getMonth();
        int year = dp.getYear();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formateddate = sdf.format(calendar.getTime());


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(user_reg2.this,user_reg3.class);
                i.putExtra(dp1,formateddate);
                i.putExtra(fnam1,fname1);
                i.putExtra(lnam1,lname1);
                startActivity(i);

            }
        });
    }
}