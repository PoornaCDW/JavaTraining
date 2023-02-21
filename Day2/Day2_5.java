public class Day2_5 {
    static int objCount;
    
    static {
        objCount = 0;
    }

    Day2_5() {
        objCount++;
    }

    public int returnObjectCount() {
        return objCount;
    }

    public static void main(String[] args) {
        Day2_5 o1 = new Day2_5();
        Day2_5 o2 = new Day2_5();
        System.out.println("Objects created at this point : "+o2.returnObjectCount());
        Day2_5 o3 = new Day2_5();
        System.out.println("Objects created at this point : "+o2.returnObjectCount());
    }
}
