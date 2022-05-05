class Sorting{
	void insertionSort(int n,int arr1[]){
		int max=0;
		int arr2[]=new int[n];
		for(int i=0;i<n;i++){
			arr2[i]=arr1[i];
		}
		for(int i=n-1;i>=0;i--){
			max=arr1[i];
			
			for(int j=i-1;j>=0;j--){
				if(arr1[j] > max){
					int temp=arr1[j];
					arr1[j]=max;
					max=temp;
				}
			}
			arr1[i]=0;
			arr2[i]=max;
			
			for(int k=0;k<n;k++){
				System.out.print(arr2[k]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String args[]){
		int arr[]={2,4,6,8,3};
		int n=arr.length;
		Sorting s1=new Sorting();
		
		s1.insertionSort(n,arr);
		
	}
}