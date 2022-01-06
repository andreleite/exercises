package io.andre;

import java.util.HashMap;

public class App {
  public static int[] leetCode0001TwoSum(int[] nums, int target) {
    int len = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; ++i) {
      final Integer value = map.get(nums[i]);
      if (value != null) {
        return new int[] {value, i};
      }
      map.put(target - nums[i], i);
    }
    return null;
  }
}
