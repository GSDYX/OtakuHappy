package com.gsdyx.otakuhappy.web.controller;
import com.gsdyx.otakuhappy.utils.HttpsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Controller
public class loginCodeController {
    @RequestMapping("/loginCode")
    @ResponseBody
    public String loginCode(String code) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        String APPID = "wx78d8849d4050b931";
        String SECRET = "1fcfe79c32cea98bad2e74880e3d46aa";
        String JSCODE = code;
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + JSCODE + "&grant_type=authorization_code";
        String result = HttpsUtil.get(url);
        return result;
    }




}
