import java.util.Scanner;

public class HarmonikSayýBulanProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int a;
		double toplam=0,i=1;
		
		System.out.println("N sayýsýný giriniz: ");
		a=input.nextInt();
		
		while(i<=a) {
			toplam +=(1.0/i);
			i++;
		}
		System.out.println(toplam);
		

	}

}
