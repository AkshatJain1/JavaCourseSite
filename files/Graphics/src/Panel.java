/**
 * Created by nehaj on 11/23/2016.
 */
import java.awt.*;
import javax.swing.*;


public class Panel extends JPanel
{

    public Panel()
    {
        super();
        setSize(800,600);
    }
    public void paint(Graphics g)
    {
            g.setColor(Color.RED);
            g.fillRect(200,500,30,60);
            g.setColor(Color.ORANGE);
            g.fillOval(200,200,300,300);
    }



}