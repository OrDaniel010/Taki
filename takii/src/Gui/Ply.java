package Gui;

import Algo.*;
import java.util.*;


public class Ply 
{
	Vector<Card> plyHand;
	int plyHandSize;
	
	public Ply(Deck d)
	{
		this.plyHandSize = 0;
		this.plyHand = new Vector<Card>();
		for(int i = 0; i<8; i++)
		{
			this.plyHand.add(d.getNextCard());
			this.plyHandSize++;
		}
	}
	
	public Card removeCard(int index)
	{
		if(index <= this.plyHand.size())
		{
			this.plyHandSize--;
			return this.plyHand.remove(index);
		}
		return null;
	}
	
	public void addCard(Card c)
	{
		if(c != null)
		{
			this.plyHand.add(c);
			this.plyHandSize++;
		}
	}

}
