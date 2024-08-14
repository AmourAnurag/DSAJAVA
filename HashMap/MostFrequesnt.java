import java.util.HashMap;

public class MostFrequesnt {

    public static int mostFreq(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int ans = -1;
        int maxfreq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freqMap.containsKey(arr[i])) {
                int val = freqMap.get(arr[i]);
                val = val + 1;
                freqMap.put(arr[i], val);
            } else {
                freqMap.put(arr[i], 1);
            }
            if (freqMap.get(arr[i]) > maxfreq) {
                maxfreq = freqMap.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 7, 8, 2, 1, 9, 10, 9, 9, 2, 8, 2,9,9 };
        int ans = mostFreq(arr);
        System.out.println(ans);
    }
}
