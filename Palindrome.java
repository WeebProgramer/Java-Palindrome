

public class Palindrome (string str){

    public static void main(String[] args) {
        String Palindrome  = ""; // Temp variable to check the word in reverse 


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
