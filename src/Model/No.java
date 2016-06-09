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
public class No<V> {
    
    private V valor;
    private int key;
    private No noDireita;
    private No noEsquerda;

    
    public No() {
    }
    
    public No(V valor,int key) {
        this.valor = valor;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
    
    

    public No getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }

    public No getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(No noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    @Override
    public String toString() {
        return "No{" + "valor=" + valor + ", key=" + key + '}';
    }

    
 
    public int quantidadeFilhos() {
        if (noEsquerda != null && noDireita != null) {
            return 2;
        } else if (noEsquerda != null || noDireita != null) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
