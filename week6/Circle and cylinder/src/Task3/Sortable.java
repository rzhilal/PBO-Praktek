package Task3;

public abstract class Sortable {
	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a){ 
		for (int interval = n / 2; interval > 0; interval /= 2) {
		    for (int i = interval; i < n; i += 1) {
		    int temp = array[i];
		    int j;
		    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
		      array[j] = array[j - interval];
		    }
		    array[j] = temp;
		    }
	}
}
