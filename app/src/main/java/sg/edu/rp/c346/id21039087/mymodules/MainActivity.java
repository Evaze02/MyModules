package sg.edu.rp.c346.id21039087.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView FirstModule;
    TextView SecondModule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstModule = findViewById(R.id.C346);
        SecondModule = findViewById(R.id.C349);



        FirstModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });

        SecondModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondModule.class);
                intent.putExtra("Module Code", "C349");
                intent.putExtra("Module Name", "Ipad Programming");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W66L");
                startActivity(intent);

            }
        });







    }
}