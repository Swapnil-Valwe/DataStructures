package ArrayAssignmentDS;
import java.util.Scanner;
public class MultiDimArrayAddMulti {

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("input array: ");
		int r = sc.nextInt(), c = sc.nextInt();
		//int r1 = sc.nextInt(), c1 = sc.nextInt();


		int[][] arr = new int [r][c];
		int[][] arr1 = new int [r][c];
		//int[][] arr2 = new int [r1][c1];
		System.out.print("1st array: ");


		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) { 
				arr [i] [j] = sc.nextInt();
				//System.out.println(arr[i][j] + " "); 
			} 
		}

		System.out.print("2nd array: ");

		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) { 
				arr1 [i] [j] = sc.nextInt(); 
			} 
		}

/*===================Multiplication=======================*/
		int[][] multiply = new int[r][c]; 
		for(int i = 0; i < r; i++) {
			for (int j = 0; j < c/*c is column of 2nd array*/; j++) {
				for(int k = 0; k < c/*c is column of 1st array*/; k++) {


					multiply [i][j] += arr[i][k] * arr1[k][j];//multiplication
				}
			}
		}

		System.out.println("Product of arrays: ");

		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) { 

				System.out.print(multiply [i][j] + " "); 

			}   


			System.out.println();
			sc.close();

		} 
		
		
/*=======================Transpose=====================*/		

		System.out.println("Transpose of Product of arrays: ");

		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) { 

				System.out.print(multiply [j][i] + " "); 

			}   


			System.out.println();
			sc.close();

		}
		
/*===========================Addition==========================*/
		int[][] add = new int[r][c]; 
		for(int i = 0; i < r; i++) {
			for (int j = 0; j < c/*c is column of 2nd array*/; j++) {
				


					add [i][j] += arr[i][j] + arr1[i][j];//addition
				
			}
		}

		System.out.println("Product of arrays: ");

		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) { 

				System.out.print(add [i][j] + " "); 

			}   


			System.out.println();
			sc.close();

		} 
	
	} 
} 


