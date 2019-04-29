package Algo;
import Algo.Card;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;


public class Deck 
{
    private HashMap<Integer, Card> cards;
    public Deck() 
    {
    	this.cards = new HashMap<Integer, Card>();
    	Random rand = new Random();
    	Stack<Card> one = new Stack<Card>();
    	Stack<Card> two = new Stack<Card>();
    	Stack<Card> three = new Stack<Card>();
    	Stack<Card> four = new Stack<Card>();
    	Stack<Card> mix = new Stack<Card>();
    	for (int i=0 ; i<13 ; i++) {
    		one.push(new Card ('b', i+1));
    	}
    	for (int i=0 ; i<13 ; i++) {
    		two.push(new Card ('y', i+1));
    	}
    	for (int i=0 ; i<13 ; i++) {
    		three.push(new Card ('g', i+1));
    	}
    	for (int i=0 ; i<13 ; i++) {
    		four.push(new Card ('r', i+1));
    	}
    	int which = rand.nextInt(2)+1;
    	while (!one.isEmpty() && !two.isEmpty()) {
    		if (which==1) {
        		mix.push(one.pop());
    		}
    		if (which==2) {
    			mix.push(two.pop());
    		}
    		which = rand.nextInt(2)+1;
    	}
    	if (one.isEmpty()) {
    		while (!two.isEmpty()) {
    			mix.push(two.pop());
    		}
    	}
    	if (two.isEmpty()) {
        	while (!one.isEmpty()) {
        		mix.push(one.pop());
        	}
    	}	
    	which = rand.nextInt(2)+3;
    	while (!three.isEmpty() && !four.isEmpty()) {
    		if (which==3) {
    			mix.push(three.pop());
    		}
    		if (which==4) {
    			mix.push(four.pop());
    		}
    		which = rand.nextInt(2)+3;
    	}
    	if (three.isEmpty()) {
        	while (!four.isEmpty()) {
        		mix.push(four.pop());
        	}
    	}
        if (four.isEmpty()) {
            while (!three.isEmpty()) {
            	mix.push(three.pop());
           }
        }
        int ammount = mix.size();
    	for (int j=1 ; j<ammount; j++) {
    		cards.put(j, mix.pop());
    	}
    }
    
    
    public Card getNextCard() 
    {
    	Random rand = new Random();
    	int index = rand.nextInt(cards.size());
    	while (!cards.containsKey(index)){
    		index = rand.nextInt(cards.size());
    	}
    	Card c = cards.get(index);
    	cards.remove(index);
    	return c;
   	}
}
