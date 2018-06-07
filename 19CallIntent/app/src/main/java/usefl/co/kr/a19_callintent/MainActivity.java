package usefl.co.kr.a19_callintent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (TextView) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String receiver = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + receiver));
                Toast.makeText(getApplicationContext(), receiver, Toast.LENGTH_LONG).show();

                startActivity(intent);

                Intent intent2 = new Intent();
                ComponentName menuActivity = new ComponentName("usefl.co.kr.a19_callintent", "usefl.co.kr.a19_callintent.MenuActivity");
                intent2.setComponent(menuActivity);
                startActivity(intent2);
            }
        });
    }
}
