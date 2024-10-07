import java.util.Scanner;
//暴力枚举法移除元素
public class x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组个数：");
        int count = scanner.nextInt();
        System.out.println("请输入"+count+"个数字：");
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            nums[i] = x;
        }
        System.out.println("请输入目标值：");
        int target = scanner.nextInt();
        int newLength = count;
        for (int i = 0; i < newLength; i++) {
            if (nums[i] == target) {
                for (int j = i; j < newLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                newLength--;
                i--;
//                要记得i--，因为移动了一位，下一位还是要判断,否则会发生数组越界
            }
        }
        System.out.println("移除元素后的数组个数为：" + newLength);
        System.out.print("移除元素后的数组为：");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print("-");
            }
        }
    }
}