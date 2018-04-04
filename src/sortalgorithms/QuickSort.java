/*
 * A static class (utility). Needs no constructor.
*/
package sortalgorithms;

/**
 *
 * @author Dariusz Szoltys
 */
public class QuickSort {
    
    public static void quickSort(int[] data) {
        sort(data,0,data.length-1);
        display(data);
    }
    
    /**
     * Uses quicksort to sort a list of integers
     * @param data - array to be sorted
     * @param start - start of the partition
     * @param end - end of the partition
     */
    private static void sort(int[] data,int start,int end) {
        if (start>=end+1) return;
        int pivot=end;
        int wall=start-1;
        int i=start;
        while (i<end) {
            if (data[i]<=data[pivot]) {
                wall++;
                if (wall!=i) swap(data,wall,i);
            }
            i++;
        }
        wall++;
        swap(data,wall,pivot);
        if (wall-1>start+1) sort(data,start,wall-1);
        if (wall<end-1)     sort(data,wall+1,end);
    }
    
    /**
     * Swaps two elements in an array.
     * @param data
     * @param i - element to be swapped with
     * @param j - element to swap
     */
    public static void swap(int[] data,int i,int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
    public static void display(int[] data) {
        System.out.print("[");
        for (int i=0;i<data.length;i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("]");
    }
}
