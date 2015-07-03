import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverText extends World
{
    /**
     * Constructor for objects of class gameOverText.
     * 
     */
    public gameOverText()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        showText("Los enemigos se retiran, bien hecho", 400, 300);
        showText("Para salir apriete el siguiente boton",400,400);
        addObject(new botonSalirMenu(), 400, 490);
    }
}
