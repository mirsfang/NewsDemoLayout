package com.mirsfang.newsdemolayout;

import java.util.List;

/**
 * Created by MirsFang on 2016/5/7.
 */
public class AdModelToItem {

    /**
     * channelId : 5572a108b3cdc86cf39001d5
     * channelName : 娱乐焦点
     * desc : 5月8日就是母亲节，6日晚，TFBOYS王俊凯在微博晒出帮妈妈洗菜的照片，提前送上母亲节祝福，称爱妈妈就要从每一件小事做起。王俊凯帮妈妈洗菜新浪娱乐讯5月8日就是母亲节，6日晚，TFBOYS王俊凯[微博]在微博晒出帮妈妈洗菜的照片，提前送上母亲节祝福，称爱妈妈就要从每一件小事做...
     * html : <p>5月8日就是母亲节，6日晚，TFBOYS王俊凯在微博晒出帮妈妈洗菜的照片，提前送上母亲节祝福，称爱妈妈就要从每一件小事做起。</p><p>新浪娱乐讯 5月8日就是母亲节，6日晚，TFBOYS王俊凯[微博]在微博晒出帮妈妈洗菜的照片，提前送上母亲节祝福，称爱妈妈就要从每一件小事做起。</p><p>照片中，王俊凯低头帮妈妈洗菜，模样乖巧认真，十分孝顺，王妈妈仅露背影，仍看得出很年轻。王俊凯在微博写道：“妈妈辛苦了，爱妈妈就要从每一件小事做起，比如——帮妈妈洗菜，母亲节快到了，提前祝全天下的妈妈母亲节快乐。”</p><p>粉丝们纷纷力挺道：“洗菜的小青年真帅！”“俊俊超孝顺好吗，在家多陪陪伯母。”“婆婆母亲节快乐”“婆婆，让我来！”（实习生Rachel/文）</p>
     * imageurls : [{"height":733,"url":"http://upload.ct.youth.cn/2016/0507/1462611232966.jpg","width":550}]
     * link : http://fun.youth.cn/2016/0507/4375275.shtml
     * pubDate : 2016-05-07 09:12:26
     * source : 中国青年网
     * title : 王俊凯尽孝帮妈妈洗菜 粉丝:婆婆让我来！
     */

    private String channelId;
    private String channelName;
    private String desc;
    private String html;
    private String link;
    private String pubDate;
    private String source;
    private String title;
    /**
     * height : 733
     * url : http://upload.ct.youth.cn/2016/0507/1462611232966.jpg
     * width : 550
     */

    private List<ImageurlsBean> imageurls;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ImageurlsBean> getImageurls() {
        return imageurls;
    }

    public void setImageurls(List<ImageurlsBean> imageurls) {
        this.imageurls = imageurls;
    }

    public static class ImageurlsBean {
        private int height;
        private String url;
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
