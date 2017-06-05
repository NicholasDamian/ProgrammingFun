package com.company;


public class BinarySearch {

    public static int[] intArray = new int[] {4,5,6,7,8};

        public static boolean exists(int[] a, int b){
            try {
                int position = a.length / 2;
                int[] newArray;
                int newArraySize;
                if (a[position] == b) {
                    return true;
                } else if (a[position] < b) {
                    newArraySize = a.length - (position + 1);
                    newArray = new int[newArraySize];
                    System.arraycopy(a, 0, newArray, 0, newArraySize);
                    return exists(newArray, b);
                } else if (a[position] > b) {
                    newArraySize = a.length - (position);
                    newArray = new int[newArraySize];
                    System.arraycopy(a, 0, newArray, 0, newArraySize);
                    return exists(newArray, b);
                }
                return false;
            }catch (Exception e){
                return false;
            }
        }


    public static void main(String[] args) {

        System.out.print(exists(intArray,10));
	// write your code here
    }
}
