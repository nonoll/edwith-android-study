package usefl.co.kr.pjt2_moviedetailview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Boolean isLiked = false;
    Integer countLike = 15;
    Button btnLike;
    TextView textLike;


    Boolean isUnLiked = false;
    Integer countUnLike = 1;
    Button btnUnLike;
    TextView textUnLike;

    SingleLineReviewAdapter adapter;

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
                    countLike += 1;
                    if (isUnLiked) {
                        countUnLike -= 1;
                    }
                    isUnLiked = false;
                } else {
                    countLike -= 1;
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
                    countUnLike += 1;
                    if (isLiked) {
                        countLike -= 1;
                    }
                    isLiked = false;
                } else {
                    countUnLike -= 1;
                }

                updateButtonUI();
            }
        });

        Button btnWrite = (Button) findViewById(R.id.btn_write);
        Button btnMore = (Button) findViewById(R.id.btn_more);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "작성하기", Toast.LENGTH_SHORT).show();
            }
        });

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "모두보기", Toast.LENGTH_SHORT).show();
            }
        });



        ListView listView = (ListView) findViewById(R.id.listView);

        adapter = new SingleLineReviewAdapter();
        adapter.addItem(new SingleLineReviewItem("name1", "kym**", "", "", ""));
        adapter.addItem(new SingleLineReviewItem("name1", "kym**", "", "", ""));
        adapter.addItem(new SingleLineReviewItem("name1", "kym**", "", "", ""));
        adapter.addItem(new SingleLineReviewItem("name1", "kym**", "", "", ""));
        adapter.addItem(new SingleLineReviewItem("name1", "kym**", "", "", ""));
        listView.setAdapter(adapter);
    }

    private void updateButtonUI() {
        if (isLiked) {
            btnLike.setBackgroundResource(R.drawable.ic_thumb_up_selected);
        } else {
            btnLike.setBackgroundResource(R.drawable.ic_thumb_up);
        }

        textLike.setText(countLike.toString());

        if (isUnLiked) {
            btnUnLike.setBackgroundResource(R.drawable.ic_thumb_down_selected);
        } else {
            btnUnLike.setBackgroundResource(R.drawable.ic_thumb_down);
        }

        textUnLike.setText(countUnLike.toString());
    }


    class SingleLineReviewAdapter extends BaseAdapter {
        ArrayList<SingleLineReviewItem> items = new ArrayList<SingleLineReviewItem>();

        public void addItem(SingleLineReviewItem item) {
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
            SingleLineReviewView itemView = null;

            // 최적화를 위한 처리
            if (view == null) {
                itemView = new SingleLineReviewView(getApplicationContext());
            } else {
                itemView = (SingleLineReviewView) view;
            }

            SingleLineReviewItem item = items.get(i);

            itemView.setNickName(item.getNickName());

            return itemView;
        }
    }
}
