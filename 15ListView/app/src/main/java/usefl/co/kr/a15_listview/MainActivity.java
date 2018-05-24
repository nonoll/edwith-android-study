package usefl.co.kr.a15_listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        SingerAdapter adapter = new SingerAdapter();
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
        listView.setAdapter(adapter);
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
            SingerItemView itemView = new SingerItemView(getApplicationContext());
            SingerItem item = items.get(i);

            itemView.setName(item.getName());
            itemView.setMobile(item.getMobile());

            return itemView;
        }
    }
}
