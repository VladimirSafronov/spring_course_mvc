package com.zaurtregulov.spring.mvc;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

  /*
  при вводе в браузере "/" будет вызываться метод, который будет отображать содержимое файла с именем возвращаемого
  значения (префикс и суффикс указаны в конфигурационном файле applicationContext.xml) название метода может быть
  любым, он может быть с параметрами, возвращаемое значение тоже может быть другим.
  */
  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }

  @RequestMapping("/askDetails")
  public String askEmployeeDetails(Model model) {

    model.addAttribute("employee", new Employee());

    return "ask-emp-details-view";
  }

  //в @RequestMapping мы указываем путь к методу и с каким типом запроса он работает
  //правильным будет изменить аннотацию на @GetMapping (для запроса POST - @PostMapping
//  @RequestMapping(path="/showDetails", method = RequestMethod.GET)
  @GetMapping("/showDetails")
  public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp,
      BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "ask-emp-details-view";
    } else {
      return "show-emp-details-view";
    }
  }

//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails() {
//    return "show-emp-details-view";
//  }

//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails(HttpServletRequest request, Model model) {
//
//    String empName = request.getParameter("employeeName");
//    empName = "Mr. " + empName;
//    model.addAttribute("nameAttribute", empName); // добавление параметров в модель: первое значение имя
//    // аттрибута, второй - его значение. И уже во view, можно обратиться к значению аттрибута по имени.
//
//    model.addAttribute("description", " - udemy instructor");
//
//    return "show-emp-details-view";
//  }

  // второй способ использования параметра (этот вариант предпочтительнее предыдущего)
//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
//
//    empName = "Mr. " + empName;
//    model.addAttribute("nameAttribute", empName); // добавление параметров в модель: первое значение имя
//    // аттрибута, второй - его значение. И уже во view, можно обратиться к значению аттрибута по имени.
//
//    return "show-emp-details-view";
//  }
}
