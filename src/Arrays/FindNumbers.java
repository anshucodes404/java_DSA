public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 34, 898, 90, 243322, 7896 };
        System.out.println("Numbers having even digits are");
        even2(nums);
    }

    static void even(int[] nums) {
        int count, original_no;
        for (int number : nums) {
            count = 0;
            original_no = number;
            while (number != 0) {
                number = number / 10;
                count++;
            }
            if (count % 2 == 0) {
                System.out.println(original_no);
            }
        }
    }

    // Another method
    static void even2(int[] nums) {
        int count;
        for (int number : nums) {
            count = (int) (Math.log10(number) + 1);
            if (count % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
