import java.util.Scanner;
public class exercicio3 {
	public static void main(String Args[]) {
		Scanner ler= new Scanner(System.in); 
		int i=1, num, r;

		System.out.println("Escolha um n�mero para ver a tabuada: ");

		num= ler.nextInt();
		
		while(i<11) {
			r=num*i;
			System.out.println(num+"x"+i+"="+r);
			i++;
		}
		ler.close();
	}
}
