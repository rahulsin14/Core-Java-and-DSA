package BasicJava;
import java.util.Scanner;
public class Arrays2D {
	
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	public static boolean isPresentBetter(String str1,String str2) {
		int i=0;
		int j=str2.length()-1;
		while(j<str1.length()) {
			if(str1.substring(i,j+1).equals(str2)) {
				return true;
			}
			i++;
			j++;
		}
		return false;
	}
	public static boolean isPresent(String str1,String str2) {
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<=str1.length();j++) {
				if(str1.substring(i,j).equals(str2)) {
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean ans=isPalindrome(str);
		System.out.print(ans);
		
		
		
		
//		String rev="";
//		for(int i=0;i<str.length();i++) {
//			rev=str.charAt(i)+rev;
//		}
//		if(rev.equals(str)) {
//			System.out.print("Palindrome string");
//		}else {
//			System.out.print("Not a Palindrome string");
//		}
		
		
		
//		String str=s.next();
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<=str.length();j++) {
//				System.out.println(str.substring(i,j));
//			}
//		}
		
		
//		String str=s.next();
//		String ans=""+str.charAt(0);
//		for(int i=1;i<str.length();i++) {
//			if(str.charAt(i)!=str.charAt(i-1)) {
//				ans=ans+str.charAt(i);
//			}
//		}
//		System.out.print(ans);
		
		
		
		
		
//		Scanner s=new Scanner(System.in);
//		int x=s.nextInt();
//		String str= s.next();
//		System.out.print("str string is "+str);
//		int n=s.nextInt();
//		String[] arr=new String[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=s.next();
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(i+"th element in arr is "+arr[i]);
//		}
		
		
//		String x="abc";
//		String z="abc";
//		z=z+x;
//		String y=new String("abc");
//		char ch=x.charAt(1);
//		int count=0;
//		for(int i=0;i<x.length();i++) {
//			if(x.charAt(i)=='a') {
//				count++;
//			}
//		}
//		System.out.print(count);
		
		
//		int[][] ans=new int[3][];
//		int[] arr1=new int[5];
//		ans[0]=arr1;
//		int[] arr2=new int[4];
//		ans[1]=arr2;
//		ans[2]=new int[2];
//		for(int i=0;i<ans.length;i++) {
//			for(int j=0;j<ans[i].length;j++) {
//				System.out.print(ans[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int i=10;
//		increamentVar(i);
//		System.out.println(i);
//		int[] arr= {1,2,3,4};
//		increament1D(arr);
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[j]+" ");
//		}
//		System.out.println();
//		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
//		increament2D(mat);
//		print(mat);
		
	}
	public static void increamentVar(int x) {
		x++;
	}
	public static void increament1D(int[] arr) {
		arr[0]++;
	}
	public static void increament2D(int[][] mat) {
		mat[0][0]++;
		mat[1][2]++;
	}
	public static int maxSum(int[][] mat) {
		int colMax=Integer.MIN_VALUE;
		for(int j=0;j<mat[0].length;j++) {
			int sum=0;
			for(int i=0;i<mat.length;i++) {
				sum=sum+mat[i][j];
			}
			if(sum>colMax) {
				colMax=sum;
			}
		}
		int rowMax=Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++) {
			int sum=0;
			for(int j=0;j<mat[0].length;j++) {
				sum=sum+mat[i][j];
			}
			if(sum>rowMax) {
				rowMax=sum;
			}
		}
		return Math.max(colMax, rowMax);
		
		
	}
	public static int sum(int[][] mat) {
		int sum=0;
		for(int row=0;row<mat.length;row++) {
			for(int col=0;col<mat[0].length;col++) {
				sum=sum+mat[row][col];
			}
		}
		return sum;
	}
	public static void print(int[][] mat) {
		for(int row=0;row<mat.length;row++) {
			for(int col=0;col<mat[0].length;col++) {
				System.out.print(mat[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] takeInput() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the rows for 2d array : ");
		int numRows=s.nextInt();
		System.out.print("Enter the columns for 2d array : ");
		int numCols =s.nextInt();
		int[][] mat=new int[numRows][numCols];
		for(int row=0;row<numRows;row++) {
			for(int col=0;col<numCols;col++) {
				System.out.print("Give an element for row "+ row + "and col "+col);
				mat[row][col]=s.nextInt();
			}
		}
		return mat;
	}

}
