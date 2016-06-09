/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author fabio
 */
public interface ITeste {
    
    
    static int MENOR = 10000;
    static int MAIOR = 100000;
    
    //Melhor Caso
    
    public long adicionarPouco();
    
    public long removerPouco();
    
    public long atualizarPouco();
    
    public long pesquisarPouco();
    
    
    //Pior Caso
    
    public long adicionarMuito();
    
    public long removerMuito();
    
    public long atualizarMuito();
    
    public long pesquisarMuito();
    
    
    
}
