package Exercise5.Memento;

import java.util.Stack;

public class StudentCaretaker {
    private final Stack<StudentOriginator.Memento> studentStack = new Stack<>();

    public void save(StudentOriginator originator) {
        studentStack.push(originator.save());
    }

    public void undo(StudentOriginator originator) {
        if (!studentStack.isEmpty()) {
            originator.restore(studentStack.pop());
        }
    }
}