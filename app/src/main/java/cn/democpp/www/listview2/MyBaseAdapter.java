package cn.democpp.www.listview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyBaseAdapter extends BaseAdapter {
    private Context context;
    private String[] items;
    private int[] icons;

    public MyBaseAdapter(Context context, String[] items, int[] icons) {
        this.context = context;
        this.icons = icons;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = View.inflate(context, R.layout.list_item, null);
        ImageView imageView = (ImageView) view1.findViewById(R.id.image_view);
        imageView.setBackgroundResource(icons[i]);
        TextView text_view = (TextView) view1.findViewById(R.id.text_view);
        text_view.setText(items[i]);
        return view1;
    }
}
