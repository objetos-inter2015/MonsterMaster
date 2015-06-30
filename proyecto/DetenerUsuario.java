import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DetenerUsuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DetenerUsuario extends Poderes
{
    private int contaP = 0;
    /**
     * Act - do whatever the DetenerUsuario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        contaP++;
        if(contaP == 50)
        {
            baja();
            contaP=0;
        }
    }    
}
