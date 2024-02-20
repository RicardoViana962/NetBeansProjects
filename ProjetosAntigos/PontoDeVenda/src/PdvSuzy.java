/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 *
 * @author Colorindo Festas
 */
public class PdvSuzy extends javax.swing.JFrame {import javax.swing.*;

    private double totalVenda;
    private JTextArea display;
    private JTextField produtoField;
    private JTextField quantidadeField;

    public PdvSuzy() {
        totalVenda = 0.0;

        // Criação da janela principal
        JFrame frame = new JFrame("PDV - Ponto de Venda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Painel para exibição de produtos e total da venda
        JPanel panel = new JPanel(new BorderLayout());

        // Área de exibição para mostrar produtos e total da venda
        display = new JTextArea(15, 30);
        display.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(display);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Painel para entrada de dados e botões
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel produtoLabel = new JLabel("Produto:");
        produtoField = new JTextField(10);

        JLabel quantidadeLabel = new JLabel("Quantidade:");
        quantidadeField = new JTextField(5);

        JButton addProductButton = new JButton("Adicionar Produto");
        addProductButton.addActionListener((ActionEvent e) -> {
            try {
                String produto = produtoField.getText();
                int quantidade = Integer.parseInt(quantidadeField.getText());
                double precoUnitario = obterPrecoProduto(produto); // Substitua esta função pela obtenção do preço do produto
                double subtotal = precoUnitario * quantidade;
                totalVenda += subtotal;
                
                display.append("Produto: " + produto + " - Quantidade: " + quantidade + " - Subtotal: R$" + subtotal + "\n");
                display.append("Total da venda: R$" + totalVenda + "\n\n");
                
                // Limpa os campos após adicionar o produto
                produtoField.setText("");
                quantidadeField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Quantidade inválida! Digite um número inteiro válido.");
            }
        });

        JButton finalizeButton = new JButton("Finalizar Venda");
        finalizeButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Venda finalizada. Total a pagar: R$" + totalVenda);
            totalVenda = 0.0;
            display.setText("");
        });

        inputPanel.add(produtoLabel);
        inputPanel.add(produtoField);
        inputPanel.add(quantidadeLabel);
        inputPanel.add(quantidadeField);
        inputPanel.add(addProductButton);
        inputPanel.add(finalizeButton);

        panel.add(inputPanel, BorderLayout.EAST);

        // Adiciona o painel ao centro da janela principal
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Função de exemplo para obter o preço do produto - substitua por sua lógica de negócio
    private double obterPrecoProduto(String produto) {
    // Lógica para buscar o preço do produto no banco de dados, em um mapa, etc.
    // Aqui é um exemplo simples usando valores fixos
    switch (produto) {
        case "Produto1":
            return 10.0;
        case "Produto2":
            return 15.0;
        default:
            return 0.0;
    }
    }

    public static void main(String[] args) {
        // Executa o PDV
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                PDVLayoutSwing pdvLayoutSwing = new PDVLayoutSwing();
            }
        });
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

