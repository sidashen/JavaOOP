package model;

public class Student {
  public String name;
  public int age;
  public String gender;
  public int studentNumber;

  //构造方法
  public Student(String name, int age, String gender, int studentNumber) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.studentNumber = studentNumber;
  }

  //成员方法
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

}
