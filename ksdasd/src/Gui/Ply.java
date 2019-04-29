package Gui;

import Algo.*;
import java.util.*;


public class Ply 
{
	Vector<Card> plyHand;
	int plyHandSize;
	
	public Ply()
	{
		this.plyHandSize = 0;
		this.plyHand = new Vector<Card>();
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
