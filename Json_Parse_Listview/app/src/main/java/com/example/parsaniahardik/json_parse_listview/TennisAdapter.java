package com.example.parsaniahardik.json_parse_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TennisAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<TennisModel> tennisModelArrayList;

    public TennisAdapter(Context context, ArrayList<TennisModel> tennisModelArrayList) {

        this.context = context;
        this.tennisModelArrayList = tennisModelArrayList;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }
    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return tennisModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return tennisModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lv_player, null, true);

            holder.iv = (ImageView) convertView.findViewById(R.id.iv);
            holder.tvname = (TextView) convertView.findViewById(R.id.name);
            holder.tvsalary = (TextView) convertView.findViewById(R.id.salary);
            holder.tvage = (TextView) convertView.findViewById(R.id.age);

            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        Picasso.get().load(tennisModelArrayList.get(position).getImgURL()).into(holder.iv);
        holder.tvname.setText("Name: "+tennisModelArrayList.get(position).getName());
        holder.tvsalary.setText("Salary: "+tennisModelArrayList.get(position).getSalary());
        holder.tvage.setText("Age: "+tennisModelArrayList.get(position).getAge());

        return convertView;
    }

    private class ViewHolder {

        protected TextView tvname, tvsalary, tvage;
        protected ImageView iv;
    }

}
