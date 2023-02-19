public class Day1_27 {
    public static void main(String[] args) {
        float investment = 14000;
        investment = increase(investment, 40);  //year one
        investment = decrease(investment, 1500);    //year two
        investment = increase(investment, 12);  //year three
        System.out.println("The investment after 3 years will be : "+investment);
    }

    public static float increase(float inv, int percentage) {
        float invPer;
        invPer = inv*percentage/100;
        inv += invPer;
        return inv;
    }

    public static float decrease(float inv, int amount) {
        inv -= amount;
        return inv;
    }
}