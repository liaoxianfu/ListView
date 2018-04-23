package cn.democpp.www.listview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseAdapterSelf extends BaseAdapter {
    Context context;
    String[] items;
    int[] icons;

    /**
     * 创建初始化方法
     *
     * @param context 传入上下文
     * @param items   文本
     * @param icons   图片
     */

    public BaseAdapterSelf(Context context, String[] items, int[] icons) {
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
        // 将布局文件转化成View对象
        view = View.inflate(context, R.layout.list_item, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view);
        imageView.setBackgroundResource(icons[i]);
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText(items[i]);
        return view;
    }
}
