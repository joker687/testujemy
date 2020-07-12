package zadania;

public class Zadanie8 {
    public static boolean isArithmetic(int[] arrayArithmetic){
        if (arrayArithmetic.length < 2) {
            return  false;
        }
        boolean isCorrect = true;
        int gap = arrayArithmetic[1] - arrayArithmetic[0];
        for (int i = 2; i < arrayArithmetic.length; i++){
            int actualGap = arrayArithmetic[i] - arrayArithmetic[i-1];
            if (actualGap != gap){
                isCorrect = false;
                break;
            }
        }

        return isCorrect;
    }

    public static void main(String[] args) {
        int[] arrayIsNotCorrect = {4, 52, 4, 7};
        int[] arrayIsCorrect = {1, 5, 9, 13};
        Zadanie6.tablePrinter(arrayIsCorrect);
        boolean result = isArithmetic(arrayIsCorrect);
        System.out.println(result);
    }
}
