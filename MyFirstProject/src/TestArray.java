import java.util.Scanner;

public class TestArray {

	public static void acceptData(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		System.out.print("Enter a number: ");
		arr[i]= sc.nextInt();
		}
		sc.close();
	}
	 public static void displayData(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+"\t");
		 }
	 }
	
	public static void main(String[] args) {
		int arr[]=new int[3];
		acceptData(arr);
		displayData(arr);
	}

}
