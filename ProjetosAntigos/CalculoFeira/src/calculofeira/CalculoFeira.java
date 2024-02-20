/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofeira;

/**
 *
 * @author Colorindo Festas
 */
public class CalculoFeira {
    public static void main(String[] args) {
        // Definindo os preços por quilo
        double precoTomate = 5.00; // Preço do tomate por quilo
        double precoCebola = 3.00; // Preço da cebola por quilo
        
        // Definindo a quantidade comprada
        int quantidadeTomate = 2; // Quantidade de quilos de tomate comprados
        int quantidadeCebola = 1; // Quantidade de quilos de cebola comprados
        
        // Calculando o custo total
        double custoTotalTomate = quantidadeTomate * precoTomate;
        double custoTotalCebola = quantidadeCebola * precoCebola;
        
        // Calculando o custo total da compra
        double custoTotalCompra = custoTotalTomate + custoTotalCebola;
        
        // Exibindo o resultado
        System.out.println("Custo total do tomate: R$" + custoTotalTomate);
        System.out.println("Custo total da cebola: R$" + custoTotalCebola);
        System.out.println("Custo total da compra: R$" + custoTotalCompra);
    }
}

