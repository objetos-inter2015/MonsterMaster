import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ligero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ligero extends Botones
{
    private int op = 0;
    private int nivel = 0;
    /**
     * Act - do whatever the Pesado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ligero(int ra)
    {
        op = ra;
    }

    public void act() 
    {
        // Add your action code here.
        if(op == 1)
        {
            setImage("ligeroH.png");
            nivel = 1;
        }
        else if(op == 2)
        {
            setImage("ligeroH_d.png");
            nivel = 2;
        }
        entraL();
    }

    private void entraL()
    {
        int niv = 0;
        niv = nivel;
        if(Greenfoot.mouseClicked(this))
        {
            if(nivel == 1)
            {
                Greenfoot.setWorld(new hNivel1(op));
            }
            if(nivel == 2)
            {
                Greenfoot.setWorld(new hNivel1(op));
            }
            Greenfoot.playSound("Protoss_Probe.wav");
        }
    }       
}