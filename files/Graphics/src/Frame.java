import javax.swing.*;
import java.awt.*;

/**
 * Created by respe on 7/9/2017.
 */
public class Frame extends JFrame {

    public Frame(String title)
    {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        pack();

        Panel p = new Panel();

        Insets insets = getInsets();

        int width=p.getWidth()+insets.left+insets.right;
        int height=p.getHeight()+insets.top+insets.bottom;

        setPreferredSize(new Dimension(width,height));

        setLayout(null);

        add(p);

        pack();

        setVisible(true);

    }
}
