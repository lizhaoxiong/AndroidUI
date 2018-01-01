package com.example.androidui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Xfermode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * 1.在数学中常见的坐标系与屏幕默认坐标系的差别
 * 2.View的坐标系是相对于父控件而言的(getTop getLeft getBottom getRight)
 * 3.MotionEvent中get和getRaw的区别
 */

/**
 * 1.默认的屏幕坐标系中角度增大方向和数学差异
 * 2.角度和弧度的换算关系
 * 3.角度与弧度的定义
 */

/**
 * 1.安卓支持的颜色模式(定义,差别)
 * 2.颜色定义
 * 3.创建颜色的方式
 * 4.取色工具
 * 5.颜色混合模式(根据想要效果选择不同的模式)
 */

public class SloopBaseActivity extends AppCompatActivity {

    private View mCoordinate1;
    private View mCoordinate2;
    private static final String TAG = "SloopBaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sloop_base);

        mCoordinate1 = findViewById(R.id.rl_coordinate1);
        mCoordinate2 = findViewById(R.id.rl_coordinate2);


        mCoordinate1.layout(100,100,200,200);
        mCoordinate1.measure(500,500);



        testCoordinate();

        testMotionEvent();

        testCreateColor();
        
        testColorPorterDuff();
    }

    private void testColorPorterDuff() {
        Paint paint = new Paint();
//        paint.setXfermode(PorterDuff.Mode.CLEAR);
    }

    private void testCreateColor() {
        /**java自定义**/
//        A 从ox00到oxff表示从透明到不透明。
//        RGB 从0x00到0xff表示颜色从浅到深。
        int color = Color.BLACK;
        int color2 = Color.argb(127, 255, 0, 0);
        int color3 = 0xaaff0000;

        /**xml定义颜色**/
//        /res/values/color.xml
//       int color = getResources().getColor(R.color.mycolor);
//      #f00            //低精度 - 不带透明通道红色
//      #af00           //低精度 - 带透明通道红色
//      #ff0000         //高精度 - 不带透明通道红色
//      #aaff0000       //高精度 - 带透明通道红色

        /**在style文件中引用**/
//        <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
//            <item name="colorPrimary">@color/red</item>
//        </style>

        /** layout文件中引用**/
//        android:background="@color/red"

    }

    private void testMotionEvent() {

    }

    private void testCoordinate() {
        int top = mCoordinate1.getTop();
        int bottom = mCoordinate1.getBottom();
        int left = mCoordinate1.getLeft();
        int right = mCoordinate1.getRight();

        Log.d(TAG, "testCoordinate() called | getTop="+top +",getBottom="+bottom +",getLeft="+left
                +",getRight"+right);
    }
}
