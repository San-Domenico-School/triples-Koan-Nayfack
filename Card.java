import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Card extends Actor
{
private boolean isSelected;
private GreenfootImage image, selectedCardImage, cardImage;
private int numberOfShapes, shading;
private Shape shape;
private Color color;

enum Color
{
    RED, GREEN, BLUE, NO_COLOR
}
enum Shape
{
    CIRCLE, SQUARE, TRIANGLE, NO_SHAPE
}
public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage)

{
    this.shape = shape;
    this.color = color;
    this.numberOfShapes = numberOfShapes;
    this.shading =shading;
    this.cardImage = cardImage;
    this.selectedCardImage = selectedCardImage;
    setImage(cardImage);
}
public int getNumberOfShapes()
{
    return numberOfShapes;
}
public Shape getShape()
{
    return shape;
}
public Color getColor()
{
    return color;
}
public int getShading()
{
    return shading;
}
public GreenfootImage getCardImage()
{
    return cardImage;
}
public GreenfootImage getSelectedCardImage()
{
    return selectedCardImage;
}
public boolean getIsSelected()
{
    return isSelected;
}
public void setIsSelected(boolean isSelected)
{
    this.isSelected = isSelected;
}



}

