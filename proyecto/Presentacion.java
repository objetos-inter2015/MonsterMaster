import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Presentacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Presentacion extends Actor
{
    private GreenfootSound s;
    /**
     * Act - do whatever the Presentacion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Presentacion(GreenfootSound m)
    {
        s = m;
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Portada p = (Portada) getWorld();
            Greenfoot.setWorld(new Menu());
            p.detenM(s);
            p.removeObject(this);
        }
    }    
}
