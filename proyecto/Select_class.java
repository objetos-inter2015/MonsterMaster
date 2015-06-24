import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Select_class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_class extends World
{

    /**
     * Constructor for objects of class Select_class.
     * 
     */
    public Select_class()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Humanoides(), 200, 350);
        addObject(new Demonios(), 600, 350);
        addObject(new Texto_select1(), 400, 100);
    }
    public void eliminaActores()
    {
        List<Botones> a = getObjects(Botones.class);
        removeObjects(a);
    }
}
