import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemLight extends Enemigos
{
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mov_rand();
        if(getX()<400)
        {
            setImage("El-1_der.png");
        }
    }
}