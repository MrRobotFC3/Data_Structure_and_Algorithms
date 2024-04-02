class Bubble_Sort {

//--------------------------------------------------------
    static void BubbleSort(int arr[], int n){
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//--------------------------------------------------------
	System.out.println("Sorted array is:");
        for (int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
	}
     }
//-----------------------------------------------------------
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90, 10, 99, 36 };
        int n = arr.length;
        BubbleSort(arr, n);
    }
}