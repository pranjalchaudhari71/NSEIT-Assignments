package Day3Assign;

import java.util.Scanner;


public class KboatOddEvenSum {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        long sumOdd = 0, sumEven = 0;
        
        if (m > n) {
            System.out.println("m should be less than n");
        }
        else {
            for (int i = m; i <=n; i++) {
                if (i % 2 == 0)
                    sumEven += i;
                else
                    sumOdd += i;
            }
            
            System.out.println("Even Sum: " + sumEven);
            System.out.println("Odd Sum: " + sumOdd);
        }
    }
}

