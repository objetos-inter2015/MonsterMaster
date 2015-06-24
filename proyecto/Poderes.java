import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poderes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poderes extends Actor
{
    private int cont = 0;
    private int x = 0;
    private int y = 0;
    /**
     * Act - do whatever the Poderes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }
    public void pintaPoderes()
    {
        int poder = Greenfoot.getRandomNumber(6);
        if(poder == 0)
        {
            getWorld().addObject(new MinimizarPoder(),x,y);
        }
        if(poder == 1)
        {
            getWorld().addObject(new Invulnerable(),x,y);
        }
        if(poder == 2)
        {
            getWorld().addObject(new DetenerUsuario(),x,y);
        }
        if(poder == 3)
        {
            getWorld().addObject(new DetenerEnemigo(),x,y);
        }
        if(poder == 4)
        {
            getWorld().addObject(new DañoUsuario(),x,y);
        }
        if(poder == 5)
        {
            getWorld().addObject(new AgrandarVida(),x,y);
        }
    }
    public void baja()
    {
        setLocation(getX(),y+20);
    }
}
