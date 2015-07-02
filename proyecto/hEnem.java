import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hEnem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hEnem extends Enemigos
{
    private int contGolpe = 0;
    private int golpe = 0;
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hEnem()
    {
        enem[0]= new GreenfootImage("Samus_MovDer3.png");
        enem[1]= new GreenfootImage("Samus_MovDer2.png");
        enem[2]= new GreenfootImage("Samus_MovDer1.png");
        enem[3]= new GreenfootImage("Samus_Aran2.png");
        enem[4]= new GreenfootImage("Samus_MovIzq3.png");
        enem[5]= new GreenfootImage("Samus_MovIzq2.png");
        enem[6]= new GreenfootImage("Samus_MovIzq1.png");
        enem[7]= new GreenfootImage("Samus_Aran1.png");
    }
    public void act() 
    {
        mov_rand();
        if(getX()<400)
        {
            setImage("Samus_Aran1.png");
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