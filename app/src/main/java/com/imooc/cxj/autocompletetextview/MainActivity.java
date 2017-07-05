package com.imooc.cxj.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView acTextView;
    /*
     *初始化数据源
     */
    private String[] res = {"beijing1","beijing2","beijing3",
                            "shanghai1","shanghai2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * 第一步:初始化控件
         * 第二步:需要一个适配器
         * 需要初始化数据源---数据源是用来匹配文本框中输入的内容
         * 将adpter与当前AutoCompleteTextView绑定
         */
        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);
    }
}
