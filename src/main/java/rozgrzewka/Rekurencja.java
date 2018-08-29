package rozgrzewka;

public class Rekurencja {
    public static void main(String[] args) {
        String word = "kajak";
    }

    boolean isPalindromeI(String word) {
        int indexFirst = 0;
        int indexLast = word.length();
        while (indexFirst < indexLast) {
            boolean isEq = word.charAt(indexFirst) != word.charAt(indexLast);
            if(isEq){
                return false;
            }
            indexFirst++;
            indexLast--;
        }

        return true;
    }
    boolean isPalindrome(String word) {
        word = "civic";
    }
}
