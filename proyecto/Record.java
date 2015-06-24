import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends World
{

    /**
     * Constructor for objects of class Record.
     * 
     */
    public Record()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        ScoreBoard bp=new ScoreBoard(300,350);
        addObject(bp,400,300);
        addObject(new botonSalirMenu(), 400,550);
    }
}
