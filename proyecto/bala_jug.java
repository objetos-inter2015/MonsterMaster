import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_jug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_jug extends Balas
{
    private int band_dir = 0;
    public bala_jug(int dir)
    {
        band_dir = dir;
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("Balajug1.png");
        muevete(band_dir);// Add your action code here.
        //checaColision();
    }
}
