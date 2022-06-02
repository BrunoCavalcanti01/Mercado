/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thoma
 */
public class Funcionario implements Interface{
     ArrayList<Pessoa> funcionario;
      private int servico;
    private LocalDate data;

    public Funcionario() {
         data=LocalDate.now();
    }

    
  @Override
  public double Salario(){
        double salario=1212.00;
        
        
        return salario;
    }
    
  @Override
  public void PrestarContas(){
      
      int i=0;// Recebe de um arquivo caso  seja fechado o app;
    if(servico==0 && data.getDayOfMonth()!=i){
        servico = 1;
        i = data.getDayOfMonth();
        JOptionPane.showMessageDialog(null,"Expediente Iniciado!");
    }else if(servico==1){
       servico=0;
       JOptionPane.showMessageDialog(null,"Expediente Finalizado!");
       //retorna pra o arquivo: contabilizando mais 1 dia de trabalho
    }else if(servico==0 && data.getDayOfMonth()==i){
       JOptionPane.showMessageDialog(null,"Você já entregou seu expediente hoje! Volte amanhã!");
    }
    //Retorna para o arquivo: i com a data do servico e contabiliza ao finalizar o expediente; 
  }


     @Override
  public ArrayList<Pessoa> dados(String s){
     
      return null;
  }
}
