package Exercise5.Memento;

public class MementoPattern {
    public static void main(String[] args) {
        Student student = new StudentDetails();

        student.setRollNumber(8);
        student.setStudentName("Sai");

        PreviousStudentStateToCareTaker previousStudentStateToCareTaker = student.backupLastStudent();

        student.unpredictedEvent();
        System.out.println("Roll Number: "+student.getRollNumber());
        System.out.println("Student Name: "+student.getStudentName());

        student.restoreLastStudent(previousStudentStateToCareTaker);
        System.out.println("Data restored from backup successfully!");
        System.out.println("Roll Number: "+student.getRollNumber());
        System.out.println("Student Name: "+student.getStudentName());
    }
}