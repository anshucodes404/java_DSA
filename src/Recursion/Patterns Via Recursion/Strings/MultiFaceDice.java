import java.util.ArrayList;

public class MultiFaceDice {
    public static void main(String[] args) {
        int target = 6;
        int face = 10;
        System.out.println(multiFaceDiceCombinationList("", target, face));
    }

    // return an arraylist
    static ArrayList<String> multiFaceDiceCombinationList(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(multiFaceDiceCombinationList(p + i, target - i, face));
        }
        return ans;
    }

}
