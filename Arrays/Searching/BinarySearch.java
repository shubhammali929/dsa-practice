public class BinarySearch{
    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return mid;

            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }

        return -1;
    }

    public static int findCeilNo(int[] arr, int target){
                int start=0;
        int end= arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return arr[mid];

            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }

        return arr[start];
    }

    public static int findFloorNo(int[] arr, int target){
                int start=0;
        int end= arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return arr[mid];

            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }

        return arr[end];
    }

    public static int binarySearchRecursive(int[] arr, int target, int start, int end){

        if(start > end)
            return -1;
        
        int mid = (start+end)/2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] > target)
            return binarySearchRecursive(arr, target, start, mid-1);
        else
            return binarySearchRecursive(arr, target, mid+1, end);

    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,9,13,34,83};
        int target = 5;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearchRecursive(arr, target, 0, arr.length-1));
        System.out.println("Ceil for target element is : " + findCeilNo(arr, target));
        System.out.println("Floor of target element is : "+ findFloorNo(arr, target));
        
    }
}