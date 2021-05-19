/*Given the initial configuration of the cubes in the box, find out how many cubes are in each of the n columns after Bob switches the gravity.
Examples:
flip('R', {3, 2, 1, 2})     =>  {1, 2, 2, 3}
flip('L', {1, 4, 5, 3, 5})  =>  {5, 5, 4, 3, 1}*/

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        //using BubbleSort
        int i, j;

        if (dir == 'R') {
            for (j = 0; j < arr.length; j++) {
                for (i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int swap = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = swap;
                    }
                }
            }
        } else if (dir == 'L') {
            for (j = 0; j < arr.length; j++) {
                for (i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        int swap = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = swap;
                    }
                }
            }
        }

        return arr;
    }
}
