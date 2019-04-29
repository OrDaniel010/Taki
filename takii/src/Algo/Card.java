package Algo;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/** 
 * This Class Represent A Single Card Which Has
 * 
 * Color: 
 * b - Blue,
 * g - Green,
 * y - Yellow,
 * r - Red,
 * 
 * Type (For Normal Colors):
 * 1:9	- Normal Number
 * CD	- Change Direction
 * PO	- Plus One
 * S	- Stop
 * T 	- Taki
 * BG 	- BackGround
 * 
 * Type (For Special):
 * 1	- Change Color
 * 2	- Special Taki
 * 
 * @author Or Daniel
 *
 */
public class Card extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private char color;
    private int type;
    
    
    public Card(char color, int type) 
    {
    	this.color = color;
    	this.type = type;
    	newCard(color, type);
    }
    
    public Card newCard (char color, int type)
    {
        switch (color) {
        case 'b':
        	switch (type) {
        	case 1:
        		ImageIcon Ones = new ImageIcon("Resources\\blue\\1B.png");
            	this.setIcon(Ones);
            	return this;
            case 2:
            	ImageIcon Twos = new ImageIcon("Resources\\blue\\2B.png");
            	this.setIcon(Twos);
            	return this;
            case 3:
            	ImageIcon Threes = new ImageIcon("Resources\\blue\\3B.png");
            	this.setIcon(Threes);
            	return this;
            case 4:
            	ImageIcon Fours = new ImageIcon("Resources\\blue\\4B.png");
            	this.setIcon(Fours);
            	return this;
            case 5:
            	ImageIcon Fives = new ImageIcon("Resources\\blue\\5B.png");
            	this.setIcon(Fives);
            	return this;
            case 6:
            	ImageIcon Sixs = new ImageIcon("Resources\\blue\\6B.png");
            	this.setIcon(Sixs);
            	return this;
            case 7:
            	ImageIcon Sevens = new ImageIcon("Resources\\blue\\7B.png");
            	this.setIcon(Sevens);
            	return this;
            case 8:
            	ImageIcon Eights = new ImageIcon("Resources\\blue\\8B.png");
            	this.setIcon(Eights);
            	return this;
            case 9:
            	ImageIcon Nines = new ImageIcon("Resources\\blue\\9B.png");
            	this.setIcon(Nines);
            	return this;
            case 10: // Blue Change Direction
            	ImageIcon CDB = new ImageIcon("Resources\\blue\\CDB.png");
            	this.setIcon(CDB);
            	return this;
            case 11: // Blue Plus One
            	ImageIcon POB = new ImageIcon("Resources\\blue\\PB.png");
            	this.setIcon(POB);
            	return this;
            case 12: // Blue Stop
            	ImageIcon SB = new ImageIcon("Resources\\blue\\StopB.png");
            	this.setIcon(SB);
            	return this;
            case 13: // Blue Taki
            	ImageIcon TB = new ImageIcon("Resources\\blue\\TakiB.png");
            	this.setIcon(TB);
            	return this;
            default: 
            	ImageIcon BG = new ImageIcon("Resources\\other\\Back.png");
            	this.setIcon(BG);
            	return this;              		
            }
        case 'y':
        	switch (type) {
        	case 1:
        		ImageIcon Ones = new ImageIcon("Resources\\yellow\\1Y.png");
            	this.setIcon(Ones);
            	return this;
            case 2:
            	ImageIcon Twos = new ImageIcon("Resources\\yellow\\2Y.png");
            	this.setIcon(Twos);
            	return this;
            case 3:
            	ImageIcon Threes = new ImageIcon("Resources\\yellow\\3Y.png");
            	this.setIcon(Threes);
            	return this;
            case 4:
            	ImageIcon Fours = new ImageIcon("Resources\\yellow\\4Y.png");
            	this.setIcon(Fours);
            	return this;
            case 5:
            	ImageIcon Fives = new ImageIcon("Resources\\yellow\\5Y.png");
            	this.setIcon(Fives);
            	return this;
            case 6:
            	ImageIcon Sixs = new ImageIcon("Resources\\yellow\\6Y.png");
            	this.setIcon(Sixs);
            	return this;
            case 7:
            	ImageIcon Sevens = new ImageIcon("Resources\\yellow\\7Y.png");
            	this.setIcon(Sevens);
            	return this;
            case 8:
            	ImageIcon Eights = new ImageIcon("Resources\\yellow\\8Y.png");
            	this.setIcon(Eights);
            	return this;
            case 9:
            	ImageIcon Nines = new ImageIcon("Resources\\yellow\\9Y.png");
            	this.setIcon(Nines);
            	return this;
            case 10: // yellow Change Direction
            	ImageIcon CDB = new ImageIcon("Resources\\yellow\\CDY.png");
            	this.setIcon(CDB);
            	return this;
            case 11: // yellow Plus One
            	ImageIcon POB = new ImageIcon("Resources\\yellow\\PY.png");
            	this.setIcon(POB);
            	return this;
            case 12: // yellow Stop
            	ImageIcon SB = new ImageIcon("Resources\\yellow\\StopY.png");
            	this.setIcon(SB);
            	return this;
            case 13: // yellow Taki
            	ImageIcon TB = new ImageIcon("Resources\\yellow\\TakiY.png");
            	this.setIcon(TB);
            	return this;
            default: 
            	ImageIcon BG = new ImageIcon("Resources\\other\\Back.png");
            	this.setIcon(BG);
            	return this;              		
            }
        case 'g':
        	switch (type) {
        	case 1:
        		ImageIcon Ones = new ImageIcon("Resources\\green\\1G.png");
            	this.setIcon(Ones);
            	return this;
            case 2:
            	ImageIcon Twos = new ImageIcon("Resources\\green\\2G.png");
            	this.setIcon(Twos);
            	return this;
            case 3:
            	ImageIcon Threes = new ImageIcon("Resources\\green\\3G.png");
            	this.setIcon(Threes);
            	return this;
            case 4:
            	ImageIcon Fours = new ImageIcon("Resources\\green\\4G.png");
            	this.setIcon(Fours);
            	return this;
            case 5:
            	ImageIcon Fives = new ImageIcon("Resources\\green\\5G.png");
            	this.setIcon(Fives);
            	return this;
            case 6:
            	ImageIcon Sixs = new ImageIcon("Resources\\green\\6G.png");
            	this.setIcon(Sixs);
            	return this;
            case 7:
            	ImageIcon Sevens = new ImageIcon("Resources\\green\\7G.png");
            	this.setIcon(Sevens);
            	return this;
            case 8:
            	ImageIcon Eights = new ImageIcon("Resources\\green\\8G.png");
            	this.setIcon(Eights);
            	return this;
            case 9:
            	ImageIcon Nines = new ImageIcon("Resources\\green\\9G.png");
            	this.setIcon(Nines);
            	return this;
            case 10: // green Change Direction
            	ImageIcon CDB = new ImageIcon("Resources\\green\\CDG.png");
            	this.setIcon(CDB);
            	return this;
            case 11: // green Plus One
            	ImageIcon POB = new ImageIcon("Resources\\green\\PG.png");
            	this.setIcon(POB);
            	return this;
            case 12: // green Stop
            	ImageIcon SB = new ImageIcon("Resources\\green\\StopG.png");
            	this.setIcon(SB);
            	return this;
            case 13: // green Taki
            	ImageIcon TB = new ImageIcon("Resources\\green\\TakiG.png");
            	this.setIcon(TB);
            	return this;
            default: 
            	ImageIcon BG = new ImageIcon("Resources\\other\\Back.png");
            	this.setIcon(BG);
            	return this;              		
            }
        case 'r':
        	switch (type) {
        	case 1:
        		ImageIcon Ones = new ImageIcon("Resources\\red\\1R.png");
            	this.setIcon(Ones);
            	return this;
            case 2:
            	ImageIcon Twos = new ImageIcon("Resources\\red\\2R.png");
            	this.setIcon(Twos);
            	return this;
            case 3:
            	ImageIcon Threes = new ImageIcon("Resources\\red\\3R.png");
            	this.setIcon(Threes);
            	return this;
            case 4:
            	ImageIcon Fours = new ImageIcon("Resources\\red\\4R.png");
            	this.setIcon(Fours);
            	return this;
            case 5:
            	ImageIcon Fives = new ImageIcon("Resources\\red\\5R.png");
            	this.setIcon(Fives);
            	return this;
            case 6:
            	ImageIcon Sixs = new ImageIcon("Resources\\red\\6R.png");
            	this.setIcon(Sixs);
            	return this;
            case 7:
            	ImageIcon Sevens = new ImageIcon("Resources\\red\\7R.png");
            	this.setIcon(Sevens);
            	return this;
            case 8:
            	ImageIcon Eights = new ImageIcon("Resources\\red\\8R.png");
            	this.setIcon(Eights);
            	return this;
            case 9:
            	ImageIcon Nines = new ImageIcon("Resources\\red\\9R.png");
            	this.setIcon(Nines);
            	return this;
            case 10: // red Change Direction
            	ImageIcon CDB = new ImageIcon("Resources\\red\\CDR.png");
            	this.setIcon(CDB);
            	return this;
            case 11: // red Plus One
            	ImageIcon POB = new ImageIcon("Resources\\red\\PR.png");
            	this.setIcon(POB);
            	return this;
            case 12: // red Stop
            	ImageIcon SB = new ImageIcon("Resources\\red\\StopR.png");
            	this.setIcon(SB);
            	return this;
            case 13: // red Taki
            	ImageIcon TB = new ImageIcon("Resources\\red\\TakiR.png");
            	this.setIcon(TB);
            	return this;
            default: 
            	ImageIcon BG = new ImageIcon("Resources\\other\\Back.png");
            	this.setIcon(BG);
            	return this;              		
            }
        	default:
        		switch (type) {
            	case 1:
            		ImageIcon CC = new ImageIcon("Resources\\other\\CC.png");
                	this.setIcon(CC);
                	return this;
                case 2:
                	ImageIcon ST = new ImageIcon("Resources\\other\\STaki.png");
                	this.setIcon(ST);
                	return this;
                default: 
                	ImageIcon BG = new ImageIcon("Resources\\other\\Back.png");
                	this.setIcon(BG);
                	return this;              		
                }
        }
    }

	public char getColor() {
		return color;
	}

	public int getType() {
		return type;
	}

}
