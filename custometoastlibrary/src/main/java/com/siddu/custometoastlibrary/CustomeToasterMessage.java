package com.siddu.custometoastlibrary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomeToasterMessage {

    Activity activity;
    LayoutInflater inflater;

    public CustomeToasterMessage(Activity _activity) {
        this.activity = _activity;
        this.inflater = activity.getLayoutInflater();
    }

    public void ToastMesaage(String toast_msg, int toast_image) {

        View view = inflater.inflate(R.layout.custome_toast_layout, (ViewGroup) activity.findViewById(R.id.main_ll));
        TextView txt_toast = view.findViewById(R.id.txt_toast);
        ImageView img_toast = view.findViewById(R.id.img_toast);
        txt_toast.setText(toast_msg);
        img_toast.setImageResource(toast_image);
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }


}
