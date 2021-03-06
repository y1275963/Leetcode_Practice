package two_sum_iii_data_structure_design;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class TwoSum {
    private Map<Integer, Integer> container;

    public TwoSum() {
        container = new HashMap<>();
    }
    // Add the number to an internal data structure.
    public void add(int number) {
        if (container.containsKey(number))
            container.put(number, container.get(number) + 1);
        else
            container.put(number, 1);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for (Entry<Integer, Integer> entry : container.entrySet()) {
            int item = entry.getKey();
            int x = value - item;

            if (x == item) {
                if (entry.getValue() >= 2)
                    return true;
            }
            else if (container.containsKey(x))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(0);

        System.out.println(twoSum.find(0));
    }
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);