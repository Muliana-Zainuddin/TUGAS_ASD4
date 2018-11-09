import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {
	ArrayList<Double> nilai = new ArrayList<Double>();
	nilai.add(9.4);
	nilai.add(11.87);
	nilai.add(15.50);
	nilai.add(21.45);
	nilai.add(67.20);
	nilai.add(63.12);
	nilai.add(12.30);
	nilai.add(18.12);
	nilai.add(10.23);
	nilai.add(40.12);
	
	System.out.println("Nilai awal : " + nilai.toString());
	
	ArrayList<Double> output = sort(nilai);
	
	System.out.println("Hasil Sorting : " + output.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		int n = data.size();
		for (int i=0;i<n-1;i++){
			int min = i;
			for (int j=i+1;j<n;j++){
				if(data.get(j)<data.get(min)){
					min = j;
				}
			}
			if (min != i){
				Double tempData = data.get(i);
				data.set(i, data.get(min));
				data.set(min, tempData);
			}
		System.out.println("Step ke-"+i+", min : "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
		}
		return data;
	}

}
