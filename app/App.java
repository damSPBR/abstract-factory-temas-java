package app;

import java.util.Scanner;

import factory.FabricaTemaClaro;
import factory.FabricaTemaEscuro;
import factory.factoryTema;
import produto.CampoTexto;
import produto.Janela;
import produto.Botao;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println(" SISTEMA DE TEMA DE INTERFACE");
        System.out.println("===================================");
        System.out.println("1 - Tema Claro");
        System.out.println("2 - Tema Escuro");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        factoryTema fabrica;

        if(opcao == 1){
            fabrica = new FabricaTemaClaro();
        } else if (opcao == 2){
            fabrica = new FabricaTemaEscuro();
        } else {
            System.out.println("Erro: Opção de tema invalida");
            sc.close();
            return ;
        }

        Botao botao = fabrica.criarBotao();
        Janela janela = fabrica.criarJanela();
        CampoTexto campoTexto = fabrica.criarCampoTexto();

        botao.renderizar();
        janela.abrir();
        campoTexto.desenhar();

        sc.close();
    }
    
}
