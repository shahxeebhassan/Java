package swing.Jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame1 {

    public static void main(String[] str) {
//        JFrame = a GUI window to add components to
        JFrame f = new JFrame();//create frame
        f.setSize(1080,720); //size
        f.setTitle("SIS");//set title
        ;
//        ***********Default*****************
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Program finishes after we close frame
        //BY Default it is like :
//        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //Prevent closing :
//        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//         ******************************
        f.setResizable(false);
        f.setVisible(true);//make visible
        
        
        // Adding Icon with title of Frame
        ImageIcon image = new ImageIcon("flower.png"); //created image Icon
        f.setIconImage(image.getImage());
        ///Background Color change built in
//        f.getContentPane().setBackground(Color.CYAN);
        // User definde color
        f.getContentPane().setBackground(new  Color (255,0,0));
    }
}
