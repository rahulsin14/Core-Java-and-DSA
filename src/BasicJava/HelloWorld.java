package BasicJava;

import java.util.Scanner;

public class HelloWorld {
	//factorial code
	public static int fact(int n) {
		int nfact=1;
		int i=1;
		while(i<=n) {
			nfact=nfact*i;
			i=i+1;
		}
		return nfact;
	}
	//ncr
	public static int nCr(int n,int r) {
		int nfact=fact(n);
		int rfact=fact(r);
		int nrfact=fact(n-r);
		int ans=nfact/(rfact*nrfact);
		return ans;
	}
	//prime number fucntion
	public static boolean isPrime(int n) {
		int count=2; 
		while(count<=n-1) {
			if(n%count==0) {
				return false;
			}
			count=count+1;
		}
		return true;
	}
	//even numbers
	public static void evenNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static int a(int n) {
		n++;
		return n;
	}
	public static int b(int n) {
		return a(n)+2;
	}
	public static int c(int n) {
		return b(n)+a(2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print(c(6));

		
		
		//		int n=s.nextInt();
//		n=increment(n);
//		System.out.print(n);
//		evenNumbers(n);
		
//		for(int i=2;i<=n;i++) {
//			if(isPrime(i)) {
//				System.out.println(i);
//			}
//		}
		
		
//		String a="abc";
//		String[] ch=a.split("");
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]+" ");
//		}
		//for loop 
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			System.out.print(i);
//		}
//	
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		// Examples of inc and dec
//		int a=5;
//		int b=7;
//		if(a++>=5 && b--<7) {
//			System.out.print("inside if");
//		}
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		if(a++>5 || b--<7) {
//			System.out.print("inside if");
//		}
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		
//		
//		//Increment/Decrement operators
//		int i=5;
//		int a=++i;
//		int b=(i--)+(++i);
//		int c=(++a)+(b--)+(--i);
//		System.out.println(i);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		
//		
//		//Scope
//		int n=5;
//		int i=1;
//		while(i<=n) {
//			int j=2;
//			System.out.print(j);
//			j=j+1;
//			i=i+1;
//		}
//		if(i==5) {
//			int x=2;
//		}
//		System.out.print(x);
//		
//		
//		
//		
//		
//		
//		//Inverted Triangle
//		Scanner s =new Scanner(System.in);
//		int n=s.nextInt();
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j=j+1;
//			}
//			int k=1;
//			while(k<=n-i+1) {
//				System.out.print("*");
//				k=k+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//		
//		//Full Diamond
//		Scanner s =new Scanner(System.in);
//		int n=s.nextInt();
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n-i) {
//				System.out.print(" ");
//				j=j+1;
//			}
//			int k=1;
//			while(k<=2*i-1) {
//				System.out.print("*");
//				k=k+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//		i=1;
//		while(i<=n-1) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(" ");
//				j=j+1;
//			}
//			int k=1;
//			while(k<=2*(n-i)-1) {
//				System.out.print("*");
//				k=k+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		Half Diamond
//		Scanner s =new Scanner(System.in);
//		int n=s.nextInt();
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n-i) {
//				System.out.print(" ");
//				j=j+1;
//			}
//			int k=1;
//			while(k<=2*i-1) {
//				System.out.print("*");
//				k=k+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//		
//		
//		
//		
//		
//		
//		
//		
////Pattern -- ABC
////		     ABC
////		     ABC
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print((char)('A'+j-1));
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//		
//		
//		
//		
//		
//		//Table
//		int n=s.nextInt();
//		int i=1;
//		while(i<=10) {
//			System.out.println(n + " * "+ i + " = " + n*i);
//			i=i+1;
//		}
//		
//		//Factors of a number
//		int n=s.nextInt();
//		int i=2;
//		while(i<=n-1) {
//			if(n%i==0) {
//				System.out.println(i);
//			}
//			i=i+1;
//		}
//		
//		
//		//sum of digits
//		int n=s.nextInt();
//		int sum=0;
//		while(n>0) {
//			int mod= n%10;
//			sum=sum+mod;
//			n=n/10;
//		}
//		System.out.print(sum);
//		
//		
//		//Power of a number
//		int x=s.nextInt();
//		int n=s.nextInt();
//		int ans=1;
//		int i=1;
//		while(i<=n) {
//			ans=ans*x;
//			i=i+1;
//		}
//		System.out.print(ans);
//		
//		
//		
//		
////Pattern --   *
////		      **
////		     *** 
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
//		
//		
//	//Prime number	
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
//		
//		//Sum of n numbers
//		int count =1;
//		int sum=0;
//		while(count<=n) {
//			if(count%2==0) {
//				sum= sum+count;
//			}
//			count=count+1;
//		}
//		System.out.print(sum);
//		
//		//greatest of 3 numbers
//		int a =s.nextInt();
//		int b =s.nextInt();
//		int c =s.nextInt();
//		if(a>=b && a>=c) {
//			System.out.print( a +" is the greatest");
//		}else if(b>=a && b>=c) {
//			System.out.print(b+ " is the greatest");
//		}else {
//			System.out.print(c+ " is the greatest");
//		}
//		
//		// logical and relational operators
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
