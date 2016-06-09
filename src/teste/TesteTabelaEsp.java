/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import repositorio.TabelaEspalhamento;

/**
 *
 * @author fabio
 */
public class TesteTabelaEsp implements ITeste{

    TabelaEspalhamento<String> tabelaEspalhamento = new TabelaEspalhamento<>();
    
    
    
    @Override
    public long adicionarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            tabelaEspalhamento.adiciona("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerPouco() {
       long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            tabelaEspalhamento.remove("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long atualizarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            tabelaEspalhamento.update("teste"+(i+1),"novo"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            tabelaEspalhamento.contem("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long adicionarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            tabelaEspalhamento.adiciona("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            tabelaEspalhamento.remove("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long atualizarMuito() {
       long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            tabelaEspalhamento.update("teste"+(i+1),"novo"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            tabelaEspalhamento.contem("teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
        
    }
    
}
