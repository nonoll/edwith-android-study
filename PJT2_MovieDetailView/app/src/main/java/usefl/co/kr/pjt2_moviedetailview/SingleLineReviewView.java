package usefl.co.kr.pjt2_moviedetailview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingleLineReviewView extends LinearLayout {

    TextView textViewNickName;

    public SingleLineReviewView(Context context) {
        super(context);

        init(context);
    }

    public SingleLineReviewView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.single_line_review_item, this, true);

        textViewNickName = (TextView) findViewById(R.id.nickName);

//        textViewName = (TextView) findViewById(R.id.name);
//        textViewMobile = (TextView) findViewById(R.id.mobile);
    }

    public void setNickName(String nickName) {
        textViewNickName.setText(nickName);
    }
}
