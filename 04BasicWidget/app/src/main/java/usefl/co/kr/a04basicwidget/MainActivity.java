package usefl.co.kr.a04basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkbox = (CheckBox)findViewById(R.id.checkBox);
        boolean isChecked = checkbox.isChecked();
    }
}
