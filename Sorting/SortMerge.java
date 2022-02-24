package Sorting;

public class SortMerge {

    SortMerge(){
    }

    public void divide(int[] array){
        int length = array.length;

        if(length<2){
            return;
        }

        int midIndex = (int) Math.ceil(length / 2);
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length-midIndex];

        //we populate the left and right array
        for(int i = 0; i< midIndex;i++){
            leftHalf[i] = array[i];
        }
        for(int i = midIndex; i<length;i++){
            rightHalf[i - midIndex] = array[i];
        }

        //We divide again
        divide(leftHalf);
        divide(rightHalf);

        //We merge
        merge(array, leftHalf, rightHalf);

    }

    private void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0 , j=0 , k=0;

        //Loop until all the elements are there
        while(i<leftSize && j<rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public void basicSort(int[] array){

        int temp;

        for(int i =0; i<array.length; i++){
            for(int j =0; j<array.length;j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //ProgrammePrincipal.showArray(array);
    }

    public void bubbleSort(int[] array){

        int n = array.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }

        //ProgrammePrincipal.showArray(array);
    }



}
