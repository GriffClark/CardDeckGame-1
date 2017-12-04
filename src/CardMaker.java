import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CardMaker {
	Card [] fullDeck = new Card [52];

	public CardMaker() throws IOException{
		
		//This fullDeck is initializing each card and assigning it an index in the fullDeck array
		fullDeck[0] = new Card("Spades","Ace",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\ace_of_spades.png")), true, false, false);
		fullDeck[1] = new Card("Hearts","Ace",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\ace_of_hearts.png")), true, false, false);
		fullDeck[2] = new Card("Clubs","Ace",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\ace_of_clubs.png")), true, false, false);
		fullDeck[3] = new Card("Diamonds","Ace",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\ace_of_diamonds.png")), true, false, false);
		fullDeck[4] = new Card("Spades","Two",2,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\2_of_spades.png")), true, false, false);
		fullDeck[5] = new Card("Hearts","Two",2,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\2_of_hearts.png")), true, false, false);
		fullDeck[6] = new Card("Clubs","Two",2,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\2_of_clubs.png")), true, false, false);
		fullDeck[7] = new Card("Diamonds","Two",2,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\2_of_diamonds.png")), true, false, false);
		fullDeck[8] = new Card("Spades","Three",3,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\3_of_spades.png")), true, false, false);
		fullDeck[9] = new Card("Hearts","Three",3,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\3_of_hearts.png")), true, false, false);
		fullDeck[10] = new Card("Clubs","Three",3,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\3_of_clubs.png")), true, false, false);
		fullDeck[11] = new Card("Diamonds","Three",3,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\3_of_diamonds.png")), true, false, false);
		fullDeck[12] = new Card("Diamonds","Four",4,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\4_of_diamonds.png")), true, false, false);
		fullDeck[13] = new Card("Diamonds","Five",5,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\5_of_diamonds.png")), true, false, false);
		fullDeck[14] = new Card("Diamonds","Six",6,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\6_of_diamonds.png")), true, false, false);
		fullDeck[15] = new Card("Diamonds","Seven",7,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\7_of_diamonds.png")), true, false, false);
		fullDeck[16] = new Card("Diamonds","Eight",8,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\8_of_diamonds.png")), true, false, false);
		fullDeck[17] = new Card("Diamonds","Nine",9,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\9_of_diamonds.png")), true, false, false);
		fullDeck[18] = new Card("Diamonds","Ten",10,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\10_of_diamonds.png")), true, false, false);
		fullDeck[19] = new Card("Diamonds","Jack",11,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\jack_of_diamonds2.png")), true, false, false);
		fullDeck[20] = new Card("Diamonds","Queen",12,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\queen_of_diamonds2.png")), true, false, false);
		fullDeck[21] = new Card("Diamonds","King",13,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\king_of_diamonds2.png")), true, false, false);
		fullDeck[22] = new Card("Clubs","Four",4,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\4_of_clubs.png")), true, false, false);
		fullDeck[23] = new Card("Clubs","Five",5,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\5_of_clubs.png")), true, false, false);
		fullDeck[24] = new Card("Clubs","Six",6,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\6_of_clubs.png")), true, false, false);
		fullDeck[25] = new Card("Clubs","Seven",7,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\7_of_clubs.png")), true, false, false);
		fullDeck[26] = new Card("Clubs","Eight",8,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\8_of_clubs.png")), true, false, false);
		fullDeck[27] = new Card("Clubs","Nine",9,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\9_of_clubs.png")), true, false, false);
		fullDeck[28] = new Card("Clubs","Ten",10,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\10_of_clubs.png")), true, false, false);
		fullDeck[29] = new Card("Clubs","Jack",11,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\jack_of_clubs2.png")), true, false, false);
		fullDeck[30] = new Card("Clubs","Queen",12,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\queen_of_clubs2.png")), true, false, false);
		fullDeck[31] = new Card("Clubs","King",13,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\king_of_clubs2.png")), true, false, false);
		fullDeck[32] = new Card("Hearts","Four",4,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\4_of_hearts.png")), true, false, false);
		fullDeck[33] = new Card("Hearts","Five",5,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\5_of_hearts.png")), true, false, false);
		fullDeck[34] = new Card("Hearts","Six",6,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\6_of_hearts.png")), true, false, false);
		fullDeck[35] = new Card("Hearts","Seven",7,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\7_of_hearts.png")), true, false, false);
		fullDeck[36] = new Card("Hearts","Eight",8,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\8_of_hearts.png")), true, false, false);
		fullDeck[37] = new Card("Hearts","Nine",9,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\9_of_hearts.png")), true, false, false);
		fullDeck[38] = new Card("Hearts","Ten",10,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\10_of_hearts.png")), true, false, false);
		fullDeck[39] = new Card("Hearts","Jack",11,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\jack_of_hearts2.png")), true, false, false);
		fullDeck[40] = new Card("Hearts","Queen",12,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\queen_of_hearts2.png")), true, false, false);
		fullDeck[41] = new Card("Hearts","King",13,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\king_of_hearts2.png")), true, false, false);
		fullDeck[42] = new Card("Spades","Four",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\4_of_spades.png")), true, false, false);
		fullDeck[43] = new Card("Spades","Five",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\5_of_spades.png")), true, false, false);
		fullDeck[44] = new Card("Spades","Six",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\6_of_spades.png")), true, false, false);
		fullDeck[45] = new Card("Spades","Seven",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\7_of_spades.png")), true, false, false);
		fullDeck[46] = new Card("Spades","Eight",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\8_of_spades.png")), true, false, false);
		fullDeck[47] = new Card("Spades","Nine",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\9_of_spades.png")), true, false, false);
		fullDeck[48] = new Card("Spades","Ten",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\10_of_spades.png")), true, false, false);
		fullDeck[49] = new Card("Spades","Jack",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\jack_of_spades2.png")), true, false, false);
		fullDeck[50] = new Card("Spades","Queen",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\queen_of_spades2.png")), true, false, false);
		fullDeck[51] = new Card("Spades","King",14,ImageIO.read(new File ("C:\\Users\\clarkg0206\\eclipse-workspace\\CardGame\\resources\\king_of_spades2.png")), true, false, false);
		
		 /*need to make this handOfCards initialization its own method so I can call it in the player class
		  * Or I need to make it so that what this outputs is assigned to the players hand;
		  */
	}
	
	try {
		System.out.println("hello?");
	}
	catch (IOException ex) {
		
		System.out.println ("IOException error");
		
	}
}
