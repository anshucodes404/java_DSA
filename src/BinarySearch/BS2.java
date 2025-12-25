package BinarySearch;

public class BS2 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'd', 'g', 'j', 'k', 'o', 'q', 's', 'u'};
        char target = 'o';
        System.out.println(search(arr, target));

    }

    static char search(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
               start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
