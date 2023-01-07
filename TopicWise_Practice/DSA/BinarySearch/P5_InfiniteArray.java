public class P5_InfiniteArray {
    public static void main(String[] args) {
        
    }
    public static int ans(int[] arr,int key) {
        int start = 0;
        int end = 1;
        while(key>arr[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return srch(arr, key, start, end);
    }
    public static int srch(int[] arr, int key,int start,int end) {

        // int start = 0;
        // int end = arr.length - 1;
        while (start<=end) {
            int mid = start +(end-start) / 2;
            if (key<arr[mid]) {
                end = mid-1;
            }else if (key>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
