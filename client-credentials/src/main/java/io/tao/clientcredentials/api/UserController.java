package io.tao.clientcredentials.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/api/userinfo")
    public ResponseEntity<UserInfo> getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("admin");
        userInfo.setEmail("admin@spring2go.com");
        return ResponseEntity.ok(userInfo);
    }

}
