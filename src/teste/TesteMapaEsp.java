/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import repositorio.MapaEspalhamento;

/**
 *
 * @author fabio
 */
public class TesteMapaEsp implements ITeste {
    MapaEspalhamento<Integer, String> mapaEsp = new MapaEspalhamento<>();
    
    
    @Override
    public long adicionarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaEsp.adicionar((i+1), "teste"+(i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
        
    }

    @Override
    public long removerPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaEsp.remove((i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long atualizarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaEsp.atualiza((i+1), "teste"+(i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long pesquisarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaEsp.pesquisa((i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long adicionarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            mapaEsp.adicionar((i+1), "teste"+(i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long removerMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaEsp.remove((i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long atualizarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            mapaEsp.atualiza((i+1), "teste"+(i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long pesquisarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            mapaEsp.pesquisa((i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }
    
}
