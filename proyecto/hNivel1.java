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
    private int hiterInicio = 0;
    MinimizarPoder m = new MinimizarPoder();
    Invulnerable i = new Invulnerable();
    DetenerUsuario du = new DetenerUsuario();
    DetenerEnemigo de = new DetenerEnemigo();
    DañoUsuario da = new DañoUsuario();
    AgrandarVida a = new AgrandarVida();
    Poderes[] p = {m,i,du,de,da,a};
    //private Counter puntaje = new Counter("Puntos: ");
    /**
     * Constructor para el primer Nivel.
     * 
     */
    public hNivel1(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        mundo = op;
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        int ex = Greenfoot.getRandomNumber(750);
        int ye = 250;
        if(ex==0)
        {
            ex+=20;
        }
        if(mundo == 1)
        {
            addObject(new jugLight(), 400, 550);
            addObject(new enemLight(), 600, 550);
        }
        if(mundo == 2)
        {
            addObject(new dJugLight(), 400, 550);
            addObject(new hEnemLight(), 600, 550);
        }
    }
    /*public void sumaPuntos(int p)
    {
    puntaje.setValue(p);

    }*/
}
