package com.lesehankoding.expandview;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;


public class ExpandView extends Animation {


    public static void ExpandInit(View layoutExpand, View arrow, int rotation) {
        if (layoutExpand.getVisibility() == View.VISIBLE) {
            ExpandView.collapse(layoutExpand);
            arrow.animate().setDuration(100).rotation(0);
        } else {

            ExpandView.expandAction(layoutExpand);
            arrow.animate().setDuration(100).rotation(rotation);
        }
    }

    private static void expandAction(final View view) {
        view.measure(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        final int actualheight = view.getMeasuredHeight();

        view.getLayoutParams().height = 0;
        view.setVisibility(View.VISIBLE);

        ExpandView animations = new ExpandView() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                view.getLayoutParams().height = interpolatedTime == 1 ? ViewGroup.LayoutParams.WRAP_CONTENT : (int) (actualheight * interpolatedTime);
                view.requestLayout();
            }
        };

        animations.setDuration((long) (actualheight / view.getContext().getResources().getDisplayMetrics().density));
        view.startAnimation(animations);

    }

    private static void collapse(final View view) {

        final int actualHeight = view.getMeasuredHeight();

        ExpandView animations = new ExpandView() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {

                if (interpolatedTime == 1) {
                    view.setVisibility(View.GONE);
                } else {
                    view.getLayoutParams().height = actualHeight - (int) (actualHeight * interpolatedTime);
                    view.requestLayout();

                }
            }
        };

        animations.setDuration((long) (actualHeight/ view.getContext().getResources().getDisplayMetrics().density));
        view.startAnimation(animations);
    }

}
