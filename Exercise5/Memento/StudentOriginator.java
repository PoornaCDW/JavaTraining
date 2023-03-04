package Exercise5.Memento;

class StudentOriginator {
    private String name;
    private int age;
    private double gpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public Memento save() {
        return new Memento(name, age, gpa);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.gpa = memento.getGPA();
    }

    public void display() {
        System.out.println("Name: " + name + "\n Age: " + age + "\n GPA: " + gpa);
    }
    
    static class Memento {
        private final String name;
        private final int age;
        private final double gpa;

        public Memento(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGPA() {
            return gpa;
        }
    }
}