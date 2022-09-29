package com.zaurtregulov.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class) //какой класс является валидатором
public @interface CheckEmail {

  //дефолтные значение и сообщение об ошибке (применяется если в скобках в аннотации ничего не указывать)
  public String value() default "xyz.com";
  public String message() default "email must ends with xyz.com";

  public Class<?>[] groups() default {}; //позволяет разделять аннотации по группам
  public Class<? extends Payload>[] payload() default {}; //используется для переноса информации методанных клиента

}
