package SixNovember;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Note".toLowerCase();
        String str2 = "Tone".toLowerCase();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String sorted1 = new String(array1);
        String sorted2 = new String(array2);

        if (sorted1.equals(sorted2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
