import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poderes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poderes extends Actor
{
    /**
     * Act - do whatever the Poderes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        baja();
    }

    public void baja()
    {
        setLocation(getX(),getY()+20);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}