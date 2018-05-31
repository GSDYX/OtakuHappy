package com.gsdyx.otakuhappy.web.controller;

import com.gsdyx.otakuhappy.utils.HttpsUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.UUID;

@Controller
public class loginCodeController {
    @ResponseBody
    @RequestMapping("/loginCode")
    public String loginCode(String code) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, JSONException {
        String APPID = "wx78d8849d4050b931";
        String SECRET = "1fcfe79c32cea98bad2e74880e3d46aa";
        String JSCODE = code;
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + JSCODE + "&grant_type=authorization_code";
        String result = HttpsUtil.get(url);
        JSONObject obj = new JSONObject(result);
        //obj.has("openId");

        String openid = obj.get("openid").toString();
//        String session_key = obj.get("session_key").toString();
        String uid = UUID.randomUUID().toString();
//        StringBuffer sb = new StringBuffer();
//        sb.append(openid);
//        sb.append(","+session_key);
        HashMap hashmap =new HashMap<>();

        hashmap.put(uid, openid);

        return uid;
    }




}
