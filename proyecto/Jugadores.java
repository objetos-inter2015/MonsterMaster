import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta es la clase principal de los jugadores, incluye los movimientos y validaciones sobre otros
 * objetos que Interactuan en los mundos
 * @author (Edgar Daniel Rivera Rangel / Nora María Pedraza Cisneros) 
 * @version (a version number or a date)
 */
public class Jugadores extends Actor
{
    public GreenfootImage[] jug = new GreenfootImage[8];
    private int salto = 10;
    private int dir = 1;
    private int poder = 2;
    private int disp = 0;
    private int puntos = 0;
    private int mundo = 0;
    private int jump = -20;
    private int verticalSpeed = 5;
    private int mili = 0;
    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;
    private int mp;
    private int inv;
    private int su;
    private int du;
    private int de;
    private int av;
    private int i = 0 ;
    private String cad;
    /**
     * Act - do whatever the jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String cad;
        int x = getX();
        int y = getY();
        int band_dir=1;
        int band_mov = 1;
        int it = 0;
        int band = Greenfoot.getRandomNumber(4000);
        Actor bala = getOneIntersectingObject(bala_enem.class);
        Enemigos e = new Enemigos();
        getWorld().addObject(new vidaJugador(disp), 200 , 100 );
        checkFall();
        mili++;
        if(mili == 50)
        {
            if(inv != 0)
            {
                cont1++;
                if(cont1 == 5)
                {
                    inv=0;
                    cont1=0;
                }
            }
            if(su != 0)
            {
                cont2++;
                if(cont2 == 5)
                {
                    su=0;
                    cont2=0;
                }
            }
            if(mp != 0)
            {
                cont3++;
                if(cont3 == 5)
                {
                    mp=0;
                    cont3=0;
                    poder = 2;
                }
            }
            mili = 0;
        }
        if(su == 0)
        {
            if (Greenfoot.isKeyDown("Right"))
            {
                x+=20;
                if(getX()==x)
                {
                    setLocation(getX()+4,getY());
                    setImage(jug[i]);
                }
                else
                {
                    setLocation(getX()+4,getY());
                    setImage(jug[i]);
                    i++;
                    if(i>=4)
                    {
                        i=0;
                    }
                }
                band_dir = 1;
            }
            if (Greenfoot.isKeyDown("Left"))
            {
                x-=20;
                if(getX()==x)
                {
                    setLocation(getX()-4,getY());
                    setImage(jug[i+4]);
                }
                else
                {
                    setLocation(getX()-4,getY());
                    setImage(jug[i+4]);
                    i++;
                    if(i==4)
                    {
                        i=0;
                    }
                }
                band_dir = 2;
            }
            if (Greenfoot.isKeyDown("Space"))
            {
                if(onGround())
                {
                    verticalSpeed = jump; 
                    fall();                
                }
            }
            dir = band_dir;
            if(Greenfoot.isKeyDown("F"))
            {
                getWorld().addObject(new bala_jug(band_dir,poder),x,y);   
            }
        }
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new Menu());
        }
        if(isTouching(MinimizarPoder.class))
        {
            e.minP();
            poder = 1;
            removeTouching(MinimizarPoder.class);
        }
        if(isTouching(Invulnerable.class))
        {
            inv = 1;
            removeTouching(Invulnerable.class);
        }
        if(isTouching(DetenerUsuario.class))
        {
            su= 1;
            removeTouching(DetenerUsuario.class);
        }
        if(isTouching(DetenerEnemigo.class))
        {
            e.detenEnem();
            removeTouching(DetenerEnemigo.class);
        }
        if(isTouching(DañoUsuario.class))
        {
            disp++;
            if(disp == 7)
            {
                Greenfoot.setWorld(new gameOver());
            }
            removeTouching(DañoUsuario.class);
        }
        if(isTouching(AgrandarVida.class))
        {
            disp=disp-1;
            removeTouching(AgrandarVida.class);
        }
        if(isTouching(bala_enem.class))
        {
            if(bala != null)
            {
                if(inv == 0)
                {
                    disp++;
                }
                if(disp == 7)
                {
                    Greenfoot.setWorld(new gameOver());
                }
            }
            removeTouching(bala_enem.class);
        }
    }

    /*public void mover()
    {
        
    }*/

    private void fall()
    {
        setLocation(getX(),getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 2;
    }

    private boolean onGround()
    {
        if(getY()>=550)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void checkFall()
    {
        if(onGround())
            verticalSpeed = 0;
        else
            fall();
    }
    
}	