package com.mirsfang.newsdemolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.mirsfang.newsdemolayout.adapter.AdAdapter;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<AdModelToItem> adList;
    private AdAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(getApplicationContext()));

        listView= (ListView) findViewById(R.id.listview);
        adList=new ArrayList<>();
        initDate();
        adapter=new AdAdapter(this,adList);
        listView.setAdapter(adapter);

    }



    public  void initDate(){
        for (int i=0;i<20;i++){
            AdModelToItem adModelToItem=new AdModelToItem();
            adModelToItem.setTitle("这是第"+i+"个");
            adModelToItem.setPubDate(new Date().getDate()+"");
            List<AdModelToItem.ImageurlsBean>  imageurlsBeen=new ArrayList<>();
            if(i%2==1){
                AdModelToItem.ImageurlsBean imageurl=new AdModelToItem.ImageurlsBean();
                imageurl.setUrl("http://avatar.csdn.net/5/8/C/2_a109340.jpg");
                imageurlsBeen.add(imageurl);
            }else{
                for (int j=0;j<3;j++){
                    AdModelToItem.ImageurlsBean imageurl=new AdModelToItem.ImageurlsBean();
                    imageurl.setUrl("http://avatar.csdn.net/5/8/C/2_a109340.jpg");
                    imageurlsBeen.add(imageurl);
                }
            }
            adModelToItem.setImageurls(imageurlsBeen);
            adList.add(adModelToItem);
        }

    }
}
