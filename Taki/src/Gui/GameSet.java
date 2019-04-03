package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Algo.*;

public class GameSet
{
	// Game Configuration;
	
	Deck mainDeck = new Deck();
	Card lastOneCard = mainDeck.getNextCard();
	Ply selfPly;
	Ply enemyPly;
	
	// Visual Configuration;
	
	JFrame mainFrame = new JFrame("Taki");
	JPanel selfPlyPanel;
	JPanel enemyPlyPanel;
	JPanel mainTablePanel;
	JPanel gameStatus;
	
}
