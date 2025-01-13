/**
 * Write a description of class Scorekeeper here.
 * 
 * @author (Koan Nayfack) 
 * @version (1)
 */
public class Scorekeeper  
{
    // instance variables - replace the example below with your own
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis( );
    private static boolean firstUpdate = true;
    

    
    public Scorekeeper()
    {
        
    }
    public static void setDeckSize(int newDeckSize) 
    {
        deckSize = newDeckSize;
    }
    
    public static void updateScore()
    {
        if (firstUpdate)
        {
            score = 27;
            firstUpdate = false;
        }
        }
    public static int getScore()
    {
        return score;
    }

    
}
