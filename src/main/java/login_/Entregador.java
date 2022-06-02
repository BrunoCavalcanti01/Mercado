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
public class Entregador implements Interface{

    private int servico;
    private LocalDate data;

    public Entregador() {
        data=LocalDate.now();
    }
    
    
  @Override
  public double Salario(){
      //recebe os dias trabalhados armazenando em uma variavel dias
        double salario=1212.00;
        
        
        return salario; // retorna salario vezes os dias recebido pelo arquivo
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
     ArrayList<Pessoa> lista =  Empacotamento.lerArquivoBinario("funcionario.dat");
     ArrayList<Pessoa> dado = new ArrayList();
     
     for(int j=0; j<=lista.size();j++){
         if(lista.get(j).getEmail().equals(s)){
             dado.add(lista.get(j));
             break;
         }
     }
     dado.get(0).setEmail("***");
     dado.get(0).setSenha("***");
     
     return dado;
 } 
 
 public void Entregas(){
    
 }
 
 
 
 
}
