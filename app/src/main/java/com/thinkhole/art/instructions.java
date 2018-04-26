package com.thinkhole.art;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.Guessr.art.R;
public class instructions  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.howtoplay);
    }
    public void onclickclose(View view){
        this.finish();
    }

}
