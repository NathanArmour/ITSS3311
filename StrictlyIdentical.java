import java.util.*;
public class StrictlyIdentical {

	public static boolean equals(int[] array1, int[] array2) {
		boolean equal = false;
		for(int a=0;a<array1.length;a++) {
			if(array1[a]==array2[a]) {
				equal = true;
			}
			else {
				equal=false;
				break;
			}
		}
		return equal;
	}
	public static void main(String args[]) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 elements of list1:");
			for(int a=0;a<5;a++) {
				array1[a]=scan.nextInt(); 
		}
		System.out.println("Enter 5 elements of list2:");
		for(int a=0;a<5;a++) {
			array2[a] = scan.nextInt();
		}
		if(StrictlyIdentical.equals(array1, array2)) {
			System.out.println("Two lists are strictly identical");
		}
		else {
			System.out.println("Two lists are not strictly identical");
		}
}
}
