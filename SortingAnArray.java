package reasoning;

public class SortingAnArray {
// Consider the following methods which sort the array elements in ascending order, by using the auxiliary method SWAP:
	void swap (int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j]= temp;
	}
	
	void sort (int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int k = 1; 
			while (k != n) {
				if (a[k-1] > a[k]) {
					swap(a, k-1, k);
				}
				k = k+1;		
			}
		}
	}
}
// indicate what the loop invariant would be. 
// ANSWER: a[0...k-1] <= a[k]. The invariant loop is all numbers previous to k position in the array are lesser than number stored in k. 