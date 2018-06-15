package usefl.co.kr.a20_parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent passedIntent = getIntent();
        processIntent(passedIntent);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void processIntent(Intent intent) {
        if (intent == null) {
            return;
        }

        ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
        if (names != null) {
            Toast.makeText(getApplicationContext(), "names : " + names.size(), Toast.LENGTH_LONG).show();
        }

        SimpleData data = (SimpleData) intent.getParcelableExtra("data");
        if (data != null) {
            Toast.makeText(getApplicationContext(), "datas : " + data.number, Toast.LENGTH_LONG).show();
        }
    }
}
