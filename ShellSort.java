import java.util.ArrayList;

public class ShellSort {

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
		int jarak = data.size();
		boolean end;
		while (jarak > 1) {
			jarak /= 2;
			end = false;
			while (end == false) {
				end = true;
				for (int j = 0; j < data.size() - jarak; j++) {
					if (data.get(j) > data.get(j + jarak)) {
						int tukar = 0;
						data.set(tukar, data.get(j));
						data.set(j, data.get(j + jarak));
						data.set(j + jarak, data.get(tukar));
						end = false;
					}
				}
				System.out.print("\nstep-" + jarak + ": ");
				for (int k = 0; k < data.size(); k++) {
					System.out.print(data.get(k) + " ");
				}
			}

		}

		System.out.print("\nData setelah urut: ");
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i));
		}

		return null;
	}

}
