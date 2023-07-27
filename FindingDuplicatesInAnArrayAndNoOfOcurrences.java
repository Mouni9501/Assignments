import java.util.HashMap;
import java.util.Map;

public class FindingDuplicatesInAnArrayAndNoOfOcurrences {
    public static void main(String args[]) {
        int inputArray[] = {4, 3, 2, 4, 3, 4};
        findingNoOfOcurrences(inputArray);
    }

    static void findingNoOfOcurrences(int[] arr) //4,3,2,4,3,4
    {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            int count = map.getValue();
            if (count > 1) {
                System.out.println(map.getKey()+" got repeated "+map.getValue()+" times");
            }
        }
    }
}


