package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  /* при вводе в браузере "/" будет вызываться метод, который будет отображать содержимое файла с именем
  возвращаемого значения (префикс и суффикс указаны в конфигурационном файле applicationContext.xml)
  название метода может быть любым, он может быть с параметрами, возвращаемое значение тоже может быть другим*/
  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }
}
