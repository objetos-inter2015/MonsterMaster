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
    private int tipo_bala = 0;
    public bala_jug(int dir,int p)
    {
        band_dir = dir;
        tipo_bala=p;
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(tipo_bala == 1)
        {
            setImage("Balajug1.png");
        }
        if(tipo_bala == 2)
        {
            setImage("Balajug2.png");
        }
        muevete(band_dir);// Add your action code here.
        //checaColision();
    }
}
