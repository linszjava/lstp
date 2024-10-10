package com.lin.common.utils;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;
import com.lin.common.exception.CusException;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/9 18:00
 */
@Slf4j
public class HttpClientUtil {

    /**
     * 默认的HttpGet请求 不需要鉴权 在请求头中不包含参数 zstp中使用该种方式
     * @return
     */
    public static String HttpGetDefault(String url) {
        String result = " ";
        CloseableHttpClient client=null;
        HttpEntity entity;
        CloseableHttpResponse response=null;
        try {
            client = HttpClients.createDefault();
            // 创建HttpGet请求
            HttpGet httpGet = new HttpGet(url);
            // 设置头
            httpGet.setHeader("Content-Type", "application/json");
            // 此方法不包含请求头带参数 鉴权
            // RequestConfig 配置
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(5000)
                    .setConnectionRequestTimeout(5000)
                    .setSocketTimeout(5000).build();
            // 设置配置
            httpGet.setConfig(config);
            // 发送请求
            response = client.execute(httpGet);
            // 获取返回结果
            entity = response.getEntity();
            //返回结果 toString
            result = EntityUtils.toString(entity);
            return result;
        }catch (Exception e) {
            log.error("创建HttpClient失败",e);
            throw new CusException("创建HttpClient失败");

        } finally {
            if (response != null) {
                IoUtil.close(response);
            }
            if (client != null) {
                IoUtil.close(client);
            }
        }


    }

    public static String HttpPostDefault(String url, Map<String,Object> map) {
        CloseableHttpResponse response = null;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Accept-Encoding","UTF-8");
        httpPost.addHeader("Content-Type","application/json");
        // 设置请求头的配置参数
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(65000)
                .setSocketTimeout(50000).setConnectionRequestTimeout(35000).build();
        httpPost.setConfig(config);
        // 设置请求体 参数
        List<NameValuePair> list = new ArrayList<>();
        map.forEach((k,v)->{
            BasicNameValuePair basicNameValuePair = new BasicNameValuePair(k, v.toString());
            list.add(basicNameValuePair);
        });
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(list,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new CusException("HttpPost不支持字码类型"+e);
        }
        try {
            response = client.execute(httpPost);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);
        } catch (IOException e) {
            throw new CusException("HttpPost创建异常"+e);
        }

    }

    public static String HttpGetWithHeader(String url, Map<String, Object> map) {
        String result = " ";
        CloseableHttpClient client=null;
        HttpEntity entity;
        CloseableHttpResponse response=null;
        try {
            client = HttpClients.createDefault();
            // 创建HttpGet请求
            HttpGet httpGet = new HttpGet(url);
            // 设置头
            httpGet.setHeader("Content-Type", "application/json");
            // 此方法包含请求头带参数 鉴权
            httpGet.setHeader("Authorization", "Bearer " + map.get("token")); // 具体根据需求而定
            // RequestConfig 配置
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(5000)
                    .setConnectionRequestTimeout(5000)
                    .setSocketTimeout(5000).build();
            // 设置配置
            httpGet.setConfig(config);
            // 发送请求
            response = client.execute(httpGet);
            // 获取返回结果
            entity = response.getEntity();
            //返回结果 toString
            result = EntityUtils.toString(entity);
            return result;
        }catch (Exception e) {
            log.error("创建HttpClient失败",e);
            throw new CusException("创建HttpClient失败");

        } finally {
            if (response != null) {
                IoUtil.close(response);
            }
            if (client != null) {
                IoUtil.close(client);
            }
        }


    }
}
