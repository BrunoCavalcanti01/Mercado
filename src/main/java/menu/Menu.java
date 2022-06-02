/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author thoma
 */
public class Menu {

    private int escolha;
    private double total;

    public Menu() {

    }
    public void Hort(int a, int T) {
        double soma = 0;        
        switch (a) {
            case 1:
                soma =  T * 1.2 + soma;
                break;
            case 2:

                soma = T * 1.9 + soma  ;
             
                break;
            case 3:
                soma = T * 1.5 + soma ;
                

                break;
            default:
               JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }
        
        setTotal(soma);

    }


    public void Bebida(int a, int T) {
        double soma = 0;
        switch (a) {
            case 1:
                soma = soma + T * 2;
                break;
            case 2:

                soma = T * 5 + soma;
                break;
            case 3:
                soma = T * 3 + soma;

                break;
            default:
               JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }

        setTotal(soma);

    }

    public void ProdutosLimpeza(int a, int T) {
        double soma = 0;
        switch (a) {
            case 1:
                soma = soma + T * 2.5;
                break;
            case 2:

                soma = T * 5 + soma;
                break;
            case 3:
                soma = T * 4.5 + soma;

                break;
            default:
               JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }

        setTotal(soma);

    }

    public void Graos(int a, int T) {
        double soma = 0;
        switch (a) {
            case 1:
                soma = soma + T * 2.3;
                break;
            case 2:

                soma = T * 2.1 + soma;
                break;
            case 3:
                soma = T * 1.8 + soma;

                break;
            default:
                JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }

        setTotal(soma);

    }

    public void Guloseimas(int a, int T) {
        double soma = 0;
        switch (a) {
            case 1:
                soma = soma + T * 3;
                break;
            case 2:

                soma = T * 4.5 + soma;
                break;
            case 3:
                soma = T * 2 + soma;

                break;
            default:
               JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }

        setTotal(soma);

    }

    public void Frios(int a, int T) {
        double soma = 0;
        switch (a) {
            case 1:
                soma = soma + T * 1.5;
                break;
            case 2:

                soma = T * 3 + soma;
                break;
            case 3:
                soma = T * 2 + soma;

                break;
            default:
                JOptionPane.showMessageDialog(null,"Você digitou uma tecla inválida.");
        }

        setTotal(soma);

    }

    public void setTotal(double total) {
        this.total = this.total + total;
    }

    public double getTotal() {
        return total;
    }
    
}