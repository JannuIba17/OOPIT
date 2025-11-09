package DSA.Day10;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={10,16,8,12,15,6,3,9,5,75};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums,int start,int end){
        if(start<end){
            int j=partition(nums,start,end);
//            System.out.println(j);
            quickSort(nums,start,j-1);
            quickSort(nums,j+1,end);
//            System.out.println(Arrays.toString(nums));
        }
    }
    public static int partition(int[] nums,int start,int end){
        int pivot=nums[start];
        int i=start;
        int j=end;
        while(i<j){
            while(i<=j && nums[i]<=pivot){
                i++;
            }
            while(i<=j && nums[j]>=pivot){
                j--;
            }
            if(i<j) {
                swap(nums, i, j);
            }
        }
        swap(nums,j,start);
        return j;
    }
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
