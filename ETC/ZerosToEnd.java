// Move all zeros to the end of an array.

public class ZerosToEnd{
    public void ZerosToEnd(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length){
            arr[count++] = 0;
        }
    }
}
