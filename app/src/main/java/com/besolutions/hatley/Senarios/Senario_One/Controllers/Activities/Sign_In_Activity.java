package com.besolutions.hatley.Senarios.Senario_One.Controllers.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.besolutions.hatley.R;

public class Sign_In_Activity extends AppCompatActivity {

    EditText editText;
    TextView txtNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in_);

        editText = findViewById(R.id.editTextPass);

        txtNewAccount = findViewById(R.id.txtNewAccount);
        txtNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sign_In_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });



    }
}
