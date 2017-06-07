package com.codenerds.zerocool.geronimo13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private View layout;
    Animation slideUp;
    Animation slideDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ln_p2);
        TextView tv= (TextView) findViewById(R.id.tv_pickup);
        ImageButton imageButton= (ImageButton) findViewById(R.id.ib_plus);
        layout =(View) findViewById(R.id.frame_time_cal);
        //layout.setVisibility(View.GONE);
        slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.silde_down);
       imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (layout.getVisibility()== View.GONE) {

                    layout.startAnimation(slideUp);
                    layout.setVisibility(View.VISIBLE);
                }
                if (layout.getVisibility() == View.VISIBLE) {

                   // layout.startAnimation(slideDown);
                    layout.setVisibility(View.GONE);

                }
            }
        });

    tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
        }
    });}
}
