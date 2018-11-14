import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Double> nilai = new ArrayList<Double>();
		nilai.add(12.45);
		nilai.add(5.2);
		nilai.add(14.78);
		nilai.add(23.56);
		nilai.add(11.45);
		nilai.add(56.23);
		nilai.add(43.23);
		nilai.add(10.23);
		nilai.add(9.57);
		nilai.add(3.24);
		nilai.add(1.98);
		nilai.add(19.76);
		nilai.add(45.12);
		nilai.add(12.65);

		// CETAK DATA AWAL
		System.out.print("INPUT: " + nilai.toString());
		ArrayList<Double> OUTPUT = sort(nilai);
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		// BEGING INSERTION SORT

		for (int i = 1; i < data.size(); i++) {
			double v = data.get(i);
			int j = i;
			while (j > 0 && data.get(j - 1) > v) {
				data.set(j, data.get(j - 1));
				j--;
			}
			data.set(j, v);
			System.out.print("\nStep-" + i + ": ");
			for (int k = 0; k < data.size(); k++) {
				System.out.print(data.get(k) + " ");
			}
		}
		// END OF BEGING INSERTION SORT

		// CETAK DATA AKHIR

		System.out.print("\nHASIL SORTING: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k) + " ");
		}
		return null;

	}
}
