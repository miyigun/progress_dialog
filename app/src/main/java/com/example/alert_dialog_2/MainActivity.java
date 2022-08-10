package com.example.alert_dialog_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialogWindow();
    }

    public void dialogWindow() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Messages Section");
        progressDialog.setMessage("Messages are listed. Please wait!");
        progressDialog.setCancelable(false);
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                progressDialog.cancel();
            }
        }).start();
    }
}