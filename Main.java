package lesson4;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Input n");
n= sc.nextInt();
for(int i=1; i<=100; i++){
	if(i%n==0){
		System.out.print("4");
	}else{
		System.out.print("*");
	}
	
}
	
}
}