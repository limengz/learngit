package com.lmz;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sign {


    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String vendorCode = "3039";
        String secret = "f0204e1d3ee3e4b05de4e2ddbd39e076";
        String method ="secoo.order.reserve";
        String v = "1.9.1";
        String sign = "";
        final String format = "JSON";
        final String signMethod = "md5";
        Map<String, String> params = new HashMap<String, String>();
        params.put("method", method);
        params.put("timestamp", sdf.format(new Date()));
        params.put("v", v);
        params.put("format", format);
        params.put("signMethod", signMethod);
        params.put("vendorCode", vendorCode);
        params.put("startTime","2016-6-21 00:00:00");
        params.put("endTime", sdf.format(new Date()));
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        String str = "";
        for (int i = 0; i < keys.size(); i++)
        { String key = keys.get(i );
            if (key.equals("sign"))
            { continue;
            }
            String value = params.get(key);
            str = str + key + value;
        }
        sign = MD5Util.getMD5String(secret + str + secret).toUpperCase();
        System.out.println("mySign===>" + sign);
    }
}
