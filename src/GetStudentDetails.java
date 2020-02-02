import model.Student;

public class GetStudentDetails {

  public static void main(String[] args) {
    Student student = new Student("shasha", 18, "female", 20200202);
    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.gender);
    System.out.println(student.studentNumber);
  }

}
