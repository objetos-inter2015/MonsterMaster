import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Niveles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niveles extends World
{

    /**
     * Constructor for objects of class Niveles.
     * 
     */
    public Niveles()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void eliminaActores()
    {
        List<Botones> a = getObjects(Botones.class);
        removeObjects(a);
    }
}
