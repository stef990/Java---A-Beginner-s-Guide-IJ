package com.javabeginner.Chapter5;

/**
 * Created by Stefano Garombo on 21/06/2016.
 */
public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 234, 234, -1,2};
        int a, b, t;
        int size;
        size = 10;

        System.out.println("Original");
        for (int i = 0; i < size; i++)
            System.out.println(nums[i]);

        for(a=1; a < size; a++)
            for(b = size -1; b >=a; b--)
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
        System.out.println("New");
        for (int i = 0; i < size; i++)
            System.out.println(nums[i]);
    }
}
