package com.mirsfang.newsdemolayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


import com.mirsfang.newsdemolayout.AdModelToItem;
import com.mirsfang.newsdemolayout.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by MirsFang on 2016/5/7.
 */
public class AdAdapter extends BaseAdapter {
    private Context context;
    private List<AdModelToItem> list;
    private static  final  int TYPE_1=0;
    private static  final  int TYPE_2=1;

    public AdAdapter(Context context, List<AdModelToItem> list){
        this.context=context;
        this.list=list;
    }
    public AdAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        //判断类型
        if(list.get(position).getImageurls().size()<=1){
            return TYPE_1;
        }else{
            return TYPE_2;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderToImage1  viewHolderToImage1=null;
        ViewHolderToImage2  viewHolderToImage2=null;
        int type = getItemViewType(position);
        //根据不同的TYPE选择不同的Item
        if(convertView==null){
            switch (type){
                case TYPE_1:
                    convertView= LayoutInflater.from(context).inflate(R.layout.headline_ad_1,null);
                    viewHolderToImage1=new ViewHolderToImage1();
                    viewHolderToImage1.adImage1= (ImageView) convertView.findViewById(R.id.headline_ad_image_1);
                    viewHolderToImage1.title= (TextView) convertView.findViewById(R.id.headline_ad_title_1);
                    viewHolderToImage1.discrip= (TextView) convertView.findViewById(R.id.headline_ad_discrib_1);
                    viewHolderToImage1.frame= (FrameLayout) convertView.findViewById(R.id.headline_ad_frame_1);
                    convertView.setTag(viewHolderToImage1);
                    break;
                case TYPE_2:
                    convertView=LayoutInflater.from(context).inflate(R.layout.headline_ad_2,null);
                    viewHolderToImage2=new ViewHolderToImage2();
                    viewHolderToImage2.adImage1= (ImageView) convertView.findViewById(R.id.headline_ad_image_2_1);
                    viewHolderToImage2.adImage2= (ImageView) convertView.findViewById(R.id.headline_ad_image_2_2);
                    viewHolderToImage2.adImage3= (ImageView) convertView.findViewById(R.id.headline_ad_image_2_3);
                    viewHolderToImage2. title= (TextView) convertView.findViewById(R.id.headline_ad_title_2);
                    viewHolderToImage2.discrip= (TextView) convertView.findViewById(R.id.headline_ad_discrib_2);
                    convertView.setTag(viewHolderToImage2);
                    break;
            }
        }else{
            switch (type) {
                case TYPE_1:
                    viewHolderToImage1= (ViewHolderToImage1) convertView.getTag();
                    break;
                case TYPE_2:
                    viewHolderToImage2= (ViewHolderToImage2) convertView.getTag();
                    break;
            }
        }
        if(list.size()>=position) {
            AdModelToItem modelToItem = list.get(position);
            switch (type) {
                case TYPE_1:
                    //广告位有一个或者没有图片的
                    if (modelToItem.getImageurls().size() == 0) {
                        viewHolderToImage1.frame.setVisibility(View.GONE);
                    } else if (modelToItem.getImageurls().get(0) != null) {
                        viewHolderToImage1.frame.setVisibility(View.VISIBLE);
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(0).getUrl(), viewHolderToImage1.adImage1);
                    }
                    viewHolderToImage1.title.setText(modelToItem.getTitle());
                    viewHolderToImage1.discrip.setText(modelToItem.getPubDate());
                    break;
                case TYPE_2:
                    //广告位有两个到三个图片的
                    if(modelToItem.getImageurls().size()==2){
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(0).getUrl(), viewHolderToImage2.adImage1);
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(1).getUrl(), viewHolderToImage2.adImage2);
                        viewHolderToImage2.adImage3.setVisibility(View.GONE);
                    }else if(modelToItem.getImageurls().size()==3){
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(0).getUrl(), viewHolderToImage2.adImage1);
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(1).getUrl(), viewHolderToImage2.adImage2);
                        ImageLoader.getInstance().displayImage(modelToItem.getImageurls().get(2).getUrl(), viewHolderToImage2.adImage3);
                    }
                    viewHolderToImage2.title.setText(modelToItem.getTitle());
                    viewHolderToImage2.discrip.setText(modelToItem.getPubDate());
                    break;
            }
        }
        return convertView;
    }

    /**
     * 只有一个图片
     * */
    class ViewHolderToImage1{
        TextView title,discrip;
        ImageView adImage1;
        FrameLayout frame;
    }

    /**
     * 有两个或者三个图片
     * */
    class ViewHolderToImage2{
        TextView title,discrip;
        ImageView adImage1,adImage2,adImage3;
    }
}
