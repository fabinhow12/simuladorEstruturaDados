/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.MapaLista;

/**
 *
 * @author fabio
 */
public class TesteMapaLista implements ITeste{
     MapaLista mapaLista = new MapaLista();
    
     @Override
    public long adicionarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaLista.adiciona((i+1), "teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            try {
                mapaLista.remove((i+1));
            } catch (Exception ex) {
                Logger.getLogger(TesteArvore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long atualizarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaLista.atualiza((i+1), "novo"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            try {
                mapaLista.contemChave((i+1));
            } catch (Exception ex) {
                Logger.getLogger(TesteArvore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long adicionarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            mapaLista.adiciona((i+1), "teste"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            mapaLista.remove((i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long atualizarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaLista.atualiza((i+1), "novo"+(i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            mapaLista.Pesquisa((i+1));
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }
}
