package com.message.toast.demo.toast_message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*

     */
    public void showToastMessage(View v)
    {
        Toast toast = Toast.makeText(MainActivity.this,"Toast Message",Toast.LENGTH_SHORT);
        switch(v.getId()) {
            case R.id.bTopLeft:
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                toast.show();
                break;
            case R.id.bTopRight:
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
                toast.show();
                break;
            case R.id.bBottomLeft:
                toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                toast.show();
                break;
            case R.id.bBottomRight:
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                toast.show();
                break;
            case R.id.bCentrePos:
                toast.setGravity(Gravity.CENTER, 100, 200);
                toast.show();
                break;
            case R.id.bCentreNeg:
                toast.setGravity(Gravity.CENTER, 100, -300);
                toast.show();
                break;


        }
    }
}
