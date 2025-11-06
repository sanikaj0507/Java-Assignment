package SixNovember;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        String rev = "";
        
        str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
        	rev += str.charAt(i);
        }

        rev.toLowerCase();
        if (str.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
}

