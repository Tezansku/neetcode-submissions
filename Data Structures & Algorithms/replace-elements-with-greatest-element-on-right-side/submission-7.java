class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                }
            }

            arr[i] = max;
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}