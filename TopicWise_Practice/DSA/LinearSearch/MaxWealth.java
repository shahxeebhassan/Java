/*
 *  LeetCode Question
 */
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {12,13,25}, //50
            {25,10,13}, //48
            {15,25,15}  //55
        };
        int max =Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum=0;
            for (int col = 0; col < arr[row].length; col++) {
                sum+=arr[row][col];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
