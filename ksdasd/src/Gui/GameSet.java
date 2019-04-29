package Gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Algo.*;



public class GameSet extends JFrame
{
	// Game Configuration;
	Deck mainDeck = new Deck();
	Card lastOneCard = mainDeck.getNextCard();
	Ply selfPly;
	Ply enemyPly;
	boolean plyTurn = true;
	int selfNumOfCardHand = 8;
	int enemyNumOfCardHand = 8;
	
	// Visual Configuration;
	JPanel selfPlyPanel;
	JPanel enemyPlyPanel;
	JPanel mainTablePanel;
	JPanel selfPlyColorChanging;
	JButton mainButton = new JButton();
	
	public static void main(String[] args)
	{
		GameSet g = new GameSet();
	}
	
	private GameSet()
	{
		mainButton.setText("Start New Game!");
		mainButton.setHorizontalAlignment(JButton.RIGHT);
		this.setSize(750, 400);
		this.setTitle("Taki");
		
		selfPlyPanel = new JPanel();
		enemyPlyPanel = new JPanel();
		mainTablePanel = new JPanel();
		selfPlyColorChanging = new JPanel();
		
		selfPlyPanel.setBackground(Color.GRAY);
		enemyPlyPanel.setBackground(Color.GRAY);
		mainTablePanel.setBackground(Color.GRAY);
		selfPlyColorChanging.setBackground(Color.GRAY);
		
		this.setLayout(new GridLayout(4, 0));
		this.add(enemyPlyPanel);
		this.add(mainTablePanel);
		this.add(selfPlyPanel);
		this.add(selfPlyColorChanging);
		
		//mainButton.addActionListener(new ClickListener1());
		selfPlyPanel.add(mainButton);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void startGame()
	{
		this.selfPly = new Ply();
		this.enemyPly = new Ply();
		
		for(int i=0;i<selfNumOfCardHand;i++)
		{
			selfPly.addCard(mainDeck.getNextCard());
		//	selfPly.plyHand.get(i).addActionListener(new ClickListener2());
		}
		for(int i=0;i<selfNumOfCardHand;i++)
		{
			enemyPly.addCard(mainDeck.getNextCard());
		//	enemyPly.plyHand.get(i).addActionListener(new ClickListener2());
		}
		
	}
	
	class ClickListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(mainButton));
			{
				startGame();
			}
		}

		
		
	}
}


