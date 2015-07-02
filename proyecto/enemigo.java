import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo extends Enemigos
{
    public int animacion;
    private int contGolpe = 0;
    private int golpe = 0;
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemigo()
    {
        enem[0]= new GreenfootImage("enemigo_pasos der2.png");
        enem[1]= new GreenfootImage("enemigo_pasos der3.png");
        enem[2]= new GreenfootImage("enemigo_pasos der4.png");
        enem[3]= new GreenfootImage("enemigo_pasos der5.png");
        enem[4]= new GreenfootImage("enemigo_pasos izq1.png");
        enem[5]= new GreenfootImage("enemigo_pasos izq2.png");
        enem[6]= new GreenfootImage("enemigo_pasos izq3.png");
        enem[7]= new GreenfootImage("enemigo_pasos izq4.png");
    }
    public void act() 
    {
        mov_rand();
        if(getX()<400)
        {
            setImage("space_pirates2.png");
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
