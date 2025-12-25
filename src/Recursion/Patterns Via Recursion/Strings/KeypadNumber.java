import java.util.ArrayList;

public class KeypadNumber {
    public static void main(String[] args) {
        String up = "12";
        System.out.println(combinationsList("", up));
        combinations("", up);
        System.out.println(combinationsCount("", up));
    }

    static ArrayList<String> combinationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinationsList(p + ch, up.substring(1)));
        }

        return ans;
    }

    static void combinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combinations(p + ch, up.substring(1));
        }
    }

    static int combinationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += combinationsCount(p + ch, up.substring(1));
        }
        return count;
    }
}
//do this according to question on leetcode and submit it