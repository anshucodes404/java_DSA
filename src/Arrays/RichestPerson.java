public class RichestPerson {
    public static void main(String[] args) {
       int[][] wealths = { {1, 6, 3}, {3, 2, 1} };
      System.out.print("Richest customer has wealth: ");
       rich(wealths);
    }

    static void rich(int[][] wealths){
        int maxWealth = Integer.MIN_VALUE;
        for(int[] person : wealths){
            int wealth = 0;
            for(int account : person){
                wealth += account;
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        System.out.println(maxWealth);
    }
    
}
