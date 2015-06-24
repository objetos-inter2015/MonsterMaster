import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_enem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_enem extends Balas
{
    private int band_dir = 0;
    public bala_enem(int d)
    {
        if(d!=0)
        {
            band_dir = d;
        }
        else
        {
            band_dir = 2;
        }
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        muevete(band_dir);// Add your action code here.
        //checaColision();
    }
}