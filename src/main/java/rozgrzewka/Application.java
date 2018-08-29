package rozgrzewka;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        //int[] result = reverseArray(new int[]{1,2,4,5,6});
        int[] tab = new int[]{1, 5, 3, 76, -81, 23, 54};
        int tabMin = getMin(tab);
        System.out.println(tabMin);

    }
    static int getMin(int[] input){
        int min = input[0];
//        for (int i = 1; i < input.length; i++) {
//            if(input[i]<min){
//                min=input[i];
//            }
//
//        }
        return min;

    }
}

