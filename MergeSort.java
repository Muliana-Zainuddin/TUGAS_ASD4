public class MergeSort {

	public static void main(String[] args) {

		int i;
		double nilai[] = new double[12];
		
		nilai[0] = (14.78);
		nilai[1] =(23.56);
		nilai[2] = (11.45);
		nilai[3] = (56.23);
		nilai[4] = (43.23);
		nilai[5] = (10.23);
		nilai[6] = (9.57);
		nilai[7] = (3.24);
		nilai[8] = (1.98);
		nilai[9] = (19.76);
		nilai[10] = (45.12);
		nilai[11] = (12.65);

		System.out.print("nilai sebelum:\n");
		for (i = 0; i < nilai.length; i++)
			System.out.print(nilai[i] + "  ");
		System.out.println();

		mergeSort_srt(nilai, 0, nilai.length - 1);

		System.out.print("setelah sorting:\n");
		for (i = 0; i < nilai.length; i++)
			System.out.print(nilai[i] + "  ");
		System.out.println();

	}

	public static void mergeSort_srt(double data[], int lo, int n) {
		int low = lo;
		int high = n;
		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;
		mergeSort_srt(data, low, middle);
		mergeSort_srt(data, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;

		while ((lo <= end_low) && (start_high <= high)) {
			if (data[low] < data[start_high]) {
				low++;
			} else {
				double Temp = data[start_high];
				for (int k = start_high - 1; k >= low; k--) {
					data[k + 1] = data[k];
				}
				data[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}

	}

}
