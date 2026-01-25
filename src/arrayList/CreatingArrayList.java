package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CreatingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12, 22, 43, 55));
        // adding new nums to the end
        nums.add(123);
        // inserting at a specific index
        nums.add(2, 5);
        // traversal
        for (Integer num : nums) {
            System.out.println(num);
        }
        // iterator method
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(nums);
    }
}
