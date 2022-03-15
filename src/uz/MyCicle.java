package uz;

import java.util.Scanner;

public class MyCicle {
    public static void main(String[] args) {
        System.out.println("Enter number up to 100");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("numbers from one to n");
        //
        for (int i=1; i<=n; i++) {
            for (int j=1; j<i; j++) {
                if (i%j==0) {
                    continue;
                }
            }
            System.out.print(i + " ");
        }
    }
}