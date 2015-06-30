import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel3 extends Niveles
{
    private int mundo = 0;
    private int ex;
    Enemigos enems[]={null,null,null,null,null};
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public hNivel3(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        mundo = op;
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        if(mundo == 1)
        {
            addObject(new jugador(), 400, 550);
            enems[0] = new enemPesado();
            enems[1] = new enemPesado();
            enems[2] = new enemPesado();
            enems[3] = new enemPesado();
            enems[4] = new enemPesado();
            for(int i = 0; i < 5 ; i++)
            {
                ex = Greenfoot.getRandomNumber(750);
                if(ex==0)
                {
                    ex+=20;
                }
                addObject(enems[i],ex, 550);
            }
        }
        if(mundo == 2)
        {
            addObject(new dJugPe(), 400, 550);
            enems[0] = new hEnem();
            enems[1] = new hEnem();
            enems[2] = new hEnem();
            enems[3] = new hEnem();
            enems[4] = new hEnem();
            for(int i = 0; i < 5 ; i++)
            {
                ex = Greenfoot.getRandomNumber(750);
                if(ex==0)
                {
                    ex+=20;
                }
                addObject(enems[i],ex, 550);
            }
        }
    }

}
