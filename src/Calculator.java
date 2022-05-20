import java.util.Scanner;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        System.out.println(first+second);

        int sum = 0;
        int num = 0;
        String function = scanner.nextLine();
        if (function.equalsIgnoreCase("addition")) {
            while(scanner.hasNextInt() == true) {
                num = scanner.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
        if(function.equalsIgnoreCase("multiply")) {
            while(scanner.hasNextInt() == true) {
                sum = scanner.nextInt();
                sum = sum*scanner.nextInt();
            }
            System.out.println(sum);
        }
        if(function.equalsIgnoreCase("divide")) {
            while(scanner.hasNextInt() == true) {
                sum = scanner.nextInt();
                sum = sum / scanner.nextInt();
            }
            System.out.println(sum);
        }
        if(function.equalsIgnoreCase("subtract")) {
            while(scanner.hasNextInt() == true) {
                num = scanner.nextInt();
                num -= scanner.nextInt();
            }
            System.out.println(num);
        }

    }
}