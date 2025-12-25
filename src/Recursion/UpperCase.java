package Recursion;
public class UpperCase {
    public static void main(String[] args) {
        String str = "geeKfOrgeeks";
        int index = findIndex(str, 0);
        System.out.println(index);
    }

    static int findIndex(String str, int index){
        if(index == str.length()){
            return -1;
        }
        
        if(Character.isUpperCase(str.charAt(index))){
            return index;
        }
        return findIndex(str, index + 1);
    }
}
