import model.Student;

public class GetStudentDetails {

  public static void main(String[] args) {
    Student student = new Student("shasha", 18, "female", 20200202);
    System.out.println(student.getName());
    System.out.println(student.getAge());
    System.out.println(student.getGender());
    System.out.println(student.getStudentNumber());
  }

}
