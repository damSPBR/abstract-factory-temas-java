package factory;

import claro.BotaoClaro;
import claro.CampoTextoClaro;
import claro.JanelaClaro;
import produto.Botao;
import produto.CampoTexto;
import produto.Janela;

public class FabricaTemaClaro implements factoryTema{
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    public Janela criarJanela() {
        return new JanelaClaro();
    }

    public CampoTexto criarCampoTexto() {
        return new CampoTextoClaro();
    }

}
