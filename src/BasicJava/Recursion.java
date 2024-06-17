package BasicJava;

public class Recursion {
	public static void main(String[] args) {
		int[] arr= {1,3,5,10,7};
		int x=6;
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void quickSort(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int pivot=partition(arr,start,end);
		quickSort(arr,start,pivot-1);
		quickSort(arr,pivot+1,end);
	}
	public static int partition(int[] arr, int start,int end) {
		int pivotEle=arr[start];
		int pivot=start;
		int count=0;
		for(int i=start;i<=end;i++) {
			if(arr[i]<pivotEle) {
				count++;
			}
		}
		arr[start]=arr[start+count];
		arr[start+count]=pivotEle;
		pivot=start+count;
		int i=start;
		int j=end;
		while(i<pivot && j>pivot) {
			while(arr[i]<pivotEle) {
				i++;
			}
			while(arr[j]>pivotEle) {
				j--;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return pivot;
	}
	public static void mergeSort(int[] arr) {
		if(arr.length<=1) {
			return;
		}
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int[] arr1=new int[mid-start+1];
		int[] arr2=new int[end-mid];
		int k=0;
		for(int i=start;i<=mid;i++) {
			arr1[k]=arr[i];
			k++;
		}
		k=0;
		for(int i=mid+1;i<=end;i++) {
			arr2[k]=arr[i];
			k++;
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr1,arr2,arr);
	}
	public static void merge(int[] arr1,int[] arr2,int[] arr) {
		int i=0;
		int j=0;
		int k=0;
		int[] ans=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		for(int y=0;y<ans.length;y++) {
			arr[y]=ans[y];
		}
	}
	public static int binarySearch(int[] arr,int start, int end , int x) {
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[mid]>x) {
			return binarySearch(arr,start,mid-1,x);
		}else {
			return binarySearch(arr,mid+1,end,x);
		}
	}
	public static int lootHouses(int[] arr,int start) {
		if(start>=arr.length) {
			return 0;
		}
		int ans1=arr[start]+lootHouses(arr,start+2);
		int ans2=lootHouses(arr,start+1);
		int ans=Math.max(ans1, ans2);
		return ans;
	}
	public static void subsequence1(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		subsequence1(str.substring(1),ans+str.charAt(0));
		subsequence1(str.substring(1),ans);
	}
	public static void letterComb(String digits,String[] keypad,String ans) {
		if(digits.length()==0) {
			System.out.println(ans);
			return;
		}
		int x=digits.charAt(0)-'0';
		String key=keypad[x];
		for(int i=0;i<key.length();i++) {
			letterComb(digits.substring(1),keypad,ans+key.charAt(i));
		}
		
	}
	
	public static String[] subsequence(String str) {
		if(str.length()==0) {
			String[] ans=new String[1];
			ans[0]="";
			return ans;
		}
		String[] smallAns=subsequence(str.substring(1));
		String[] ans=new String[2*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=str.charAt(0)+ smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		return ans;
	}
	public static String removeDuplicates(String str) {
		if(str.length()==1) {
			return str;
		}
		String smallAns= removeDuplicates(str.substring(1));
		if(str.charAt(0)==smallAns.charAt(0)) {
			return smallAns;
		}else {
			return str.charAt(0)+smallAns;
		}
		
	}
	public static String replaceX(String str,char x,char y) {
		if(str.length()==0) {
			return "";
		}
		String smallAns= replaceX(str.substring(1),x,y);
		if(str.charAt(0)==x) {
			return y+smallAns;
		}else {
			return str.charAt(0)+smallAns;
		}
	}
	public static String removeX(String str,char x) {
		if(str.length()==0) {
			return "";
		}
		String smallAns= removeX(str.substring(1),x);
		if(str.charAt(0)==x) {
			return smallAns;
		}else {
			return str.charAt(0)+smallAns;
		}
	}
	public static boolean isSorted(int[] arr,int start) {
		if(start==arr.length-1) {
			return true;
		}
		if(arr[start]>arr[start+1]) {
			return false;
		}
		boolean smallAns= isSorted(arr,start+1);
		return smallAns;
		
	}
	public static int power(int n,int x) {
		if(x==0) {
			return 1;
		}
		int smallAns=power(n,x-1);
		int ans= n*smallAns;
		return ans;
	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int smallAns= fact(n-1);
		int ans=n*smallAns;
		return ans;
	}
	public static void printNatural(int n) {
		if(n<=0) {
			return;
		}
		printNatural(n-1);
		System.out.print(n+" ");
	}
	public static int sum(int n) {
		if(n<=0) {
			return 0;
		}
		int smallAns=sum(n-1);
		int ans=n+smallAns;
		return ans;
	}
	public static int numOfDigits(int n) {
		if(n<=9) {
			return 1;
		}
		int smallAns= numOfDigits(n/10);
		int ans= smallAns+1;
		return ans;
	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int smallAns1=fib(n-1);
		int smallAns2=fib(n-2);
		return smallAns1+smallAns2;
	}
	public static int arraySum(int[] arr, int start) {
		if(start==arr.length) {
			return 0;
		}
		int smallAns=arraySum(arr,start+1);
		int ans= arr[start]+smallAns;
		return ans;
	}
	public static int linearSearch(int[] arr, int x,int start) {
		if(start==arr.length) {
			return -1;
		}
		if(arr[start]==x) {
			return start;
		}
		int smallAns=linearSearch(arr,x,start+1);
		return smallAns;
	}
}
