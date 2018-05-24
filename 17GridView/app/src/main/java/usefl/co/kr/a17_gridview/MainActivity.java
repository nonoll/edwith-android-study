package usefl.co.kr.a17_gridview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SingerAdapter adapter;

    EditText editTextName;
    EditText editTextMobile;
    Button insertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        adapter = new SingerAdapter();
        adapter.addItem(new SingerItem("name1", "010-1234-1234"));
        adapter.addItem(new SingerItem("name2", "010-1234-1234"));
        adapter.addItem(new SingerItem("name3", "010-1234-1234"));
        adapter.addItem(new SingerItem("name4", "010-1234-1234"));
        adapter.addItem(new SingerItem("name5", "010-1234-1234"));
        adapter.addItem(new SingerItem("name6", "010-1234-1234"));
        adapter.addItem(new SingerItem("name7", "010-1234-1234"));
        adapter.addItem(new SingerItem("name8", "010-1234-1234"));
        adapter.addItem(new SingerItem("name9", "010-1234-1234"));
        adapter.addItem(new SingerItem("name10", "010-1234-1234"));
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SingerItem item = (SingerItem) adapter.getItem(i);

                // Toast.makeText(getApplicationContext(), item.name, Toast.LENGTH_LONG).show();
                Snackbar.make(view, "name : " + item.name + " / mobile : " + item.mobile, Snackbar.LENGTH_LONG).show();
            }
        });

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        insertButton = (Button) findViewById(R.id.insertButton);

        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String mobile = editTextMobile.getText().toString();

                adapter.addItem(new SingerItem(name, mobile));
                adapter.notifyDataSetChanged();

                Toast.makeText(getApplicationContext(), "added", Toast.LENGTH_LONG).show();
            }
        });
    }

    class SingerAdapter extends BaseAdapter {
        ArrayList<SingerItem> items = new ArrayList<SingerItem>();

        public void addItem(SingerItem item) {
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            SingerItemView itemView = null;

            // 최적화를 위한 처리
            if (view == null) {
                itemView = new SingerItemView(getApplicationContext());
            } else {
                itemView = (SingerItemView) view;
            }

            SingerItem item = items.get(i);

            itemView.setName(item.getName());
            itemView.setMobile(item.getMobile());

            return itemView;
        }
    }
}
