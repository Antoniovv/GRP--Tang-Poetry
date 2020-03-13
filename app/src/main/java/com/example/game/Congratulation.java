package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Congratulation extends AppCompatActivity {

    private Button homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        homepage = findViewById(R.id.homepage);
//        homepage.setOnClickListener(new MyClickListener());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulation);
    }

//    protected  class MyClickListener implements  View.OnClickListener{
//        @Override
//        public void onClick(View v){
//            startActivity(new Intent(Congratulation.this,HOMEPAGE.class));
//            finish();
//        }
//    }

}
