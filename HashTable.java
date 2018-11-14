import java.util.ArrayList;
import java.util.Scanner;

public class HashTable {

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
			System.out.println("Data : " + nilai.toString());

			Scanner s = new Scanner(System.in);
			System.out.print("Masukkan kunci pencarian: ");
			double key = s.nextDouble();
			int posisi = -1;
			for (int i = 0; i < nilai.size(); i++) {
				if (key == nilai.get(i)) {
					posisi = i;
					break;
				}
			}
			if (posisi != -1) {
				System.out.println("KEY: " + key + " Berada di index array list: "
						+ posisi);
			} else {
				System.out.println("KEY TIDAK DITEMUKAN");

			}

		}



	}


