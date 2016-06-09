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
public class Associacao {
    private int key;
    private String nome;
    
    public Associacao (int key, String nome){
        this.key = key;
        this.nome = nome;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Associacao{" + "key=" + key + " , nome=" + nome + '}';
    }
    
    
    
}
