package cn.democpp.www.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BaseAdapterMine extends AppCompatActivity {


    private String[] items = {
            "京东", "qq", "qq斗地主", "sina", "天猫",
            "uc", "微信"
    };
    private int icons[] = {
            R.drawable.jd,
            R.drawable.qq, R.drawable.qq_dizhu,
            R.drawable.sina, R.drawable.tmall, R.drawable.uc,
            R.drawable.weixin
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter_mine);


        BaseAdapterSelf adapter = new BaseAdapterSelf(this, items, icons);
        ListView view = (ListView) findViewById(R.id.lv);
        view.setAdapter(adapter);
    }
}
