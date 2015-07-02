import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DetenerEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DetenerEnemigo extends Poderes
{
    private int contaP = 0;
    /**
     * Act - do whatever the DetenerEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        contaP++;
        if(contaP == 25)
        {
            baja();
            contaP=0;
        }
    }    
}
