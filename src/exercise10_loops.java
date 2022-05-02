import java.util.Scanner;
public class exercise10_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            System.out.println(i);}
// Even Numbers Printing within the number given
//        for (int i = 0; i < number; i++) {
//             if ((i%2) == 0){
//             System.out.println(i);}
        //FizzBuzz
        for (int i = 1; i <= number; i++)
        {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
                System.out.println(i+"-FizzBuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println(i+"-Fizz");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println( i+ "-Buzz");
            else
                System.out.println(i+" is not divisible by 5 or 3"); // Not a multiple of 5 or 3

        }
    }
}
