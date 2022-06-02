/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_;

import java.io.Serializable;

/**
 *
 * @author thoma
 */
public class Pessoa implements Serializable{
    private String nome,CPF,senha,email;
    private int funcao; // 1-Entregador; 2-gerente; 3-Funcionario;
    private int idade;
    private int id;
    
    
    public Pessoa(){
        
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getFuncao() {
        return funcao;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(int id,String nome, int funcao, String CPF, String senha, String email, int idade) {
        this.nome = nome;
        this.funcao = funcao;
        this.CPF = CPF;
        this.senha = senha;
        this.email = email;
        this.idade = idade;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", funcao=" + funcao + ", CPF=" + CPF + ", senha=" + senha + ", email=" + email + ", idade=" + idade + '}';
    }
    
    
   
}
