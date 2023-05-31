import java.util.Scanner;

public class TestVariableArray {
	
	public static void acceptData(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter number of columns: ");
			int col = sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter a number: ");
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}
	
	public static void displayData(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][]=new int[3][];
		acceptData(arr);
		displayData(arr);
	}
}
