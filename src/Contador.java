import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
	public static void main(String[] args) {
		int parametroUm = 0;
        int parametroDois = 0;
        
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número");
            parametroDois = terminal.nextInt();
        
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo número deve ser maior que o primeiro");
		} catch (InputMismatchException e) {
            System.out.println("O valor digitado deve ser numérico");
        }
    }

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois) throw new ParametrosInvalidosException();
                
		int contagem = parametroDois - parametroUm;
        System.out.println("A contagem entre os números é: ");

        for(int i=1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }    
        System.out.println("A diferença entre os números é " + contagem);
	}
}