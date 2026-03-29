public class LinearSearch{

    public static int searchElement(int[] arr, int targetNum){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == targetNum)
                return i;
        }
        return -1;
    }

    public static int searchElement2(int[] arr, int targetNum){
        for(int i : arr){
            if(arr[i] == targetNum)
                return i;
        }
        return -1;
    }

    public static boolean SearchCharInString(String string, char tagretChar){
        for(int i=0; i<string.length(); i++){
            if( string.charAt(i) == tagretChar)
                return true;
        }
        return false;
    }

    public static boolean SearchCharInString2(String string, char tagretChar){
        for(char c : string.toCharArray()){
            if( c == tagretChar)
                return true;
        }
        return false;
    }

    public static int findMin(int[] arr){
        int result = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < result)
                result = i;
        }
        return result;
    }

    public static int[] searchIn2DArray(int[][] arr, int targetNum){
        // for(int[] row : arr ){
        //     for(int element : row){
        //         if(element == targetNum)
        //             return element;
        //     }
        // }
        // return -1;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                    if(arr[i][j] == targetNum)
                        return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }

    public static int searchMaxIn2DArray(int[][] arr){
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(arr[i][j] > Max)
                    Max = arr[i][j];
            }
        }
        return Max;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,0,4};
        int[] arr2 = new int[0];
        // System.out.println(searchElement2(arr, 9));
        System.out.println(SearchCharInString2("Hello", 'o'));
        System.out.println(findMin(arr));
        int[][] Array2D = {
            {1,4,22,43,3},
            {1,6,31,87,1}
        };

        int[] result = searchIn2DArray(Array2D, 87);
        System.out.println(result[0]+ " " + result[1]);
        System.out.println("Max in the Array is" + searchMaxIn2DArray(Array2D));
    }
}