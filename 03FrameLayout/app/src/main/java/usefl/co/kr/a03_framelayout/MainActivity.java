package usefl.co.kr.a03_framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
    }

    public void onImageChangeClick(View v) {
        if (ImageView.VISIBLE == imageView.getVisibility()) {
            imageView.setVisibility(ImageView.INVISIBLE);
            imageView2.setVisibility(ImageView.VISIBLE);
        } else {
            imageView.setVisibility(ImageView.VISIBLE);
            imageView2.setVisibility(ImageView.INVISIBLE);
        }
    }
}
