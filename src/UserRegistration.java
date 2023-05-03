
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //uc1
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Vidya");
        if (matcher.matches())
            System.out.println("valid firstname");
        else
            System.out.println("Invalid firstname");

        //uc2
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher("Balla");
        if (matcher1.matches())
            System.out.println("valid lastname");
        else
            System.out.println("Invalid lastname");

        //uc3
        Pattern pattern2 = Pattern.compile("^([a-z]{3}[.][a-z]{3}@([a-z]{2}[.][a-z]{2})[.][a-z]{2,}$)");
        // System.out.println("Enter email : ");
        Matcher matcher2 = pattern2.matcher("abc.xyz@bl.co.in");
        if (matcher2.matches())
            System.out.println("valid email");
        else
            System.out.println("Invalid email");

        //uc4
        Pattern pattern3 = Pattern.compile("^(\\+?\\d{1,3})\s\\d{10}$");
        Matcher matcher3 = pattern3.matcher("+91 8639637144");
        if (matcher3.matches())
            System.out.println("valid phone no");
        else
            System.out.println("Invalid phone no");

        //uc5
        //rule1: minimum 8 chracters
        Pattern pattern4 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher4 = pattern4.matcher("mySecretPassword");
        if (matcher4.matches())
            System.out.println("valid password_rule1");
        else
            System.out.println("Invalid password)rule1");

        //uc6
        //rule2: minimum 8 chracters with atleat 1 capital chracter
        Pattern pattern5 = Pattern.compile("^(?=[a-z]*[A-Z]).{8,}$");
        Matcher matcher5 = pattern5.matcher("pPassword");
        if (matcher5.matches())
            System.out.println("valid password_rule2");
        else
            System.out.println("Invalid password)rule2");

        //uc7
        //rule3: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        Pattern pattern6 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
        Matcher matcher6 = pattern6.matcher("PPPass8word");
        if (matcher6.matches())
            System.out.println("valid password_rule3");
        else
            System.out.println("Invalid password_rule3");

        //uc8
        //rule4: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        // and one special chracter
        Pattern pattern7 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
        Matcher matcher7 = pattern7.matcher("PPPass8*word");
        if (matcher7.matches())
            System.out.println("valid password_rule4");
        else
            System.out.println("Invalid password_rule4");


        //uc9
        //  1. abc@yahoo.com,
        //• 2. abc-100@yahoo.com,
        //• 3. abc.100@yahoo.com
        //• 2. abc111@abc.com,
        //• 4. abc-100@abc.net,
        //• 5. abc.100@abc.com.au
        //• 6. abc@1.com,
        //• 7. abc@gmail.com.com
        //• 8. abc+100@gmail.com
        String text = "Here are some sample email addresses:"+
                "        //  1. abc@yahoo.com,\n" +
                "        //• 2. abc-100@yahoo.com,\n" +
                "        //• 3. abc.100@yahoo.com\n" +
                "        //• 4. abc111@abc.com,\n" +
                "        //• 5. abc-100@abc.net,\n" +
                "        //• 6. abc.100@abc.com.au\n" +
                "        //• 7. abc@1.com,\n" +
                "        //• 8. abc@gmail.com.com\n" +
                "        //• 9. abc+100@gmail.com";

        // Define the regular expression to match email addresses
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Create a Pattern object from the regular expression
        Pattern pattern8 = Pattern.compile(emailPattern);

        // Use a Matcher object to find all occurrences of the pattern in the text
        Matcher matcher8 = pattern8.matcher(text);

        // Iterate over the matches and print each email address
        System.out.println("Valid email are : ");
        while (matcher8.find()) {
            String email = matcher8.group();
            System.out.println(email);
        }
    }
}

