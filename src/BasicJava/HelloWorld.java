package BasicJava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j=j+1;
			}
			int k=1;
			while(k<=2*i-1) {
				System.out.print("*");
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
		
		
		
		
		
		
		
		
//		int p=0;
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print((char)('A'+j-1));
////				p=p+1;
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
		
		
		
		
		
		//Table
//		int n=s.nextInt();
//		int i=1;
//		while(i<=10) {
//			System.out.println(n + " * "+ i + " = " + n*i);
//			i=i+1;
//		}
		
		//Factors of a number
//		int n=s.nextInt();
//		int i=2;
//		while(i<=n-1) {
//			if(n%i==0) {
//				System.out.println(i);
//			}
//			i=i+1;
//		}
		
		
		//sum of digits
//		int n=s.nextInt();
//		int sum=0;
//		while(n>0) {
//			int mod= n%10;
//			sum=sum+mod;
//			n=n/10;
//		}
//		System.out.print(sum);
		
		
		//Power of a number
//		int x=s.nextInt();
//		int n=s.nextInt();
//		int ans=1;
//		int i=1;
//		while(i<=n) {
//			ans=ans*x;
//			i=i+1;
//		}
//		System.out.print(ans);
		
		
		
		
		
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n-i) {
//				System.out.print(" ");
//				j=j+1;
//			}
//			while(j<=n) {
//				System.out.print("*");
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
		
		
		
//		int count=2;
//		boolean isPrime =true; 
//		while(count<=n-1) {
//			if(n%count==0) {
//				isPrime=false;
//				break;
//			}
//			count=count+1;
//		}
//		if(isPrime==true) {
//			System.out.print( n + " is a prime number");
//		}else {
//			System.out.print( n + " is not prime number");
//		}
//		
//		int count =1;
//		int sum=0;
//		while(count<=n) {
//			if(count%2==0) {
//				sum= sum+count;
//			}
//			count=count+1;
//		}
//		System.out.print(sum);
//		int b =s.nextInt();
//		int c =s.nextInt();
//		if(a>=b && a>=c) {
//			System.out.print( a +" is the greatest");
//		}else if(b>=a && b>=c) {
//			System.out.print(b+ " is the greatest");
//		}else {
//			System.out.print(c+ " is the greatest");
//		}
//		boolean ans= a!=b;
//		System.out.print(a>b && b!=5);
//		System.out.print(a<b && a!=5);
//		System.out.print(a>b || b!=5);
//		System.out.print(a<b || a!=5);
//		System.out.print(a>b ^ b!=5);
//		System.out.print(a<b ^ a!=5);
//		System.out.print(!ans);

	}
	

}
