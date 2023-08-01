package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {

        int result = (first > second)? 10 : -10;
        System.out.println(result);
        }

    public static void main(String[] args) {
        TernaryAssignment ternaryAssignment = new TernaryAssignment();
        int first = 5;
        int second = 2;
        ternaryAssignment.assignAndPrintBasedOnWhichBigger(first,second);
    }
}