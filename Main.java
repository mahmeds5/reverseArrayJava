import java.util.*;
public class Main {
	public static void main (String[] args){
		//Reverse an Array
		// a b c d 
		// d c b a 	
		int[] a = {1, 2, 3, 4, 5};
		int pointerA = 0;
		int pointerB = a.length - 1;
		while (pointerA < pointerB){
			int temp = a[pointerA];
			a[pointerA] = a[pointerB];
			a[pointerB] = temp;
			pointerA++;
			pointerB--;
		}
		
		System.out.println(Arrays.toString(a));
	}
}	
