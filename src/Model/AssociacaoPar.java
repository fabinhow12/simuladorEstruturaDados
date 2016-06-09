/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fabio
 */
public class AssociacaoPar<K,V> {
    private K key;
    private V valor;
    
    public AssociacaoPar(K key,V valor){
        this.key = key;
        this.valor = valor;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "AssociacaoPar{" + "key=" + key + ", valor=" + valor + '}';
    }
    
    
}
