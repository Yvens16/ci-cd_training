package com.ci_cd_training.ci.cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  
  @GetMapping("/data")
  public String getData() {
    return "Hello";
  }
}
