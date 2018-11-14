import java.util.ArrayList;

public class QuickSort {

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

		System.out.println("Nilai Awal : " + nilai.toString());
		ArrayList<Double> keluaran = sort(nilai, 0, nilai.size()-1);
		System.out.println("HAsil Sorting : " + keluaran.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> Data, int low, int high) {
		if (Data == null || Data.size() == 0) {
			return Data;
		}
		if (low >= high) {
			return Data;
		}
		int mid = low + (high - low) / 2;
		double pivot = Data.get(mid);

		int i = low, j = high;
		while (i <= j) {
			while (Data.get(i) < pivot) {
				i++;
			}
			while (Data.get(j) > pivot) {
				j--;
			}
			if (i <= j) {
				swap(Data, i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			sort(Data, low, j);
		}
		if (high > i) {
			sort(Data, i, high);
		}
		System.out.println("Step ->" + Data.toString());
		return Data;
	}

	private static void swap(ArrayList<Double> Data, int x, int y) {
		double temp = Data.get(x);
		Data.set(x, Data.get(y));
		Data.set(y, temp);
	}
}