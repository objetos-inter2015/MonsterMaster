import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton_Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton_Ayuda extends Botones
{
    /**
     * Act - do whatever the Boton_Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Menu m = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            m.eliminaActores();
            Greenfoot.setWorld(new Ayuda());
        }
    }
}
