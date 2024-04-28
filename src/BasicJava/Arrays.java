package BasicJava;

import java.util.Scanner;

public class Arrays {
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
				}else {
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int min_index= i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					min_index=j;
				}
			}
			swap(arr,min_index,i);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int binarySearch(int[] arr,int x) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]>x) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static int duplicateNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(x==arr[j]) {
					return x;
				}
			}
		}
		return -1;
	}
	public static void commonElements(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			int x=arr1[i];
			for(int j=0;j<arr2.length;j++) {
				if(x==arr2[j]) {
					System.out.println(x);
				}
			}
		}
	}
	public static void sort01(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(true) {
			while(i<arr.length && arr[i]==0) {
				i++;
			}
			while(j>=0 && arr[j]==1) {
				j--;
			}
			if(i==arr.length || j<0) {
				break;
			}
			if(i>j) {
				break;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public static void pairSum(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(x+arr[j]==sum) {
					System.out.print(x+" "+arr[j]);
				}
			}
		}
		
	}
	public static int uniqueNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			int x=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(x==arr[j]) {
						isDuplicate=true;
						break;
					}
				}
			}
			if(isDuplicate ==false) {
				return x;
			}
			
		}
		return -1;
	}
	
	
	public static int largestInArray(int[] arr) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	public static void increment(int[] arr) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
	}
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("give me size of array ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the value for index " + i + " : ");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr=takeInput();
		print(arr);
		bubbleSort(arr);
		print(arr);
		
//		int x=5;
//		int ans=binarySearch(arr,x);
//		System.out.print("Binary search result: "+ans);
//		print(arr);
		
		
//		increment(arr);
//		System.out.print(arr[0]);
		
//		int largest=largestInArray(arr);
//		System.out.print(largest);

//		System.out.print(sum);
//		System.out.println("size of arr is "+arr.length);
		
	}

}
