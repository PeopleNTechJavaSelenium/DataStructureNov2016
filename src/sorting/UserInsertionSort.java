package sorting;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UserInsertionSort {

    public static void main(String[] args) {

        int [] array = new int[]{10,7,3,8,1,6,5,4};
        for(int i=0; i<array.length; i++){
            int temp = array[i];
            int j ;
            for(j=i-1; j>=0&&temp<array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
