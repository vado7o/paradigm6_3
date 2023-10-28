public class BinarySearch {
        public int search(int[] array, int searchNum, int l, int r) {
            if (l == r) {
                if (array[l] == searchNum) return l;
                else return -1;
            }

            int m = l + (r - l) / 2;

            if (searchNum > array[m]) {
                return search(array, searchNum, m + 1, r);
            } else if (array[m] > searchNum) {
                return search(array, searchNum, l, m - 1);
            }
            return m;
        }
}

