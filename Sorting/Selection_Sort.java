class Selection_Sort{ 
//---------------------------------------------------------
    static void SelectionSort(int arr[], int n) { 
        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++){ 
                if (arr[min_idx] > arr[j]){ 
                    min_idx = j;
		}
	    }
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
//--------------------------------------------------------
	System.out.println("Sorted array is:");
        for (int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
	}
     }
//-------------------------------------------------------------
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90, 10, 99, 36 };
        int n = arr.length;
        SelectionSort(arr, n);
    }
} 