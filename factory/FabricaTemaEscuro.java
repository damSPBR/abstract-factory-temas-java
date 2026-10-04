package factory;

import escuro.BotaoEscuro;
import escuro.CampoTextoEscuro;
import escuro.JanelaEscuro;
import produto.Botao;
import produto.CampoTexto;
import produto.Janela;

public class FabricaTemaEscuro implements factoryTema {
        public Botao criarBotao() {
        return new BotaoEscuro();
    }

    public Janela criarJanela() {
        return new JanelaEscuro();
    }

    public CampoTexto criarCampoTexto(){
        return new CampoTextoEscuro();
    }
    
}