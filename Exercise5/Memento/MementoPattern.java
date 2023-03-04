package Exercise5.Memento;

public class MementoPattern {
    public static void main(String[] args) {
        StudentOriginator studentOriginator = new StudentOriginator();
        StudentCaretaker caretaker = new StudentCaretaker();
        studentOriginator.setName("Amir");
        studentOriginator.setAge(21);
        studentOriginator.setGPA(2.5);
        caretaker.save(studentOriginator);

        studentOriginator.setName("Kiran");
        studentOriginator.setAge(23);
        studentOriginator.setGPA(4.0);
        caretaker.save(studentOriginator);

        studentOriginator.setName(null);
        studentOriginator.setAge(30923);
        studentOriginator.setGPA(44.8);

        System.out.println("Modified student details:");
        studentOriginator.display();

        caretaker.undo(studentOriginator);

        System.out.println("Previous restored student details:");
        studentOriginator.display();

        caretaker.undo(studentOriginator);

        System.out.println("Previous restored student details(x2):");
        studentOriginator.display();
    }
}