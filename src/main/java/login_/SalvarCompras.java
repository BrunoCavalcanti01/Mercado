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
public class SalvarCompras {
    ArrayList<ListaCompras> lista = Lista.lerArquivoBinario("ListaCompras.dat");
    
    public void salvar(String nome,String cpf,String endereco){
       ListaCompras a = new ListaCompras(nome, cpf, endereco);
       
       lista.add(a);
       
       Lista.gravarArquivoBinario(lista, "ListaCompras.dat");
    }
    
    public ArrayList<ListaCompras> RetornarLista(){
        ArrayList<ListaCompras> lista = Lista.lerArquivoBinario("ListaCompras.dat");
        ArrayList<ListaCompras> newlista= new ArrayList();
        
        for(int i=0;i<lista.size();i++){
            System.out.println("Rodou : "+i);
           newlista.add(lista.get(i));
        }
        
        
        return newlista;
    }
}
