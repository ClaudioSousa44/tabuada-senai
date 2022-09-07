package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.lang.invoke.WrongMethodTypeException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Multiplicação;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();		
		
		JLabel labeltabuada1 = new JLabel();
		labeltabuada1.setText("Tabuada 1.0");
		labeltabuada1.setForeground(Color.red);
		labeltabuada1.setBounds(100, 20, 200, 30);
		labeltabuada1.setFont(new Font(null, 0, 30));
		
		ImageIcon icon = new ImageIcon("C:/Users/cauhs/eclipse-workspace/tabuada/src/br/senai/sp/jandira/model/matematica.png");
		JLabel icone = new JLabel(icon);
		icone.setBounds(20, 20, 80, 80);
		
		JLabel labeldesc = new JLabel();
		labeldesc.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule ");
		labeldesc.setForeground(Color.gray);
		labeldesc.setBounds(105, 55, 400, 20);
		
		JLabel labeldesc2 = new JLabel();
		labeldesc2.setText("a tabuada que desejar em segundos! ");
		labeldesc2.setForeground(Color.gray);
		labeldesc2.setBounds(105, 75, 400, 20);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(165, 120, 135, 30);
		labelMultiplicando.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(320, 120, 200, 30);
		textFieldMultiplicando.setForeground(Color.blue);
		
		JLabel labelMinMulti = new JLabel();
		labelMinMulti.setText("Mínimo Multiplicador:");
		labelMinMulti.setBounds(98, 170, 202, 30);
		labelMinMulti.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMinMult = new JTextField();
		textFieldMinMult.setBounds(320, 170, 200, 30);
		textFieldMinMult.setForeground(Color.blue);
		
		JLabel labelMaxMulti = new JLabel();
		labelMaxMulti.setText("Máximo Multiplicador:");
		labelMaxMulti.setBounds(95, 220, 205, 30);
		labelMaxMulti.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMaxMult = new JTextField();
		textFieldMaxMult.setBounds(320, 220, 200, 30);
		textFieldMaxMult.setForeground(Color.blue);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(95, 280, 235, 50);
		buttonCalcular.setForeground(Color.white);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setBackground(Color.orange);
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(340, 280, 180, 50);
		buttonLimpar.setForeground(Color.white);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font(null, 0, 20));
		labelResultado.setBounds(95, 350, 200, 30);


		JLabel labelLista = new JLabel();
		labelLista.setBackground(Color.YELLOW);
		labelLista.setBounds(95, 385, 400, 350);
		labelLista.setForeground(Color.green);
		
		
		
		
		
		
		
		painel.add(labeltabuada1);
		painel.add(icone);
		painel.add(labeldesc);
		painel.add(labeldesc2);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinMulti);
		painel.add(textFieldMinMult);
		painel.add(labelMaxMulti);
		painel.add(textFieldMaxMult);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(labelLista);
		
		
		
		
		
		tela.setVisible(true);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Multiplicação mult = new Multiplicação();
				mult.multiplicando = Integer.parseInt(textFieldMaxMult.getText());
				mult.minMult = Integer.parseInt(textFieldMinMult.getText());
				mult.maxMult = Integer.parseInt(textFieldMaxMult.getText());
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
	}
	

}
