package usefl.co.kr.pjt2_moviedetailview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean isLiked = false;
    Integer countLike = 15;
    Button btnLike;
    TextView textLike;


    Boolean isUnLiked = false;
    Integer countUnLike = 1;
    Button btnUnLike;
    TextView textUnLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLike = (TextView) findViewById(R.id.text_like);
        textLike.setText(countLike.toString());
        btnLike = (Button) findViewById(R.id.btn_like);
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isLiked = !isLiked;

                if (isLiked) {
                    isUnLiked = false;
                }

                updateButtonUI();
            }
        });

        textUnLike = (TextView) findViewById(R.id.text_unlike);
        textUnLike.setText(countUnLike.toString());
        btnUnLike = (Button) findViewById(R.id.btn_unlike);
        btnUnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isUnLiked = !isUnLiked;

                if (isUnLiked) {
                    isLiked = false;
                }

                updateButtonUI();
            }
        });
    }

    private void updateButtonUI() {
        if (isLiked) {
            countLike += 1;
            btnLike.setBackgroundResource(R.drawable.ic_thumb_up_selected);
        } else {
            countLike -= 1;
            btnLike.setBackgroundResource(R.drawable.ic_thumb_up);
        }

        textLike.setText(countLike.toString());

        if (isUnLiked) {
            countUnLike += 1;
            btnUnLike.setBackgroundResource(R.drawable.ic_thumb_down_selected);
        } else {
            countUnLike -= 1;
            btnUnLike.setBackgroundResource(R.drawable.ic_thumb_down);
        }

        textUnLike.setText(countUnLike.toString());
    }
}
