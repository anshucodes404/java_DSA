public class Uniquenum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 8, 8, 7, 7, 8};
        System.out.println(numfinder(arr));
    }

    static int numfinder(int[] arr){
        int result = 0;
        //Iterate over every bit
        for(int i = 0; i < 32; i++){
            int sum = 0;
            //Sum the ith bit for every element
            for(int num: arr){
                if((num & (1 << i)) != 0){
                    sum++;
                }
                //if the sum is not divisible by 3, then the number is unique in the array
                if(sum % 3 != 0){
                    result |= (1 << i);
                }
            }
        }
        return result;
    }
}
