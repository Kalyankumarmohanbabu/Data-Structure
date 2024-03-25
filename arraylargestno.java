class largestno {

	static void largest3no(int arr[], int arr_size)
	{
		int i,a,b,c;

		
		if (arr_size < 3) {
			System.out.print(" Invalid Input ");
			return;
		}

		c = a = b = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
		
			if (arr[i] > a) {
				c = b;
				b = a;
				a = arr[i];
			}

		
			else if (arr[i] > b) {
				c = b;
				b = arr[i];
			}

			else if (arr[i] > c)
				c = arr[i];
		}

		System.out.println("Three largest elements are " + a + " " + b + " " + c);
	}


	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		largest3no(arr, n);
	}
}
