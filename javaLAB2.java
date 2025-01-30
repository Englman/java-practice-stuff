import java.util.Scanner;
import java.util.Arrays;

public class javaLAB2 {
    public static void main(String[] args) {
        // TASK 1
        /*
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first digit: ");

            int int1 = scan.nextInt();

            System.out.print("Enter the second digit: ");

            int int2 = scan.nextInt();

            scan.close();

            System.out.print("Your first digit is: " + int1 + " and your second digit is: " + int2);

            int product = 0;

            for(int i = 0; i < int2; i++){
                product += int1;
            }

            System.out.print("\tThe product of your expression is: " + product);
        // END OF THE TASK 1

        // TASK 2
            int counter = 0;
            double sum = 0;
            int input = 0;
            double averageMeaning;

            System.out.print("Enter the set of values (0 to quit it): ");
            Scanner in = new Scanner(System.in);

            while((input = in.nextInt()) != 0){
                if(input != 0){
                    sum += input;
                    counter++;
                }
            }

            if(counter > 0){
                averageMeaning = sum / counter;

                System.out.print("The quantity of your set is: " + counter);
                System.out.print("\nThe average meaning of your set is: " + averageMeaning);
            }else{
                System.out.print("No data was entered...");
            }
        //END OF THE TASK 2

        //TASK 3
        int input = 0;
        double theBiggestValue = 0;

        System.out.print("Keep entering the digits (0 to quit it): ");
        Scanner in = new Scanner(System.in);

        while((input = in.nextInt()) != 0) {

            theBiggestValue = in.nextInt();

            if(input > theBiggestValue) {
                theBiggestValue = input;
            }
        }

        if(theBiggestValue == 0){
            System.out.print("No DATA was entered...");
        }

        System.out.print("The biggest value that you've presented among others is: " + theBiggestValue);
        // END OF THE TASK 3

        // TASK 4
        int n;
        int sum = 0;

        System.out.print("Enter the amount of the elements: ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        System.out.print("Your array will be consisted of " + n + " elements: \n");

        for(int i = 0; i < n; i++){
            sum += (2 * i + 1);
        }

        System.out.println("The sum of the first " + n + " odd elements is: " + sum);

        in.close();
        // END OF THE TASK 4

        // TASK 5
        int input = 0;
        double sum = 0;

        System.out.print("Enter the set of the digits (0 to quit it): ");
        Scanner in = new Scanner(System.in);

        while((input = in.nextInt()) != 0) {
            if(input % 2 != 0){
                sum += input;
            }
        }

        System.out.print("The sum of the odd integers is " + sum);
        in.close();
        //END OF THE TASK 5

        //TASK 6
            Scanner in = new Scanner(System.in);
            System.out.print("Enter three integers to compare: ");

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            System.out.print("You have entered these ones: " + a + ", " + b + ", " + c + "\n");

            int theBiggestAmong = theBiggestInt(a, b, c);
            System.out.print("The biggest integer among " + a + ", " + b + ", and " + c + " is: " + theBiggestAmong);
            in.close();

        //END OF THE TASK 6

        //TASK 7
            String str = "Greetings";
            System.out.println("The number of vowels in your string is: " + countVowels(str));
        // END OF THE TASK 7

        //TASK 8
            String[] words = {"something", "great", "fine", "interesting", "queue", "education"};
            String[] result = filterWords(words);
            System.out.print("Words with more than 4 vowels are: " + Arrays.toString(result));
        // END OF THE TASK 8

        //TASK 9
            String text1 = "Greetings, World";
            String text2 = "World";
            System.out.print(ifContains(text1, text2));
        //END OF THE TASK 9
         */

        //TASK 10
            System.out.print(isPalindrome("A man, a plan, a canal, Panama"));
            System.out.print(isPalindrome("race a car"));
        //END OF THE TASK 10
    }
    // TASK 6 FUNCTION
    public static int theBiggestInt(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    // END OF THE TASK 6 FUNCTION
    // TASK 7 FUNCTION
        public static int countVowels(String str) {
            int count = 0;
            String vowelsThemSelves = "aeiouAEIOU";
            for(char ch : str.toCharArray()) {
                if(vowelsThemSelves.indexOf(ch) != -1){
                    count++;
                }
            }

            return count;
        }
    // END OF THE TASK 7 FUNCTION
    //TASK 8 FUNCTION
        public static String[] filterWords(String[] words) {
            return Arrays.stream(words)
                        .filter(word -> countVowels(word) > 4)
                        .toArray(String[]::new);
        }
    //END OF THE TASK 8 FUNCTION
    //TASK 9 FUNCTION
        public static String ifContains(String text1, String text2) {
            return text1.contains(text2) ? "Yes, it contains" : "No, it ain't";
        }
    //END OF THE TASK 9 FUNCTION
    //TASK 10 FUNCTION
        public static String isPalindrome(String str) {
            String cleanedStr = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

            if(cleanedStr.equals(reversedStr)){
                return "Yes, it is a palindrome\n";
            }else{
                return "No, it is not a palindrome\n";
            }
        }
    //END OF TASK 10 FUNCTION
}
