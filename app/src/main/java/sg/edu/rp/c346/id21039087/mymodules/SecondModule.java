package sg.edu.rp.c346.id21039087.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondModule extends AppCompatActivity {


    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvAcadYr;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_module);

        tvModuleCode = findViewById(R.id.C346);
        tvModuleName = findViewById(R.id.C349);
        tvAcadYr = findViewById(R.id.textView3);
        tvSem = findViewById(R.id.textView4);
        tvCredit = findViewById(R.id.textView5);
        tvVenue = findViewById(R.id.textView6);



        Intent intentReceived = getIntent();

        tvModuleCode.setText("Module Code: " + intentReceived.getStringExtra("Module Code"));
        tvModuleName.setText("Module Name: " + intentReceived.getStringExtra("Module Name"));
        tvAcadYr.setText("Academic Year: " + intentReceived.getStringExtra("Academic Year"));
        tvSem.setText("Semester: " + intentReceived.getIntExtra("Semester", 1));
        tvCredit.setText("Module Credit: " + intentReceived.getIntExtra("Credit", 4));
        tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));

    }
}