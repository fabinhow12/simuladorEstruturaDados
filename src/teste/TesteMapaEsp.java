/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import repositorio.MapaEspalhamento;
import static teste.ITeste.MAIOR;
import static teste.ITeste.MENOR;

/**
 *
 * @author fabio
 */
public class TesteMapaEsp implements ITeste {
    MapaEspalhamento<Integer, String> mapaEsp = new MapaEspalhamento<>();
    List<Integer> aleatorios = new ArrayList<>();
    List<Integer> aleatoriosMuitos = new ArrayList<>();
    
    public TesteMapaEsp(){
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
            mapaEsp.adicionar(aleatorios.get(i), "teste"+(i+1));
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
            mapaEsp.adicionar(aleatoriosMuitos.get(i), "teste"+(i+1));
        }
        long tempoDiferenca = System.currentTimeMillis();
        return (tempoDiferenca - tempoInicio);
    }

    @Override
    public long removerMuito() {
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < MAIOR; i++) {
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
