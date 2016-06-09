/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.ArvoreBinaria;

/**
 *
 * @author fabio
 */
public class TesteArvore implements ITeste {

    ArvoreBinaria<String> arvore = new ArvoreBinaria<>();
    
    //Arrays para adicionar aleatórios
    List<Integer> aleatorios = new ArrayList<>();
    List<Integer> aleatoriosMuitos = new ArrayList<>();

    public TesteArvore() {//Construtor para criar números aleatórios

        for (int i = 0; i < MENOR; i++) {
            aleatorios.add(i + 1);
        }
        Collections.shuffle(aleatorios);

        for (int i = 0; i < MAIOR; i++) {
            aleatoriosMuitos.add(i + 1);
        }
        Collections.shuffle(aleatoriosMuitos);

    }

    @Override
    public long adicionarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            arvore.adicionar(aleatorios.get(i), "teste" + i);
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            try {
                arvore.exclui(i + 1);
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
            arvore.Atualiza(i + 1, "novo" + i);
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarPouco() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MENOR; i++) {
            try {
                arvore.pesquisa(i + 1);
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
            arvore.adicionar(aleatoriosMuitos.get(i), "teste" + i);
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long removerMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            try {
                arvore.exclui(i + 1);
            } catch (Exception ex) {
                Logger.getLogger(TesteArvore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long atualizarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            arvore.Atualiza(i + 1, "novo" + i);
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

    @Override
    public long pesquisarMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
            try {
                arvore.pesquisa(i + 1);
            } catch (Exception ex) {
                Logger.getLogger(TesteArvore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        long tempoFinal = System.currentTimeMillis();
        return (tempoFinal - tempoInicio);
    }

}
