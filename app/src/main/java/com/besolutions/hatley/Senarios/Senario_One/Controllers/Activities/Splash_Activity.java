package com.besolutions.hatley.Senarios.Senario_One.Controllers.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.besolutions.hatley.R;
import com.besolutions.hatley.Utils.TinyDB;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Activity extends AppCompatActivity {

    TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run()
            {

                    Intent intent = new Intent(getApplicationContext(), Sign_In_Activity.class);
                    startActivity(intent);

            }
        };
        new Timer().schedule(timerTask, 3000);

    }

    @Override
    protected void onResume() {

        super.onResume();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run()
            {

                Intent intent = new Intent(getApplicationContext(), Sign_In_Activity.class);
                startActivity(intent);

            }
        };
        new Timer().schedule(timerTask, 3000);
    }
}
