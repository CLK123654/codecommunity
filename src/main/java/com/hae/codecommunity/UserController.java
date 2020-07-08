package com.hae.codecommunity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hhb
 */
@Controller
@RequestMapping("/user")
public class UserController {

  @PostMapping("/login")
  public String login() {
    return "login";
  }

}
