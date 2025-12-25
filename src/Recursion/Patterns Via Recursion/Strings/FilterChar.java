public class FilterChar {
    public static void main(String[] args) {
         String str = "dabcbbcagbb";
         char filter = 'b';
         filter(str, "", filter);
        System.out.println(filter(str, filter));
    }

    /**
     * answer in body
     */
    static void filter(String str, String filteredStr, char filter){
        if(str.isEmpty()){
            System.out.println(filteredStr);
            return;
        }
        char ch = str.charAt(0);
        if(ch == filter){
            filter(str.substring(1), filteredStr, filter);
        }else{
            filter(str.substring(1), filteredStr + ch, filter);
        }
    }

    static String filter(String str, char filter){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == filter){
            return filter(str.substring(1), filter);
        }
        else{
            return ch + filter(str.substring(1), filter);
        }
    }
}
