/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Model.Associacao;
import Model.AssociacaoPar;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fabio
 * @param <K>
 * @param <V>
 */
public class MapaEspalhamento<K,V> {
    
    private List<List<AssociacaoPar<K,V>>> mapaEspalhamento = new ArrayList<List<AssociacaoPar<K,V>>>();
    private int tamanho = 0 ;
    
    public MapaEspalhamento(){
         for (int i = 0; i < 100; i++) {
                this.mapaEspalhamento.add(new LinkedList<AssociacaoPar<K, V>>());
            }
    }
    
    public boolean contemChave(K key){
        int indice = this.calculaIndice(key);
        List<AssociacaoPar<K,V>> lista = this.mapaEspalhamento.get(indice);
        
        for (int i = 0; i < lista.size(); i++) {
            AssociacaoPar<K,V> get = lista.get(i);
            if (get.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }
    
    public void remove(K key){
        int indice = this.calculaIndice(key);
        List<AssociacaoPar<K,V>> lista = this.mapaEspalhamento.get(indice);
        
         for (int i = 0; i < lista.size(); i++) {
             AssociacaoPar<K,V> get = lista.get(i);
             
             if (get.getKey().equals(key)){
                 lista.remove(i);
                 this.tamanho--;
                 return;
             }
                
            }
         
          throw new IllegalArgumentException("A chave não existe");
    }
    
    public void adicionar(K key,V valor){
        if (this.contemChave(key)){
            this.remove(key);
        }
        
        int indice = this.calculaIndice(key);
        List<AssociacaoPar<K,V>> lista = this.mapaEspalhamento.get(indice);
        
        lista.add(new AssociacaoPar<K,V>(key,valor));
        this.tamanho++;
    }
    
    public void atualiza(K key,V valor){
        
        int indice = this.calculaIndice(key);
        List<AssociacaoPar<K,V>> lista = this.mapaEspalhamento.get(indice);
        
        for (AssociacaoPar<K, V> get : lista) {
             if (get.getKey() ==key){
                 get.setValor(valor);
             }
        }
    }
    
    public V pesquisa(K key){
        int indice = this.calculaIndice(key);
        
        List<AssociacaoPar<K,V>> lista = this.mapaEspalhamento.get(indice);
        
        for (AssociacaoPar<K, V> get : lista) {
            if (key.equals(get.getKey())){
                return get.getValor();
            }
        }
        
         throw new IllegalArgumentException("A chave não existe");
    }
    
    //Método Privado da Estrutura
    private int calculaIndice(K key){
        return Math.abs(key.hashCode()) % this.mapaEspalhamento.size();
    }
    
    
    public int getTamanho(){
        return this.tamanho;
    }
    
}
