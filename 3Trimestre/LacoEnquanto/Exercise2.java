import java.util.Scanner;
public class Exercise2 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        	String s;
	        	double a, pI=0;
	        	int c;

	        	do{
		            System.out.println("Digite o sexo (m pra masculino,f pra feminino): ");
		            s = in.next();
		            System.out.println("Digite a altura em cm: ");
		            a = in.nextDouble();
		
		            if (s.equalsIgnoreCase("M")) {
		                pI = 52+0.75*(a-152.4);
		            } else if (s.equalsIgnoreCase("F")) {
		                pI = 52+0.67*(a-152.4);
		            } else {
		                System.out.println("Sexo inv�lido.");
		            }
		
		            System.out.printf("peso ideal: %.2f\n", pI);
		            
		            System.out.println("cntinuar execu��o? (1 para Sim, 2 para N�o): ");
		            c = in.nextInt();

	        	} while (c==1);

	        in.close();
	    }
}
