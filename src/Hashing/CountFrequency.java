package Hashing;

import java.util.HashMap;

public class CountFrequency {
    public  void countFrequency(int n, int x, int []nums){
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int number: nums) {
            if (hm.containsKey(number)) {
                int value = hm.get(number);
                hm.put(number, value + 1);
            } else {
                hm.put(number, 1);
            }
        }
        for (int i = 1; i < 6; i++) {
            if (hm.containsKey(i)) {
                int value = hm.get(i);
                arr[i] = value;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(arr);

//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for(int number: nums) {
//            if (hm.containsKey(number)) {
//                int value = hm.get(number);
//                hm.put(number, value + 1);
//            } else {
//                hm.put(number, 0);
//            }
//        }
//        for(int i = 1; i <= x; i++) {
//            hm.put(i, 0);
//        }
//        // 1
//        for (int number : nums) {
//            Integer value = hm.get(number); // 1
//            if (value != null) { //
//                value += 1; // 2
//                hm.put(number, value); // 1 - 1
//            }
//        }

        System.out.println(hm.values());
    }

    public static void main(String[] args) {
       CountFrequency cf = new CountFrequency();
       cf.countFrequency(6, 9 ,  new int[]{1, 3, 1, 9, 2, 7});
//        10 14
//        11 14 8 3 12 14 1 7 4 3

    }
}
