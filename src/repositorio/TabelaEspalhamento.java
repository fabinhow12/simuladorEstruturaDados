/*d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fabio
 * @param <V>
 */
public class TabelaEspalhamento<V> {

    private int tamanho = 0;
    private List<List<V>> tabela = new ArrayList<List<V>>();

    public TabelaEspalhamento() {

        for (int i = 0; i < 26; i++) {
            List<V> lista = new LinkedList<>();
            tabela.add(lista);
        }

    }

    public void adiciona(V palavra) {
        if (!this.contem(palavra)) {

            this.verificaCarga();
            int indice = calculaIndiceDaTabela(palavra);
            List<V> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;

        } else {

            System.out.println("Já Existe Essa Palavra");
        }
    }

    public void remove(V palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<V> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.tamanho--;
            this.verificaCarga();
        } else {
            System.out.println("Não Existe essa Pessoa armazenada");
        }
    }

    public boolean contem(V palavra) {
        int indice = this.calculaIndiceDaTabela(palavra);

        List<V> lista = this.tabela.get(indice);

        return lista.contains(palavra);
    }

    public void update(V elemento, V nome) {
        if (this.contem(elemento)) {
            int indice = this.calculaIndiceDaTabela(elemento);
            
            List<V> lista = this.tabela.get(indice);

            for (V get : lista) {
                if (get.equals(elemento)) {
                    
                  get = nome;
                    
                }
            }
        } else {
            throw new IllegalArgumentException("Palavra Não Existe");

        }
    }

    public List<V> pegaTodas() {
        List<V> palavras = new LinkedList<>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    public int tamanho() {
        return this.tamanho;
    }

    //Métodos Privados
    private int calculaIndiceDaTabela(V palavra) {
        int codigoDeEspalhamento = palavra.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    private void redimensionaTabela(int capacidade) {
        List<V> palavras = this.pegaTodas();

        this.tabela.clear();

        for (int i = 0; i < capacidade; i++) {
            this.tabela.add(new LinkedList<V>());
        }

        palavras.stream().forEach((palavra) -> {
            this.adiciona(palavra);
        });

    }

    //Verifica se existe muitos espaços vazios ou não
    private void verificaCarga() {

        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }

    }

    //Método Para Teste de como foi distribuido os valores
    public void imprimiTable() {
        System.out.println("[");
        tabela.stream().forEach((lista) -> {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        });
        System.out.println("]");
    }

}
