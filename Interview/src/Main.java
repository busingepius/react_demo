public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 9, 0, 5, 4, 7};
        int[] arrayB = {1, 2,3,4,5,6,7,8,9};// sorted
        System.out.println(linearSearch(array, 0));
        System.out.println(binarySearch(arrayB, 6));
        System.out.println(binarySearchW(arrayB, 6));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }


    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (right < left) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (arr[middle] == target) {
            return middle;
        }
        if (target < arr[middle]) {
            return binarySearch(arr, target, left, middle - 1);
        }
        return binarySearch(arr, target, middle + 1, right);

    }

    public static int binarySearchW(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (!(right < left)) {
            int middle = (left + right) / 2;
            if(target == arr[middle]){
                return middle;
            }
            if(target < arr[middle]){
                right = middle -1;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }
}