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
public class Gerente implements Interface{
    ArrayList<Pessoa> gerente;
    private int servico;
    private LocalDate data;

    public Gerente() {
         data=LocalDate.now();
    }


    
    
  @Override
  public double Salario(){
        double salario=3648.00;
        
        
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
   
   /*public void Cadastrar(){
       Pessoa g = new Pessoa(2,"Thomas",2,"123.321.123-31","123","thomaj@gmail.com",20);
       gerente.add(g);
      JOptionPane.showInputDialog("Cadastrado com Sucesso!");
  }*/
}
