package com.example.tuangou.bean;

/**
 * Created by layer on 2016/10/24.
 * 常量池
 */
public interface Config {

   String[] title = new String[]{"首页", "周边", "我的", "更多"};

   String baseUrl = "http://7xij5m.com1.z0.glb.clouddn.com/";

   /**猜你喜欢**/
   String spRecommendURL = baseUrl + "spRecommend.txt";

   /**猜你喜欢**/
   String spRecommendURL_NEW = baseUrl + "spRecommend_new.txt";
   /**热门电影**/
   String filmHotUrl = baseUrl + "filmHot_refresh.txt";
}
