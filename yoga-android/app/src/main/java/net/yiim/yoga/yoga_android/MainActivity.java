package net.yiim.yoga.yoga_android;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;

public class MainActivity extends AppCompatActivity {
    private YogaLayout mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoLoader.init(this, false);

        mRootView = new YogaLayout(this);
        YogaNode rootViewNode = mRootView.getYogaNode();
        rootViewNode.setFlexDirection(YogaFlexDirection.COLUMN);
        rootViewNode.setJustifyContent(YogaJustify.CENTER);
        rootViewNode.setAlignItems(YogaAlign.CENTER);

        TextView text1 = new TextView(this);
        YogaNode text1Node = new YogaNode();
        text1Node.setMeasureFunction(new YogaLayout.ViewMeasureFunction());
        text1Node.setData(text1);
        text1Node.setWidth(dpToPx(100));
        text1Node.setHeightAuto();

        text1.setText("hello");
        text1.setBackgroundColor(Color.BLACK);
        text1.setTextColor(Color.WHITE);

        mRootView.addView(text1, text1Node);

        setContentView(mRootView);
    }

    int dpToPx(int dps) {
        return Math.round(getResources().getDisplayMetrics().density * dps);
    }
}
