package designPattern.MVCPattern;

public class StudentContRoller {
    private Student student;
    private View view;
    public StudentContRoller(Student student, View view){
        this.student=student;
        this.view=view;
    }
    public void update(){
        view.printInfo(student.getName());
    }
}
