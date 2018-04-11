package com.synerzip.dockerscal.com.synerzip.dockerscal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jeevan
 */
@RestController
public class HomeController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String hello() {
    return "Okey";
  }
}
