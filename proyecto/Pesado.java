import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesado extends Botones
{
    private int op = 0;
    private int nivel = 0;
    /**
     * Act - do whatever the Pesado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pesado(int ra)
    {
        op = ra;
    }

    public void act() 
    {
        // Add your action code here.
        if(op == 1)
        {
            setImage("pesadoH.png");
            nivel = 5;
        }
        else if(op == 2)
        {
            setImage("pesadoH_d.png");
            nivel = 6;
        }
        entraP();
    }

    private void entraP()
    {
        int niv = 0;
        niv = nivel;
        Select_character m = (Select_character) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            if(nivel == 5)
            {
                Greenfoot.setWorld(new hNivel3(op));
            }
            if(nivel == 6)
            {
                Greenfoot.setWorld(new hNivel3(op));
            }
            Greenfoot.playSound("Protoss_Probe.wav");
        }
    }
}
