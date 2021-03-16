package com.ivoronline.springboot_log_configuration.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController1 {

  Logger log = LoggerFactory.getLogger(MyController1.class);

  @ResponseBody
  @RequestMapping("/Hello1")
  public String hello1() {
    log.error("Controller1 ERROR");
    log.warn ("Controller1 WARN" );
    log.info ("Controller1 INFO" );
    log.debug("Controller1 DEBUG");
    log.trace("Controller1 TRACE");
    return "Hello from Controller";
  }

}
