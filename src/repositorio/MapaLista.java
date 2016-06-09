/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Model.Associacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabio
 */
public class MapaLista {
    
    List<Associacao> mapaLista = new ArrayList<>();
    private int tamanho = 0;
    
    public void adiciona(int key, String nome){
        if (!this.contemChave(key)){
            Associacao aux = new Associacao(key, nome);
            this.mapaLista.add(aux);
            this.tamanho++;
        }else{
            throw new IllegalArgumentException("Já existe esse elemento");
        }
    }
    
    public String Pesquisa(int key){
        
        for (Associacao aux : mapaLista) {
            if (key == aux.getKey()){
                return aux.getNome();
            }
        }
            throw new IllegalArgumentException("Elemento não Existe");
    }
    
    public void atualiza(int key,String nome){
       
        
        for (Associacao get : mapaLista) {
            if(get.getKey() == key){
                get.setNome(nome);
            }
        }
        
        
        
    }
    
    public void remove(int key){
        if (this.contemChave(key)){
            
            for (int i = 0; i < this.mapaLista.size(); i++) {
                Associacao get = this.mapaLista.get(i);
                
                if (key == get.getKey()){
                    this.mapaLista.remove(i);
                    this.tamanho--;
                    break;
                }
            }
            
        }else {
            throw new IllegalArgumentException("Não existe esse elemento");
        }
    }
    
    public boolean contemChave(int key){
        boolean condicao = false;
        for (Associacao associacao : mapaLista) {
            if (key == associacao.getKey()){
                condicao = true;
                return condicao;
            }
        }
        
        return condicao;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
}
