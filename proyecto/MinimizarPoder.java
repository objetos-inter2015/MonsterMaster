import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinimizarPoder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinimizarPoder extends Poderes
{
    private int contaP = 0;
    /**
     * Act - do whatever the MinimizarPoder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        contaP++;
        if(contaP == 50)
        {
            baja();
            contaP=0;
        }
    }
}