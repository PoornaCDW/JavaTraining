package Exercise5.Memento;

public class StudentDetails implements Student {
    private int rollNumber;
    private String studentName;

    @Override
    public PreviousStudentStateToCareTaker backupLastStudent() {
        return new PreviousStudent(rollNumber, studentName);
    }

    @Override
    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public void restoreLastStudent(PreviousStudentStateToCareTaker previousStudentStateToCareTaker) {
        this.rollNumber = ((PreviousStudentStateToOriginator)previousStudentStateToCareTaker).getRollNumber();
        this.studentName = ((PreviousStudentStateToOriginator)previousStudentStateToCareTaker).getStudentName();
    }

    @Override
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void unpredictedEvent() {
        System.out.println("An unpredicted event has happend! All the data has been lost.");
        rollNumber = 3331334;
        studentName = null;
    }
}