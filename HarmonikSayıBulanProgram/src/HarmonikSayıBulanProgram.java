import java.util.Scanner;

public class HarmonikSay�BulanProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int a;
		double toplam=0,i=1;
		
		System.out.println("N say�s�n� giriniz: ");
		a=input.nextInt();
		
		while(i<=a) {
			toplam +=(1.0/i);
			i++;
		}
		System.out.println(toplam);
		

	}

}
