

public class Palindrome {

    public static void main(String[] args) {
        String Palindrome  = ""; // Temp variable to check the word in reverse 
        String str = "ollo"; // Change this to check if the word is a palindrome 


        for (int i = 1; i <= str.length(); i++) {
            Palindrome = Palindrome + str.charAt(str.length()-i);
       }

        if (str.equalsIgnoreCase(Palindrome)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }


}
