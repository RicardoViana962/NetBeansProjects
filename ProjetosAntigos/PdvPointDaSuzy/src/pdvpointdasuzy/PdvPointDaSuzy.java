/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdvpointdasuzy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Colorindo Festas
 */
public class PdvPointDaSuzy { 

    private static Map<String, Double> produtos = new HashMap<>();

    public static void main(String[] args) {
        // Inicializa alguns produtos com preços
        inicializarProdutos();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    realizarVenda(scanner);
                    break;
                case 2:
                    exibirProdutos();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do PDV...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("----- PDV - Ponto de Venda -----");
        System.out.println("1. Realizar Venda");
        System.out.println("2. Exibir Produtos");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirProdutos() {
        System.out.println("----- Produtos Disponíveis -----");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " - R$" + entry.getValue());
        }
    }

    private static void inicializarProdutos() {
        produtos.put("Coxinha", 1.00);
        produtos.put("Kibe", 1.00);
        produtos.put("Bolinho Misto", 1.00);
        produtos.put("Fatia de Torta", 7.00);
        
        // Adicione outros produtos conforme necessário
    }

    private static void realizarVenda(Scanner scanner) {
        exibirProdutos();
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        if (produtos.containsKey(nomeProduto)) {
            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            double precoUnitario = produtos.get(nomeProduto);
            double total = precoUnitario * quantidade;

            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total a pagar: R$" + total);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}

    

