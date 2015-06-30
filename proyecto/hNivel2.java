import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel2 extends Niveles
{
    private int mundo = 0;
    private int ex;
    Enemigos enems[]={null,null,null,null,null};
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public hNivel2(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        mundo = op;
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        int ex;
        if(mundo == 1)
        {
            addObject(new jugador(), 400, 550);
            enems[0] = new enemigo();
            enems[1] = new enemLight();
            enems[2] = new enemLight();
            enems[3] = new enemLight();
            enems[4] = new enemigo();
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
            addObject(new dJug(), 400, 550);
            enems[0] = new hEnem();
            enems[1] = new hEnemLight();
            enems[2] = new hEnemLight();
            enems[3] = new hEnemLight();
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
