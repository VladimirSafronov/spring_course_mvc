package com.zaurtregulov.spring.mvc;


import com.zaurtregulov.spring.mvc.validation.CheckEmail;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {

  @Size(min = 2, message = "name must be longer than one symbol")
  private String name;
//  @NotNull(message = "surname is required field")
//  @NotEmpty(message = "surname is required field") //пропустит если ввести пробелы
  @NotBlank(message = "surname is required field")
  private String surname;
  @Min(value = 500, message = "salary must be more then 499")
  @Max(value = 1000, message = "salary must be less then 1001")
  private int salary;
  private String department;
  private Map<String, String> departments;
  private String carBrand;
  private Map<String, String> carBrands;
  private String[] languages;
  private Map<String, String> languageList;
  @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
  private String phoneNumber;
  @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
  private String email;

  public Employee() {
    departments = new HashMap<>();
    departments.put("Information technology", "IT");
    departments.put("Human resources", "HR");
    departments.put("Sales", "sales");

    carBrands = new HashMap<>();
    carBrands.put("BMW", "BMW");
    carBrands.put("Mercedes Benz", "MB");

    languageList = new HashMap<>();
    languageList.put("English", "EN");
    languageList.put("Deutch", "DE");
    languageList.put("French", "FR");
  }

  public Employee(String name, String surname, int salary, String department) {
    this.name = name;
    this.surname = surname;
    this.salary = salary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Map<String, String> getDepartments() {
    return departments;
  }

  public void setDepartments(Map<String, String> departments) {
    this.departments = departments;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public Map<String, String> getCarBrands() {
    return carBrands;
  }

  public void setCarBrands(Map<String, String> carBrands) {
    this.carBrands = carBrands;
  }

  public String[] getLanguages() {
    return languages;
  }

  public void setLanguages(String[] languages) {
    this.languages = languages;
  }

  public Map<String, String> getLanguageList() {
    return languageList;
  }

  public void setLanguageList(Map<String, String> languageList) {
    this.languageList = languageList;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        '}';
  }
}
