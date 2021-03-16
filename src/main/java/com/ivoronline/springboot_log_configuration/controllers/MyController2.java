package com.ivoronline.springboot_log_configuration.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController2 {

  Logger log = LoggerFactory.getLogger(MyController2.class);

  @ResponseBody
  @RequestMapping("/Hello2")
  public String hello2() {
    log.error("Controller2 ERROR");
    log.warn ("Controller2 WARN" );
    log.info ("Controller2 INFO" );
    log.debug("Controller2 DEBUG");
    log.trace("Controller2 TRACE");
    return "Hello from Controller";
  }

}
