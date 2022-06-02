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
public class Cadastrar {
    private ArrayList <Pessoa> cliente = Empacotamento.lerArquivoBinario("funcionario.dat");


 //op é o cargo
   public void Cadastrar(String nome,String cpf,String senha,String email,int idade){
         int id=cliente.size()+1;
       Pessoa g = new Pessoa(id,nome,4,cpf,senha,email,idade);
       System.out.println("Rodou!! 1");
       this.cliente.add(g);
       Empacotamento.gravarArquivoBinario(cliente, "funcionario.dat");
       System.out.println("Rodou!! 2");
  }


}
