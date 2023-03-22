public class MyClass {
    public static void main(String args[]) {
        int[] nums = {4, 3, 2, 1, 2, 3, 6};
        int val = 2;
        int newLen = removeValue(nums, val);
        System.out.println(nums);
        System.out.println("New length: " + newLen);
    }
    
    public static int removeValue(int[] nums, int val) {
    int len = nums.length;
    int i = 0;
    while (i < len) {
        if (nums[i] == val) {
            len--;
            for (int j = i; j < len; j++) {
                nums[j] = nums[j+1];
            }
        } else {
            i++;
        }
    }
    return len;
}
}