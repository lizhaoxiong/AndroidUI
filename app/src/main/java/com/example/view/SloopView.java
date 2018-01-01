package com.example.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by lizhaoxiong on 18-1-1.
 */

public class SloopView extends View {
    private static final String TAG = "SloopView";

    /**
     * SloopView view  new SloopView(this);调用
     *
     * @param context
     */
    public SloopView(Context context) {
        this(context, null);
    }

    /**
     * <com.sloop.study.SloopView 调用
     *
     * @param context
     * @param attrs
     */
    public SloopView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {

    }

    /**
     * 测量View的大小(宽高不仅有自身决定也受到父控件影响)
     *
     * @param widthMeasureSpec  view宽度+mode
     * @param heightMeasureSpec view高度+mode
     *                          <p>
     *                          测量模式:
     *                          UNSPECIFID 不考虑父控件,子view任意设置
     *                          EXACTLY 父控件确切制定子大小
     *                          AT_MOST 子view任意设置,上线是父控件大小
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthsize = MeasureSpec.getSize(widthMeasureSpec); //取出宽度的确切数值
        int withmode = MeasureSpec.getMode(widthMeasureSpec);//取出宽度的测量模式

        int heightsize = MeasureSpec.getSize(heightMeasureSpec);    //取出高度的确切数值
        int heightmode = MeasureSpec.getMode(heightMeasureSpec);    //取出高度的测量模式

        setMeasuredDimension( widthsize, heightsize);//确定view的基本大小,还没考虑父亲

        Log.d(TAG, "onMeasure() called with: " +
                "widthsize = [" + widthsize + "], " +
                "withmode = [" + withmode + "]" +
                "heightsize = [" + heightsize + "]" +
                "heightmode = [" + heightmode + "]");
    }

    /**
     * 确定View的最终大小
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    /**
     * 自定义ViewGroup会走,自定义View不考虑
     * onLayout一般是循环取出子View，然后经过计算得出各个子View位置的坐标值
     * @param changed
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        //把子控件依次设置其坐标职
        //child.layout(l, t, r, b);   getLeft() getTop() getRight() getBottom

    }

    /**
     * Canvas绘图
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * 对外暴露接口,用来控制View状态或监听View的变化
     */

}