package com.example.cklicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton mainBtn;
    Button mainBtn1;
    Button mainBtn2;
    String s;
    //ImageButton image_Button;
    private long score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);

        mainBtn = (ImageButton) findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(clickListener);

        mainBtn1 = (Button) findViewById(R.id.main_btn1);
        mainBtn1.setOnClickListener(clickListener1);

        mainBtn2 = (Button) findViewById(R.id.main_btn2);
        mainBtn2.setOnClickListener(clickListener2);



    }


    final View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            score ++;
            if (score % 10 > 4 || score % 10 == 0) {
                s = "Кнопка нажата " + score +  " раз";
            } else if (score > 4 && score < 10 || score % 10 == 0) {
                s  = "Кнопка нажата " + score +  " раз";
            } else if (score <= 4 && score < 10 || score % 10 != 0) {
                s = "Кнопка нажата " + score +  " раза";
            } else if (score == 11 || score == 12 || score == 13 || score == 14) {
                s  = "Кнопка нажата " + score +  " раз";
            } else {
                s = "Кнопка нажата " + score +  " раза";
            }
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn.setOnClickListener(clickListener);

        }
    };
    final View.OnClickListener clickListener1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            score--;
            if (score % 10 > 4 || score % 10 == 0) {
                s = "Кнопка нажата " + score +  " раз";
            } else if (score > 4 && score < 10 || score % 10 == 0) {
                s  = "Кнопка нажата " + score +  " раз";
            } else if (score <= 4 && score < 10 || score % 10 != 0) {
                s = "Кнопка нажата " + score +  " раза";
            } else if (score == 11 || score == 12 || score == 13 || score == 14) {
                s  = "Кнопка нажата " + score +  " раз";
            } else {
                s = "Кнопка нажата " + score +  " раза";
            }
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn.setOnClickListener(clickListener);

        }
    };
    final View.OnClickListener clickListener2 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            score = 0;
            s = "Кнопка нажата " + score + " раз";
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn.setOnClickListener(clickListener);

        }
    };
}