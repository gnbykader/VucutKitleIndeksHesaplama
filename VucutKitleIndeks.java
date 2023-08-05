import java.util.Scanner;
public class VucutKitleIndeks {

	public static void main(String[] args) {
		double boy, kilo,VucutKitleIndeks;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Lutfen boyunuzu(m) giriniz: ");
		boy =  inp.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo = inp.nextDouble();
		
		VucutKitleIndeks = kilo/(boy*boy);
		
		System.out.println("Vucut kitle indeksiniz: "+VucutKitleIndeks);
		
				
				


	}

}
