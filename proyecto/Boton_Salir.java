import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton_Salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton_Salir extends Botones
{
    /**
     * Act - do whatever the Boton_Salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        salida();// Add your action code here.
    }
    private void salida()
    {
        Menu m = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            m.eliminaActores();
            Greenfoot.playSound("SC2_uiBNetToast.mp3");
            Greenfoot.setWorld(new Portada());
            Greenfoot.stop();
        }
    }
}
