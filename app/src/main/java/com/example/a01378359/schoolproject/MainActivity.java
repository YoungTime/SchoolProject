package com.example.a01378359.schoolproject;

import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM月dd日");
    private TextView tvDate;
    private Calendar calendar = Calendar.getInstance();

    private ProgressBar progressBar;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();



    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void initView(){
        tvDate = findViewById(R.id.tv_data);
        int d = calendar.get(Calendar.DAY_OF_WEEK);
        String s = "";
        switch (d){
            case 1:
                s = "星期一";
                break;
            case 2:
                s = "星期二";
                break;
            case 3:
                s = "星期三";
                break;
            case 4:
                s = "星期四";
                break;
            case 5:
                s = "星期五";
                break;
            case 6:
                s = "星期六";
                break;
            case 7:
                s = "星期七";
                break;
        }
        tvDate.setText(dateFormat.format(new Date(System.currentTimeMillis()))+" "+s);
        progressBar =findViewById(R.id.pb_light);
        progressBar.setMax(100);
        progressBar.setProgress(50);
    }


}
