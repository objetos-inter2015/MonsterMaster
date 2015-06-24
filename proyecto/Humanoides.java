import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Humanos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Humanoides extends Botones
{
    private int op = 0;
    /**
     * Act - do whatever the Humanos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Select_class m = (Select_class) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            m.eliminaActores();
            op = 1;
            Greenfoot.setWorld(new Select_character(op));
            Greenfoot.playSound("Protoss_Probe.wav");
        }
    }    
}
