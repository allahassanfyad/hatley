
package com.besolutions.hatley.Senarios.Senario_One.Controllers.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.besolutions.hatley.R;
import com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities.MainActivity;

public class SignUp_Activity extends AppCompatActivity {
    Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
        btnsignup = findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUp_Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
