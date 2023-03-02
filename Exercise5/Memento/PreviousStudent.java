package Exercise5.Memento;

public class PreviousStudent implements PreviousStudentStateToCareTaker, PreviousStudentStateToOriginator {
    private int rollNumber;
    private String studentName;

    public PreviousStudent(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    @Override
    public int getRollNumber() {
        return rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }
}