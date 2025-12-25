import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i = 0; i < 6; i++)
        {
           arr[i] = sc.nextInt();
        }

        sc.close();

        //This is for each loop
        for(int num : arr)
        {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));
    }
}
