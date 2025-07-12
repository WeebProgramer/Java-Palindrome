

public class Palindrome {

    public static void main(String[] args) {
        String Palindrome  = "";
        String str = "ollo";
        String reverse = "";

        for (int i = 1; i <= str.length(); i++) {
            Palindrome = Palindrome + str.charAt(str.length()-i);
            reverse = reverse + str.charAt(str.length()-i);
        }

       // System.out.println(Palindrome);
        if (str.equalsIgnoreCase(Palindrome)){
            System.out.println("Passed");
        }
   else{
            System.out.println("Failed");
        }
        System.out.println(reverse);

    }


}
