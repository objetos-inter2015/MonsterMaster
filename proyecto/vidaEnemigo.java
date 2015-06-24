import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vidaEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vidaEnemigo extends Actor
{
    int golpe = 0;
    /**
     * Act - do whatever the vidaJugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public vidaEnemigo(int hit)
    {
        golpe = hit;
    }
    public void act() 
    {
        // Add your action code here.
        bajavidaEn();
    }
    private void bajavidaEn()
    {
        int h = 0;
        h = golpe;
        if(h == 0)
        {
            setImage("VidaEnemEnCero.png");
        }
        if(h == 1)
        {
            setImage("VidaEnem6.png");
        }
        if(h == 2)
        {
            setImage("VidaEnem5.png");
        }
        if(h == 3)
        {
            setImage("VidaEnem4.png");
        }
        if(h == 4)
        {
            setImage("VidaEnem3.png");
        }
        if(h == 5)
        {
            setImage("VidaEnem2.png");
        }
        if(h == 6)
        {
            setImage("VidaEnem1.png");
        }
        if(h == 7)
        {
            setImage("VidaEnem.png");
        }
    }
}
