import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel1 extends Niveles
{
    private int mundo = 0;
    private int ex;
    Enemigos enems[]={null,null,null,null,null};
    /**
     * Constructor para el primer Nivel.
     * 
     */
    public hNivel1(int op)
    {    
        mundo = op;
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        if(mundo == 1)
        {
            addObject(new jugLight(), 400, 550);
            for(int i = 0; i < 5 ; i++)
            {
                ex = Greenfoot.getRandomNumber(750);
                if(ex==0)
                {
                    ex+=20;
                }
                enems[i] = new enemLight();
                addObject(enems[i],ex, 550);
            }
        }
        if(mundo == 2)
        {
            addObject(new dJugLight(), 400, 550);
            for(int i = 0; i < 5 ; i++)
            {
                ex = Greenfoot.getRandomNumber(750);
                if(ex==0)
                {
                    ex+=20;
                }
                enems[i] = new hEnemLight();
                addObject(enems[i],ex, 550);
            }
        }
    }
}
