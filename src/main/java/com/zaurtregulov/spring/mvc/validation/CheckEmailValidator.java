package com.zaurtregulov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//дженерики: первый - аннотация к которой применяем валидацию, второй - тип данных к которому применяется аннотация
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

  //переменная которая содержит хвост email
  private String endOfEmail;

  //придаем значение переменной endsOfEmail
  @Override
  public void initialize(CheckEmail checkEmail) {
    endOfEmail = checkEmail.value(); //за концовку имейла отвечает value() из нашей аннотации
  }

  //здесь происходит проверка бизнес правила
  @Override
  public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
    return enteredValue.endsWith(endOfEmail); //проверяем введенные данные от пользователя(такие же ли как задано в правилах)
  }
}
