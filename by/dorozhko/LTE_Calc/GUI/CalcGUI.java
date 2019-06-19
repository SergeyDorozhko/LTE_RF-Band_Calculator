package by.dorozhko.LTE_Calc.GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import by.dorozhko.LTE_Calc.Calculation.CalcingFDD;
import by.dorozhko.LTE_Calc.Calculation.Calculating;

/**
 * This class building GUI
 * @author Sergey Dorozhko
 *
 */
public class CalcGUI {

	JTextField inputTextEARFCN;
	JTextArea outText;
	
	/**
	 * This method starting GUI
	 */
	public void startGUI() {
		JFrame frame=new JFrame("LTE RF Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel background=new JPanel();
		background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.CENTER, background);
		background.setBackground(Color.lightGray);
		
		JPanel textInPanel=new JPanel();
		textInPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		textInPanel.setBackground(Color.LIGHT_GRAY);
		
		JLabel inputLabelEARFCN=new JLabel("Введиет EARFCN:");
		inputLabelEARFCN.setFont(new Font("TimesNewRoman", Font.BOLD,15));
		textInPanel.add(inputLabelEARFCN);
				
		inputTextEARFCN=new JTextField(10);
		inputTextEARFCN.setFont(new Font("TimesNewRoman", Font.PLAIN,15));
		textInPanel.add(inputTextEARFCN);
		
		background.add(textInPanel);
		
		JPanel panelButton=new JPanel();
		panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));

		background.add(panelButton);
		panelButton.setBackground(Color.lightGray);
		JButton button=new JButton("Рассчитать");
		button.setFont(new Font("TimesNewRoman", Font.HANGING_BASELINE,20));
		button.addActionListener(new ButtonListener());
		panelButton.add(button);
		
		JPanel outPanel=new JPanel();
		outPanel.setLayout(new BoxLayout(outPanel,BoxLayout.X_AXIS));
		outText=new JTextArea();
		outText.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
		outText.setWrapStyleWord(true);
		outPanel.add(outText);
		background.add(outPanel);
		
		
		frame.setSize(500,430);
		frame.setVisible(true);
		
	}
	/**
	 * When You press button class {@link Calculating} is started.
	 * 
	 */
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String inputText= inputTextEARFCN.getText();
			outText.setText(new Calculating().startCalc(inputText));
		}
	}
	
}
