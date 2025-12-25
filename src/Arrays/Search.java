public class Search {
    public static void main(String[] args) {
         String name = "anshu kumar";
         char target = 'A';
         System.out.println(stringSearch(name, target));
         System.out.println(stringSearch2(name, target));

        int[] nums = { 23, -34, 89, -23, 90, 14, 38 };
        int target2 = 90;
        int ans = linearSearch(nums, target2);
        if(ans >= 0){
            System.out.println(target2 + " was found at " + (ans+1));
        }
        else{
            System.out.println(target2 + " was not found ");
        }
        
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i : arr) {
            if(i == target)
            {
                return i;
            }
        }
        return -1;
    }

    static boolean stringSearch(String name, char target){
        if(name.length() == 0){
            return false;
        }

       for (int i = 0; i < name.length(); i++) {
         if(name.charAt(i) == target){
            return true;
         }
       }
       return false;
    }

    static boolean stringSearch2(String name, char target){
        if(name.length() == 0){
            return false;
        }

       for(char character : name.toCharArray()){  //foreach works only in arrays so convert string to array
        if(character == target){
            return true;
        }
       }
       return false;
    }


}
