package Exercise5.Memento;

public interface Student {
    //Memento
    public PreviousStudentStateToCareTaker backupLastStudent();
    public void restoreLastStudent(PreviousStudentStateToCareTaker previousStudentStateToCareTaker);

    //Originator services
    public int getRollNumber();
    public String getStudentName();
    public void setRollNumber(int rollNumber);
    public void setStudentName(String studentName);
    public void unpredictedEvent();
}