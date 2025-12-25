public class FilterString {
    public static void main(String[] args) {
        String str = "You are an apple man";
        System.out.println(filter(str, "apple"));
    }
    static String filter(String str, String target){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(target)){
            return filter(str.substring(target.length()), target);
        }else{
            return str.charAt(0) +filter(str.substring(1), target);
        }
    }
}
