import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
	System.out.println("Digite o �ltimo n�mero de sua placa");
		n = ler.nextInt();
	
		switch(n) {
			case 0:
			case 1:
				System.out.println("O dia do rod�zio � segunda");
				break;
			case 2:
			case 3:
				System.out.println("O dia do rod�zio � ter�a");
				break;
			case 4:
			case 5:
				System.out.println("O dia do rod�zio � quarta");
				break;
			case 6:
			case 7:
				System.out.println("O dia do rod�zio � quinta");
				break;
			case 8:
			case 9:
				System.out.println("O dia do rod�zio � sexta");
				break;
			default:
				System.out.println("Dia Inv�lido");
				
				
		}
	
		
		
	}
}
