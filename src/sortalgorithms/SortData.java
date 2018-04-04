/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgorithms;

/**
 *
 * @author Dariusz
 */
public class SortData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {2,4,5,2,1,1,15,8,8,7,7,7,13,101,-13,2};
        QuickSort.quickSort(data);
    }
    
}
