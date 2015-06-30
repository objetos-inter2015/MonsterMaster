import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Greenfoot.playSound("SC2_uiBNetToast.mp3");
        addObject(new Boton_Jugar(), 400, 190);
        addObject(new Boton_Ayuda(), 400, 290);
        addObject(new Boton_Salir(), 400, 490);
        addObject(new Titulo(), 400, 90);
        //Greenfoot.playSound("WeWerentAngels.mp3");
    }
    public void eliminaActores()
    {
        List<Botones> a = getObjects(Botones.class);
        removeObjects(a);
    }
}
