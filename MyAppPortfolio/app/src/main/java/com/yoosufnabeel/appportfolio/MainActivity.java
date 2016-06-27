package com.yoosufnabeel.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAppScreen(View view) {

        String message = "This button will launch ";
        Button btn = (Button)view;
        message +=  btn.getText() + "!";

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

//        switch (view.getId())
//        {
//            case R.id.btnPopularMovies:
//                break;
//            case R.id.btnStockHawk:
//                break;
//            case R.id.btnBuildItBigger:
//                break;
//            case R.id.btnMakeMaterial:
//                break;
//            case R.id.btnGoUbiquitous:
//                break;
//            case R.id.btnCapstone:
//                break;
//        }
    }
}