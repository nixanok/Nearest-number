import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int x = scanner.nextInt();
        int minDifference = Integer.MAX_VALUE;

        int nearestNumber = -1;

        for(Integer number : numbers) {
            if(Math.abs(number - x) < minDifference) {
                minDifference = Math.abs(number - x);
                nearestNumber = number;
            }
        }

        System.out.println(nearestNumber);

    }
}
