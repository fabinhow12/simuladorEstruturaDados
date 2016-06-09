/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executa;


import repositorio.ArvoreBinaria;
import repositorio.MapaEspalhamento;
import teste.TesteMapaEsp;


/**
 *
 * @author fabio
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        MapaEspalhamento<Integer,String> teste = new MapaEspalhamento<>();
        
        for (int i = 0; i < 10; i++) {
            teste.adicionar(i, "teste"+i);
        }
        for (int i = 0; i < 10; i++) {
            teste.remove(i);
        }
        
        System.out.println(teste.getTamanho());
        
        
         
         
    }
}
