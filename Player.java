import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Player extends Actor
{
    public void act() 
    {
        
        selectCards();
        boolean threeCardsHaveBeenSelected = setCardsSelect();
        if (threeCardsHaveBeenSelected) 
        {
            dealer.setCardsSelected(cardsOnBoard, selectedCardsIndex, cardsSelected);
            dealer.checkIfTriple(cardsSelected);
            resetCardsSelected();
        }
    }
    
    
    
    private Dealer dealer;
    private Card[] cardsSelected;
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    
    public Player(Dealer dealer) 
    {
        this.dealer = dealer;
        this.cardsSelected = new Card[3]; 
        this.cardsOnBoard = new ArrayList<>();
        this.selectedCardsIndex = new ArrayList<>();
    }
    
    public void addedToWorld(World world) 
    {
        cardsOnBoard = new ArrayList<Card>(getWorld().getObjects(Card.class));
    }

    private void selectCards() 
    {
        cardsOnBoard = new ArrayList<>(getWorld().getObjects(Card.class));
        for (Card card : cardsOnBoard) 
        {
        
                if (Greenfoot.mouseClicked(card)) 
            {
                if (card.getIsSelected()) 
                {
                    card.setIsSelected(false);  
                    card.setImage(card.getCardImage());  
                    selectedCardsIndex.remove(card);  
                } 
                else 
                {
                    card.setIsSelected(true);  
                    card.setImage(card.getSelectedCardImage());  
                    selectedCardsIndex.add(cardsOnBoard.indexOf(card));  
                }
            }
        }
    }

    private void resetCardsSelected() 
    {
        for (Card card : cardsOnBoard) 
        {
            if (card.getIsSelected()) 
            {
                card.setImage(card.getCardImage());  
                card.setIsSelected(false);  
            }
        }
        selectedCardsIndex.clear();
    }

    private boolean setCardsSelect() 
    {
        if (selectedCardsIndex.size() == 3) 
        {
            for (int i = 0; i < 3; i++) 
            {
                cardsSelected[i] = cardsOnBoard.get(selectedCardsIndex.get(i));  
            }
            return true;  
        }
        return false;  
    }
}