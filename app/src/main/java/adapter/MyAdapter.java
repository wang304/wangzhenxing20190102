package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bean.BenaNews;
import wangzhenxing.bawei.com.wangzhenxing20190102.R;

public class MyAdapter extends BaseAdapter {
    private List<BenaNews> list;
    private Context context;

    public MyAdapter(List<BenaNews> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.item,null);
            ImageView image_view = convertView.findViewById(R.id.image_view);
            TextView text1 = convertView.findViewById(R.id.text1);
            TextView text2 = convertView.findViewById(R.id.text2);
            viewHolder=new ViewHolder();
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.text1.setText(list.get(position).getCode());
        viewHolder.text2.setText(list.get(position).getMsg());

        return convertView;
    }
    class ViewHolder{
        //ImageView image_view;
        TextView text1,text2;
    }
}
