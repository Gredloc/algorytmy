import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] tablica = {7, 6, 1, 3, 8, 10, 13, 2};
        int dlugosc = tablica.length;
        int maxx = tablica[0];
        int min = tablica[0];


        //printArray(tablica);
        //System.out.println();
        //swap(tablica, 2, 1);
        //printArray(tablica);
        //System.out.println();
       int[] wynik =doubleArray(tablica);
       //printArray(wynik);
       //System.out.println();
        int[] tablicaWynikowa = reverseArray(tablica);
        //printArray(tablicaWynikowa);
        //System.out.println(maxx);
        //System.out.println(min);


        }
    static int getMax(int[] input) {
        int max = input[0];
        return max;
    }
    static int getMin(int[] input){
        int min = input[0];
        return min;
    }
    static int[] reverseArray(int[] input) {
        int[] result = new int[input.length];
        for (int x = input.length - 1; x >= 0; x--) {
            result[input.length - x - 1] = input[x];

        }
        return result;
    }
    static void printArray(int[] input){
        IntStream.of(input).forEach((number)-> System.out.print(number+" "));
    }
    static int[] doubleArray(int[] input){
        int[] doubleArray = new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            doubleArray[i] = input[i] *2;

        }
        return doubleArray;

    }
    static void swap(int[] tablica, int index1, int index2){
        int temp = tablica[index1];
        tablica[index1] = tablica[index2];
        tablica[index2] = temp;

    }
}

