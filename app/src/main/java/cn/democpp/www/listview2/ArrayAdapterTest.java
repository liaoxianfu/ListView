package cn.democpp.www.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        String[] strs = {
//                "hello1",
//                "hello2",
//                "hello3",
//                "hello4",
//                "hello5",
//                "hello6",
//
//        };
        String[] strs = new String[100];

        for (int j = 0; j < 100;j ++){
            strs[j] = "str" + j;
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrary_adapter);
        ListView listView = (ListView) findViewById(R.id.list_view_arr);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.text_view, strs);
        listView.setAdapter(arrayAdapter);
    }
}
