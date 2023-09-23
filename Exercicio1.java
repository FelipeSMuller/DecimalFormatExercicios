package Formatação;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Exercício 1: Formatação Monetária Formate um número decimal para representar
		 * um valor monetário, por exemplo, "R$ 1.234,56".
		 */

		Double primeiroValor = null, segundoValor = null, resultado = null;
		String resultadoFormatado = null;

		do {

			DecimalFormat df = new DecimalFormat("R$ #,##0.00");

			try {

				primeiroValor = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite o primeiro valor"));

				segundoValor = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite o segundo valor"));

			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null, "Você não inseriu os dados corretamente, ou fechou a aplicação!");

				break;
			}

			finally {

				resultado = primeiroValor * segundoValor;

				resultadoFormatado = df.format(resultado);

				JOptionPane.showMessageDialog(null, " Resultado Final = " + resultadoFormatado);

			}
		} while (primeiroValor > 0 && segundoValor > 0);

	}

}
