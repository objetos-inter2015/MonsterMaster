import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Texto_Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texto_Ayuda extends Actor
{
    /**
     * Act - do whatever the Texto_Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Ayuda m = (Ayuda) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            m.removeObject(this);
        }
    }    
}
