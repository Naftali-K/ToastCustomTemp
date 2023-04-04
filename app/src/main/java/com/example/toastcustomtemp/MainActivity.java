package com.example.toastcustomtemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * https://youtu.be/t7aDPcsKxow - video lesson
 * https://stackoverflow.com/questions/11288475/custom-toast-on-android-a-simple-example
 *
 */

public class MainActivity extends AppCompatActivity {

    private Button openToastBtn, openToastWithClassBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferences();

        openToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                View toastView = getLayoutInflater().inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.toast_layout_root));
                View toastView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.toast_custom, null);

                TextView user_name_tv = toastView.findViewById(R.id.user_name_tv);
                user_name_tv.setText("New Text from outside.");

                Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(toastView);
                    toast.show();
            }
        });

        openToastWithClassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast customToast = new CustomToast(getBaseContext(), "Toast from custom class of toast ");
                customToast.show();
            }
        });
    }

    private void setReferences(){
        openToastBtn = findViewById(R.id.open_toast_btn);
        openToastWithClassBtn = findViewById(R.id.open_toast_with_class_btn);
    }
}