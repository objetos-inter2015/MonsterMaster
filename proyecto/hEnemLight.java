import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hEnemLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hEnemLight extends Enemigos
{
    private int contGolpe = 0;
    private int golpe = 0;
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hEnemLight()
    {
        enem[0]= new GreenfootImage("jugLightcorreDer1.png");
        enem[1]= new GreenfootImage("jugLightcorreDer2.png");
        enem[2]= new GreenfootImage("jugLightcorreDer1.png");
        enem[3]= new GreenfootImage("MC-1_der.png");
        enem[4]= new GreenfootImage("jugLightcorreIzq1.png");
        enem[5]= new GreenfootImage("jugLightcorreIzq2.png");
        enem[6]= new GreenfootImage("jugLightcorreIzq1.png");
        enem[7]= new GreenfootImage("MC-1_izq.png");
    }
    public void act() 
    {
        mov_rand();
        if(getX()<400)
        {
            setImage("MC-1_der.png");
        }
        if(isTouching(bala_jug.class))
        {
            removeTouching(bala_jug.class);
            contGolpe++;
            if(contGolpe == 10)
            {
                golpe++;
                if(golpe == 7)
                {
                    contEnem++;
                    getWorld().removeObject(this);
                }
                contGolpe = 0;
            }
            
        }
    }
}