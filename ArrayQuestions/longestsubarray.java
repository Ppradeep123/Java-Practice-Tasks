import java.util.HashMap;

class longestsubarray {
    public static void main(String[] args) {

        int arr[] = {2, 3, 1, 2};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum = prefixSum + arr[i];

            int remaining = prefixSum - k;

            if (map.containsKey(remaining)) {

                int length = i - map.get(remaining);

                if (length > maxLength) {
                    maxLength = length;
                }
            }

            // if (!map.containsKey(prefixSum)) {
            //     map.put(prefixSum, i);
            // }
        }

        System.out.println("Longest Subarray Length: " + maxLength);
    }
}