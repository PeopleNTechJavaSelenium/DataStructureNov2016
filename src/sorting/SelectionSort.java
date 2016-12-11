package sorting;

import java.util.Arrays;

/**
 * Created by PIIT_NYA on 12/11/2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] array = new int[]{10,9,4,7,3,14,0,2,5};
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            for(int j= i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } //end of if
            }//enf of inner for loop
        }//end of outer for loop

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }//end of main
}//end of class
