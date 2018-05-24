package usefl.co.kr.a17_gridview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingerItemView extends LinearLayout {
    TextView textViewName;
    TextView textViewMobile;

    public SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public SingerItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);

        textViewName = (TextView) findViewById(R.id.name);
        textViewMobile = (TextView) findViewById(R.id.mobile);
    }

    public void setName(String name) {
        textViewName.setText(name);
    }

    public void setMobile(String mobile) {
        textViewMobile.setText(mobile);
    }
}
