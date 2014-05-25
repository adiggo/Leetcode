public class MagicIndex{

    public static int getIndex(int[] array){
        return magicFast(array, 0, array.length - 1);
    }

    public static int magicFast(int[] array, int start, int end){
        if (start > end || start < 0 || end > array.length -1){
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == mid){
            return mid;
        }
        else if (){
        }
        else{
        }
    }
}
