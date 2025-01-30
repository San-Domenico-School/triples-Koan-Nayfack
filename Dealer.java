import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Dealer here.
 * 
 * @author (Koan Nayfack) 
 * @version (a version number or a date)
 */
public class Dealer extends Actor
{
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Deck deck;
    private ArrayList <Card> cardsOnBoard;
    private ArrayList <Integer> selectedCardsIndex;
    private Card []cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining;
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav");
        getWorld().addObject(deck.getTopCard(), 100, 50);
        getWorld().addObject(deck.getTopCard(), 100, 120);
        getWorld().addObject(deck.getTopCard(), 100, 190);
        getWorld().addObject(deck.getTopCard(), 100, 260);
        getWorld().addObject(deck.getTopCard(), 100, 330);
        getWorld().addObject(deck.getTopCard(), 230, 50);
        getWorld().addObject(deck.getTopCard(), 230, 120);
        getWorld().addObject(deck.getTopCard(), 230, 190);
        getWorld().addObject(deck.getTopCard(), 230, 260);
        getWorld().addObject(deck.getTopCard(), 230, 330);
        getWorld().addObject(deck.getTopCard(), 360, 50);
        getWorld().addObject(deck.getTopCard(), 360, 120);
        getWorld().addObject(deck.getTopCard(), 360, 190);
        getWorld().addObject(deck.getTopCard(), 360, 260);
        getWorld().addObject(deck.getTopCard(), 360, 330);
        
        
        
    }
    public void setUI()
    {
        Integer cardsRemaining = new Integer (numCardsInDeck-15);
        Integer score = new Integer(0);
        getWorld().getBackground().drawString(cardsRemaining.toString(),305, 475);
        getWorld().getBackground().drawString(score.toString(),308, 510);
    }
    public void endGame()
    {
        
    }
    public void  checkIfTriple()
    {
        
    }
    public void actionIfTriple()
    {
        
    }
    public void setCardsSelected(ArrayList <Card> cardList, ArrayList <Integer> numCardsSelected, Card[] selectedCards )
    {
        
    }
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck;
        triplesRemaining = numCardsInDeck / 3;
        deck = new Deck (numCardsInDeck);
    }
    
}

