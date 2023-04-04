package com.example.toastcustomtemp;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/04/04
 */
public class CustomToast extends Toast {

    private Context context;
    private String message;

    public CustomToast(Context context, String message) {
        super(context);
        this.context = context;
        this.message = message;

        View view = LayoutInflater.from(context).inflate(R.layout.toast_custom, null);

        TextView textView = view.findViewById(R.id.user_name_tv);
            textView.setText(message);

        setView(view);
        setDuration(LENGTH_LONG);
        setGravity(Gravity.CENTER, 0, 0);
        setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
    }
}
