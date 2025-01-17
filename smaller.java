package day2;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c){
            System.out.println("A is Greater then B and C.");
        }
        else if(b > a && b > c){
            System.out.println("B is Greater then A and C.");
        }
        else{
            System.out.println("C is Greater then A and B.")
        }
	}

}
