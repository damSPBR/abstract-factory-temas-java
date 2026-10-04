package factory;

import produto.Botao;
import produto.CampoTexto;
import produto.Janela;

public interface factoryTema {
    Botao criarBotao();
    Janela criarJanela();
    CampoTexto criarCampoTexto();
}
