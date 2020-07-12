package zadania;

public class Zadanie3 {
    public static int sumOfCalculation(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sumXY = sumOfCalculation(1, 4);
        System.out.println(sumXY);
    }
}