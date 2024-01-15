package com.melody.accounts.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cava", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CavaController {

  @GetMapping
  public String sayHello(){
    return "Hello World";
  }

  @GetMapping("{name}")
  public String getUser(
      @PathVariable("name") String name
  ) {
    return "Ca va " + name;
  }

}
