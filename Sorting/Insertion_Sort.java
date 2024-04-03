class Insertion_Sort{

//---------------------------------------------------	
	static void InsertionSort(int arr[], int n){
		int key, j;
		for(int i=1; i<n; i++){
			key=arr[i];
			j=i-1;
			while(j>-1 && key < arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
//------------------------------------------------------
		System.out.println("Sorted array is:");
		for(int k=0; k<n; k++){
			System.out.print(arr[k]+" ");
		}
	}
//-----------------------------------------------------------
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90, 10, 99, 36 };
        int n = arr.length;
        InsertionSort(arr, n);
    }
		
}
