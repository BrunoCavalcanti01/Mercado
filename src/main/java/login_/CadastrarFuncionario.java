/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_;

import java.util.ArrayList;


/**
 *
 * @author thoma
 */
public class CadastrarFuncionario {
   private ArrayList <Pessoa> funcionario = Empacotamento.lerArquivoBinario("funcionario.dat");
    
   public CadastrarFuncionario() {
    }


    //op é o cargo
   public void Cadastrar(String nome,int op,String cpf,String senha,String email,int idade){
        int id=this.funcionario.size()+1;
       Pessoa g = new Pessoa(id,nome,op,cpf,senha,email,idade);
       System.out.println("Rodou!! 1");
       this.funcionario.add(g);
       Empacotamento.gravarArquivoBinario(this.funcionario, "funcionario.dat");
       System.out.println("Rodou!! 2");
  }


    
    
    }


 
