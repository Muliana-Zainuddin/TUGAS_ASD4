import java.util.ArrayList;

public class BubbleSort {

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
		ArrayList<Double> output = sort(nilai);
		System.out.println("Hasil Sorting : " + output.toString());
	}
	
	private static ArrayList<Double> sort(ArrayList<Double> data){
		int swapped = 1;
		for(int i = data.size()-1;i>=0 && data.size()-1 >= swapped; i--){
			swapped = 0;
		
		for(int j = 0;j<=i -1; j++){
			if(data.get(j)>data.get(j+1)){
				double temp = data.get(j);
				data.set(j, data.get(j+1));
				data.set(j+1, temp);
			}
		}
		System.out.println("Step -> " + data.toString());
		}
		return data;}}


