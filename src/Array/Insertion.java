package Array;

class Insertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 5, 6, 8, 5};
        int pos = 2; // position where to insert (1-based)
        int x = 7;   // value to insert

        int[] newarray = new int[arr.length + 1]; // new array with +1 size

        for (int i = 0, j = 0; i < newarray.length; i++) {
            if (i == pos - 1) newarray[i] = x;
            else newarray[i] = arr[j++];
        }

        for (int n : newarray)
            System.out.print(n + " ");
    }
}
