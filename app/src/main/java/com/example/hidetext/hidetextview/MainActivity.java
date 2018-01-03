package com.example.hidetext.hidetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_info;
    private ImageView iv_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    /**
     * @Title: initUI
     * @Description:TODO   void
     */
    private void initUI(){
        tv_info = (TextView)findViewById(R.id.tv_info);
        iv_arrow = (ImageView)findViewById(R.id.iv_arrow);
        StretchUtil.getInstance(tv_info, 3, iv_arrow, R.drawable.zhucefanhui_up, R.drawable.zhucefanhui_down).initStretch();
    }
}
