package projetos_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class juros {
    
    public static void main(String[] args) {
        
        // variáveis
        double valorEmprestimo, taxaJuros, valorTotal, valorParcela;
        int prazoPagamento;
        
        // objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        // entrada
        System.out.println("Cálculo de Juros do Banco Lucas");
        System.out.print("Valor do Empréstimo: R$ ");
        valorEmprestimo = teclado.nextDouble();
        System.out.print("Taxa de Juros (em %): ");
        taxaJuros = teclado.nextDouble();
        System.out.print("Prazo de Pagamento (em meses): ");
        prazoPagamento = teclado.nextInt();
        
        // processamento
        valorTotal = valorEmprestimo * (1 + taxaJuros/100 * prazoPagamento);
        valorParcela = valorTotal / prazoPagamento;
        
        // saída
        System.out.println("Valor Total a ser Pago: R$ " + formatador.format(valorTotal));
        System.out.println("Valor da Parcela Mensal: R$ " + formatador.format(valorParcela));
        
        teclado.close();
    }

}
