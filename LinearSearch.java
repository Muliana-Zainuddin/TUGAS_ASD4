import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	
	ArrayList<Double> data = new ArrayList<Double>();
	data.add(20.15);
	data.add(15.34);
	data.add(9.5);
	data.add(2.1);
	data.add(5.4);
	data.add(21.56);
	data.add(10.23);
	data.add(11.12);
	data.add(1.10);
	data.add(4.5);
	data.add(8.9);

	System.out.println("Data : " + data.toString());		
				
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan kunci pencarian: ");
	double key	= s.nextDouble();
				
	int posisi = -1;
				
	for(int i=0;i<data.size();i++){
		if(key==data.get(i)){
			posisi = i;
			break;
		}
	}
	if(posisi!=-1){
	System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
	}else{
	System.out.println("KEY TIDAK DITEMUKAN");
		}

	}

}
