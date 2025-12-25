import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        int target = 4;
        diceCombination("", target);
        System.out.println(diceCombinationList("", target));
    }

    //no return
    static void diceCombination(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombination(p + i, target - i);
        }
    }

    //return an arraylist
    static ArrayList<String> diceCombinationList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceCombinationList(p + i, target - i));
        }
        return ans;
    }

}
