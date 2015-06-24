import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Select_character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_character extends World
{
    private int raza = 0;
    /**
     * Constructor for objects of class Select_character.
     * 
     */
    public Select_character(int c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        raza = c;
        select();
    }

    public void select()
    {
        int op=0;
        op = raza;
        addObject(new Pesado(op), 150, 350);
        addObject(new Medio(op), 400, 350);
        addObject(new Ligero(op), 650, 350);
    }
    public void eliminaActores()
    {
        List<Botones> a = getObjects(Botones.class);
        removeObjects(a);
    }
}
