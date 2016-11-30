package com.szysky.customize.simageview.range;

import android.graphics.Canvas;
import android.graphics.Point;

import com.szysky.customize.simageview.SImageView;

import java.util.ArrayList;

/**
 * Author :  suzeyu
 * Time   :  2016-11-29  下午9:03
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 控件多个图片时 布局排列的位置计算接口
 */

public interface ILayoutManager {

    /**
     * 布局排列计算方法, 具体规则由子类实现
     * @param viewWidth 控件的宽
     * @param viewHeight 控件的高
     * @param viewNum   控件需要在内部显示几张图片
     * @return  返回一个信息集合, 提供 {@link com.szysky.customize.simageview.effect.IDrawingStrategy#algorithm(Canvas, SImageView.ConfigInfo)}使用
     */
    ArrayList<LayoutInfoGroup> calculate(int viewWidth, int viewHeight, int viewNum);


    /**
     * 封装控件内部单个元素显示的布局信息
     */
    class LayoutInfoGroup{
        /**
         * 组合头像时, 每个单独元素可分配的最大宽高
         */
        public int innerWidth;
        public int innerHeight;

        /**
         * 每个单独元素,左上点和右下点.   可规划区域
         */
        public Point leftTopPoint = new Point();
        public Point rightBottomPoint = new Point();
    }
}
