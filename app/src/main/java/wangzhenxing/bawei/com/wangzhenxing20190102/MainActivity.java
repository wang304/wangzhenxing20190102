package wangzhenxing.bawei.com.wangzhenxing20190102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.List;

import adapter.MyAdapter;
import bean.BenaNews;
import presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity {
    private List<BenaNews> list;
    private GridView grid_view;
    private PresenterImpl presenter;
    private String path="http://www.zhaoapi.cn/home/getHome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        grid_view = findViewById(R.id.grid_view);
        presenter.getModleData(path);
        MyAdapter adapter=new MyAdapter(list,MainActivity.this);
        grid_view.setAdapter(adapter);
    }
}
