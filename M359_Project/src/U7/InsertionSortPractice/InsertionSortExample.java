package U7.InsertionSortPractice;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] nums = {2,6,8,5,6,8,4,5,9,7,1,3};
        printArray("Original Array", nums);
        insertionSort(nums);
        printArray("It has been sorted", nums);
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int tempVal = arr[i]; //  put the value in the box
            int currPos = i;

            while( currPos > 0 && arr[currPos -1] > tempVal){
                arr[currPos] = arr[currPos -1]; //sliding over
                currPos--; // decrease index by one to compare with the next value

            }
            arr[currPos] = tempVal;
        }
    }
    public static void printArray(String msg, int[] arr){
        System.out.println(msg);
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
