package com.hae.codecommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author hhb
 */
@Controller
@RequestMapping("/user")
public class UserController {

  private static String uname = "admin";
  private static String pwd = "123456";

  @GetMapping("/loginPage")
  public String  getLoginPage(Map<String, String > map) {
    //map.put("msg", "请登录");
    return "login";
  }
  @PostMapping("/login")
  public String login(@RequestParam("username") String username, @RequestParam("password") String password
                        , Map<String, String > map, HttpSession session) {
    if (username.equals(username) && password.equals(pwd)) {
      session.setAttribute("loginUser", username);
      return "index";
    } else {
      map.put("msg","用户名或密码错误");
      return "login";
    }
  }

}
