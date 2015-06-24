import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public gameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        showText("Usted ha perdido, su record no será guardado", 400, 100);
        showText("Para salir apriete el siguiente boton",400,400);
        addObject(new botonSalirMenu(), 400, 490);
    }
}
