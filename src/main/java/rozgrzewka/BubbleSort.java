package rozgrzewka;

import java.util.stream.IntStream;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class BubbleSort {
    public static void main(String[] args) {

        int[] tab = new int[]{3, 5, 7, 1, 2, 4, 8};
        printArray(tab);
        bubbleSort(tab);
        System.out.println();
        printArray(tab);
    }

    static void bubbleSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < (input.length - i); j++) {
                if (input[j - 1] > input[j])
                swap(input, j, j -1);


            }
        }


    }


        static void swap ( int[] tablica, int index1, int index2){
            int temp = tablica[index1];
            tablica[index1] = tablica[index2];
            tablica[index2] = temp;
        }
    static void printArray(int[] input){
        IntStream.of(input).forEach((number)-> System.out.print(number+" "));
    }
    }
