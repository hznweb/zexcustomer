package com.baidu.aip.ocr;

import org.json.JSONObject;

import java.util.HashMap;

public class Sample {

    //设置APPID/AK/SK
    public static final String APP_ID="22600866";
    public static final String API_KEY="UdMQmnyfqKcohxQIAaYBGTtp";
    public static final String SECRET_KEY="CitGoraLNUggb8IMa6lmpFhgDdPcbqCb";

    public static void main(String[] args) {
        //初始化一个AipOcr
        AipOcr client=new AipOcr(APP_ID,API_KEY,SECRET_KEY);
        //可选：网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        String path = "image/sbb.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
    }
}
