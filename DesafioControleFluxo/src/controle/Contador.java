package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro", exception);
		} catch (InputMismatchException exception) {
			throw new InputMismatchException("Devem ser informados números inteiros");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}

}