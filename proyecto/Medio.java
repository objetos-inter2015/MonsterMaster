import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medio extends Botones
{
    private int op = 0;
    private int nivel = 0;
    /**
     * Act - do whatever the Pesado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Medio(int ra)
    {
        op = ra;
    }
    public void act() 
    {
        // Add your action code here.
        if(op == 1)
        {
            setImage("medioH.png");
            nivel = 3;
        }
        else if(op == 2)
        {
            setImage("medioH_d.png");
            nivel = 4;
        }
        entraM();
    }
    private void entraM()
    {
        int niv = 0;
        niv = nivel;
        if(Greenfoot.mouseClicked(this))
        {
            if(nivel == 3)
            {
                Greenfoot.setWorld(new hNivel2(op));
            }
            if(nivel == 4)
            {
                Greenfoot.setWorld(new hNivel2(op));
            }
            Greenfoot.playSound("Protoss_Probe.wav");
        }
    }  
}
