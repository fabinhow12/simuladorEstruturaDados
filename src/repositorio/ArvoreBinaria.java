/*
 * O Acesso da árvore é feita a partir de pós-ordem ou seja acessa todos da esquerda, depois da direita e por último a raiz
 */
package repositorio;

import Model.No;

/**
 *
 * @author fabio
 * @param <V>
 */
public class ArvoreBinaria<V> {

    private No raiz;

    public Boolean estaVazia() {
        Boolean vazia = false;
        if (raiz == null) {
            return vazia = true;
        }
        return vazia;
    }

    public int getQuantidade() {
        System.out.print("Quantidade: ");
        return getQuantidadeNos(this.raiz);
    }

    public void adicionar(int key, V valor) {

        if (this.raiz == null) {
            this.raiz = new No(valor, key);
        } else {
            inserir(this.raiz, key, valor);
        }
    }

    public void listaArvore() {
        System.out.println("Imprimindo árvore em pós-ordem");
        System.out.println("=====================");
        if (this.raiz == null) {
            System.out.println("Árvore Vazia");
        } else {
            imprimirArvore(this.raiz);
        }
    }

    public No exclui(int valor) throws Exception {
        return remove(this.raiz, valor);
    }

    public No pesquisa(int valor) throws Exception {
        return encontraValor(this.raiz, valor);
    }

    public void Atualiza(int key, V valor) {
        atualizar(this.raiz, key, valor);
    }

    public void desenha(){
        if (this.raiz == null){
            System.out.println("Não tem elementos para desenhar");
        }
        this.desenhaArvore(this.raiz);
    }
    
    //Métodos Privados
    private int getQuantidadeNos(No raiz) {
        int tamanho = 0;
        if (raiz == null) {
            return tamanho;
        }
        int quantidadeNoEsq = getQuantidadeNos(raiz.getNoEsquerda());
        int quantidadeNoDir = getQuantidadeNos(raiz.getNoDireita());
        tamanho = (quantidadeNoEsq + quantidadeNoDir + 1);
        return tamanho;
    }

    private void inserir(No elemento, int key, V valor) {

        if (key == elemento.getKey()) {
            System.err.println("Não pode adicionar números repetidos");
        }

        if (key < elemento.getKey()) {//Verifica se o valor é menor que o do nó

            if (elemento.getNoEsquerda() != null) {
                inserir(elemento.getNoEsquerda(), key, valor);
            } else {
                //Nó esquerdo vazio
                elemento.setNoEsquerda(new No(valor, key));
            }

        } else if (key > elemento.getKey()) {//Verifica se o valor é maior que o do nó 

            if (elemento.getNoDireita() != null) {
                inserir(elemento.getNoDireita(), key, valor);
            } else {
                //Nó direito vazio
                elemento.setNoDireita(new No(valor, key));
            }

        }

    }

    private void atualizar(No elemento, int key, V valor) {
        if (this.raiz == null) {
            throw new IllegalArgumentException("Árvore Vazia");
        } else {
            if (key == elemento.getKey()) {
                elemento.setValor(valor);
            } else if (key < elemento.getKey()) {
                if (elemento.getNoEsquerda() != null) {
                    atualizar(elemento.getNoEsquerda(), key, valor);
                }
            } else if (key > elemento.getKey()) {
                if (elemento.getNoDireita() != null) {
                    atualizar(elemento.getNoDireita(), key, valor);
                }
            }

        }
    }

    private void desenhaArvore(No elemento) {

        if (elemento.quantidadeFilhos() == 0) {
            System.out.println("(" + elemento.getKey() + ")");

        } else if (elemento.quantidadeFilhos() == 1) {

            System.out.println("(" + elemento.getKey() + ")");
            
            if (elemento.getNoEsquerda() != null){
                System.out.println("/");
                desenhaArvore(elemento.getNoEsquerda());
                
            } else if (elemento.getNoDireita() != null){
                System.out.println("\\");
                desenhaArvore(elemento.getNoDireita());
            }

        } else if (elemento.quantidadeFilhos() == 2) {
            System.out.println("("+elemento.getKey()+")");
            System.out.println("      /                   \\");
            System.out.println("(" + elemento.getNoEsquerda().getKey() + ")              (" + elemento.getNoDireita().getKey() + ")");
            
            if (elemento.getNoEsquerda().quantidadeFilhos() != 0){
                desenhaArvore(elemento.getNoEsquerda());
            } else if (elemento.getNoDireita().quantidadeFilhos() != 0 ){
                desenhaArvore(elemento.getNoDireita());
            } 
        }
    }

    private void imprimirArvore(No elemento) {

        if (elemento.getNoEsquerda() != null) {

            imprimirArvore(elemento.getNoEsquerda());
            System.out.println("Elemento Da esquerda");
            System.out.println("Do nó:" + elemento.getValor() + "key: " + elemento.getKey());

            System.out.println("=====================");
        }
        if (elemento.getNoDireita() != null) {

            imprimirArvore(elemento.getNoDireita());
            System.out.println("Elemento da direita");
            System.out.println("Do nó:" + elemento.getValor() + "key: " + elemento.getKey());
            System.out.println("=====================");
        }
        System.out.println("Nó:" + elemento.getValor() + "key: " + elemento.getKey());
        if (elemento == this.raiz) {
            System.out.println("Raiz");
            System.out.println("=====================");
        }
    }

    private No remove(No elemento, int key) throws Exception {
        if (this.raiz == null) {
            throw new Exception("Árvore Vazia");
        } else {

            if (key < elemento.getKey()) {
                elemento.setNoEsquerda(remove(elemento.getNoEsquerda(), key));
            } else if (key > elemento.getKey()) {
                elemento.setNoEsquerda(remove(elemento.getNoDireita(), key));
            } else if (elemento.getNoEsquerda() != null && elemento.getNoDireita() != null) {
                //2 nós filhos

                elemento.setValor(encontraMinimo(elemento.getNoDireita()).getValor());
                elemento.setNoDireita(removeMinimo(elemento.getNoDireita()));
            } else {

                elemento = (elemento.getNoEsquerda() != null) ? elemento.getNoEsquerda() : elemento.getNoDireita();
            }
            return elemento;
        }

    }

    private No removeMinimo(No elemento) {
        if (elemento == null) {
            System.out.println("  ERRO ");
        } else if (elemento.getNoEsquerda() != null) {
            elemento.setNoEsquerda(removeMinimo(elemento.getNoEsquerda()));
            return elemento;
        } else {
            return elemento.getNoDireita();
        }
        return null;
    }

    private No encontraMinimo(No elemento) {
        if (elemento != null) {
            while (elemento.getNoEsquerda() != null) {
                elemento = elemento.getNoEsquerda();
            }
        }
        return elemento;
    }

    private No encontraValor(No elemento, int key) throws Exception {

        if (this.raiz == null) {
            throw new Exception("Árvore Vazia");
        } else {

            if (key == elemento.getKey()) {

                return elemento;

            } else if (key < elemento.getKey()) {

                if (elemento.getNoEsquerda() != null) {
                    return encontraValor(elemento.getNoEsquerda(), key);
                }

            } else if (key > elemento.getKey()) {

                if (elemento.getNoDireita() != null) {
                    return encontraValor(elemento.getNoDireita(), key);
                }

            }

        }

        return elemento;
    }

    public No pegarParente(int key) {
        No aux = this.raiz;

        while (aux != null) {
            No esquerdo = aux.getNoEsquerda();
            No direito = aux.getNoDireita();

            if (aux.getKey() == key || (esquerdo != null && esquerdo.getKey() == key) || (direito != null && direito.getKey() == key)) {
                return aux;
            } else if (key < aux.getKey()) {
                aux = esquerdo;
            } else {
                aux = direito;
            }
        }
        return null;
    }

    //pega o maior valor da subarvore da esquerda 
    public No pegarSucessor(No elemento) {
        No aux = elemento.getNoEsquerda();

        while (aux != null) {
            No direito = aux.getNoDireita();

            if (direito != null) {
                aux = aux.getNoDireita();
            } else {
                return aux;
            }
        }

        return null;
    }

}
