package designPattern.MVCPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        View view = new View();
        StudentContRoller studentContRoller = new StudentContRoller(student, view);
        studentContRoller.update();
        System.out.println("---");
        student.setName("小红");
        studentContRoller.update();
    }
}
