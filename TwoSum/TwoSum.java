package AISD_HW.TwoSum;

class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] l = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length-1; j > 0; j--) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    l[0] = i;
                    l[1] = j;
                }
            }
        } return l;
    }
}

public class TwoSum{
    public static void main(String[] args) {
        int[] numbers = {3, 2, 3};
        int target = 6;
        int[] response = AISD_HW.TwoSum.Solution.twoSum(numbers, target);
        for (int i = 0; i < response.length; i++) {
            System.out.println(response[i]);
        }
    }
}