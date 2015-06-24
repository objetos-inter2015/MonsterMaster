import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vidaJugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vidaJugador extends Actor
{
    private int golpe = 0;
    /**
     * Act - do whatever the vidaJugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public vidaJugador(int hit)
    {
        golpe = hit;
        //System.out.println("Cont Hit: " + hit);
    }

    public void act() 
    {
        // Add your action code here.
        bajavida(golpe);
    }

    private void bajavida(int golpe)
    {
        if(golpe == 0)
        {
            setImage("VidaJugEnCero.png");
            //System.out.println("Primero ");
        }
        if(golpe == 1)
        {
            setImage("VidaJug6.png");
            //System.out.println("Segundo ");
        }
        if(golpe == 2)
        {
            setImage("VidaJug5.png");
            //System.out.println("Segundo ");
        }
        if(golpe == 3)
        {
            setImage("VidaJug4.png");
            //System.out.println("Tercer ");
        }
        if(golpe == 4)
        {
            setImage("VidaJug3.png");
            //System.out.println("Cuarto ");
        }
        if(golpe == 5)
        {
            setImage("VidaJug2.png");
            //System.out.println("Quinto ");
        }
        if(golpe == 6)
        {
            setImage("VidaJug1.png");
            //System.out.println("Sexto ");
        }
        if(golpe == 7)
        {
            setImage("VidaJug.png");
            //System.out.println("Septimo ");
        }
        System.out.println("contador: " + golpe);
    }
}
