/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thoma
 */
public class Login {
      public Pessoa Login(String email,String senha){
         ArrayList <Pessoa> lista = Empacotamento.lerArquivoBinario("funcionario.dat");
    
      for(int i=0;i<=lista.size();i++){
          
          if(email.equals(lista.get(i).getEmail())){
              System.out.println("Rodou if 1");
              if(senha.equals(lista.get(i).getSenha())){
                    System.out.println("Rodou if 2");
                  switch(lista.get(i).getFuncao()){
                      case 1: 
                          return lista.get(i); // Entregador
                      case 2:
                          return lista.get(i); // Gerente
                      case 3:
                          return lista.get(i); // Empregado
                      case 4:
                          return lista.get(i); //Cliente
                      default: JOptionPane.showMessageDialog(null,"Tratar Erro de Funcionario");
}
              }
          }
      }
      JOptionPane.showMessageDialog(null, "Email ou senha incorretos!");
      return null;
  }
    
}
