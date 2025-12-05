import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,478,105);
        elephant.setLocation(476,74);
        elephant.setLocation(519,143);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,300,341);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,291,280);
        label2.setLocation(233,256);
        label2.setLocation(318,256);
        label2.setLocation(274,260);
        label2.setLocation(442,265);
        label2.setLocation(442,265);
        label2.setLocation(301,271);
    }
}
