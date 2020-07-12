package zadania;

public class Zadanie4 {
    // Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
    //Przykład:
    // + zadana tablica [12, 7, 19]
    //wynik [19, 7, 12]
    public static int[] switchTable(int[] array1) {
        if (array1.length > 1){
            int tmp = array1[0];
            array1[0] = array1[array1.length -1];
            array1[array1.length -1] = tmp;
        }
        return array1;
    }
    public static void printArray (int[] array) {
        for ( int value : array ) {
            System.out.print("[" + value + "] ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int[] beforeArray = {12, 7, 19};
        printArray(beforeArray);
        int[] afterArray = switchTable(beforeArray);
        Zadanie4.printArray(afterArray);
    }
}
