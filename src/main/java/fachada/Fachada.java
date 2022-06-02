/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.util.ArrayList;
import login_.Cadastrar;
import login_.Entregador;
import login_.Funcionario;
import login_.Gerente;
import login_.Login;
import login_.Pessoa;

/**
 *
 * @author thoma
/**
 *
 * @author thoma
 */

import java.util.ArrayList;
import login_.Cadastrar;
import login_.CadastrarFuncionario;

import login_.Entregador;
import login_.Funcionario;
import login_.Gerente;
import login_.ListaCompras;
import login_.Login;
import login_.Pessoa;
import login_.SalvarCompras;
import login_.Total;
import login_.Totalclass;



public class Fachada {
    private ArrayList<Totalclass> lista = Total.lerArquivoBinario("total.dat");
    
       private int id;
       private SalvarCompras salvarcompras = new SalvarCompras();
       private  Login a= new Login();
       private Entregador entregador = new Entregador();
       private Funcionario funcionario= new Funcionario();
       private Gerente gerente =new Gerente();
       private Cadastrar cadastrar = new Cadastrar();
       private CadastrarFuncionario cadastrarfun = new CadastrarFuncionario();
       
    
   public Pessoa Logar(String email,String senha ){
     Pessoa n;
    
      n =a.Login(email, senha);
      
       return n;
   }
   
   public Pessoa DadosEntregador(String s){
       
      ArrayList <Pessoa> dado = new ArrayList();
      dado=entregador.dados(s);
      Pessoa p = new Pessoa();
      
       p=dado.get(0);

       return p;
               
   }
   
   public void CadastrarFuncionario(int funcao,String nome,String cpf,String senha,String email,int idade){
       cadastrarfun.Cadastrar(nome,funcao, cpf, senha, email, idade);
   }
 
   public double Salario(int op){
       
       System.out.println("Roudou ");
    double saldo=0;

       switch (op) {
           
           case 1:
               saldo = entregador.Salario();
               break;
              
           case 2:
                 System.out.println("Roudou2");
               saldo =gerente.Salario();
               break;
           case 3:
               saldo = funcionario.Salario();
               break;    
           default:
                 System.out.println("Roudou3");
               throw new AssertionError();
       }
    
      System.out.println("Roudou4");
       return saldo;
   }
   
   public void Ponto(int op){
        switch (op) {
           
           case 1:
               entregador.PrestarContas();
               break;
              
           case 2:
               gerente.PrestarContas();
               break;
           case 3:
              funcionario.PrestarContas();
               break;    
           default:
                
               throw new AssertionError();
       }
   }

   public void CadastrarCliente(String nome,String cpf,String senha,String email,int idade){
       cadastrar.Cadastrar(nome, cpf, senha, email, idade);
   }
     public void Total(double t){
      Totalclass a = new Totalclass(t);
      this.lista.add(a);
      Total.gravarArquivoBinario(lista, "total.dat");
         System.out.println("Soma no total feita com sucesso!");
      
  } 
     public double ReturnTotal(){
          ArrayList<Totalclass> lista = Total.lerArquivoBinario("total.dat");
          
         double total1=0;
         System.out.println("Rodou aqui chefe");
          for(int i=0;i<lista.size();i++){
                System.out.println("Rodou aqui chefe q:"+i);
              double soma =lista.get(i).getTotal();
              total1 = total1+soma;
          }
         System.out.println("Total->"+total1);
          return total1;
     }
     public void Limpar(){
         
         this.lista.clear();
      Total.gravarArquivoBinario(lista, "total.dat");
         System.out.println("Tudo linpo!");
     }
     
    public void SalvarCompraLista(String nome,String cpf,String endereco ){
        salvarcompras.salvar(nome, cpf, endereco);
    }
    
    public ArrayList<ListaCompras>  ListadeCompras(){
        ArrayList<ListaCompras> stri=salvarcompras.RetornarLista();
        
        return stri;
    }
     
   
}
 

