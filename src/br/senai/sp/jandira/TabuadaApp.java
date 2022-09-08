package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;

public class TabuadaApp {

	public static void main(String[] args) {
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 600;
		tela.altura = 800;
		tela.criarTela();
	}

}
