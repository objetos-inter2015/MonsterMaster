import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel3 extends Niveles
{
    private int mundo = 0;
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public hNivel3(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        mundo = op;
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        if(mundo == 1)
        {
            addObject(new jugador(), 400, 550);
            addObject(new enemPesado(), 600, 550);
        }
        if(mundo == 2)
        {
            addObject(new dJugPe(), 400, 550);
            addObject(new hEnem(), 600, 550);
        }
    }

}
