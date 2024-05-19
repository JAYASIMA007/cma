import  javax.swing.*; 
import java.awt.*;
import  java.awt.image.BufferedImage;

public  class  DrawingExample  extends  JFrame  { 
   private final BufferedImage image;

   public DrawingExample() { 
      setTitle("Drawing  Example"); 
      setSize(400, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setLocationRelativeTo(null);

      //  Create  a new image
      image  =  new  BufferedImage(2000,  2000,  BufferedImage.TYPE_INT_ARGB);
      //  Get  the  Graphics2D  object  to  draw  on  the  image 
      Graphics2D g2d = image.createGraphics();

      // Set the background color 
      g2d.setColor(Color.WHITE);
      g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
      //  Set  the  drawing  color  and  draw  a  rectangle 
      g2d.setColor(Color.RED);
      g2d.drawRect(50, 50, 500, 600);

      //  Set  the  drawing  color  and  draw  a  circle 
      g2d.setColor(Color.BLUE); 
      g2d.drawOval(75, 75, 400, 400); 
      
      //  Dispose  of  the  Graphics2D  object 
      g2d.dispose();
      }

      @Override
      public  void  paint(Graphics  g)  { 
      super.paint(g);
      Graphics2D  g2d  =  (Graphics2D)  g;
      // Draw the image on the window 
      g2d.drawImage(image,  50,  50,  null);
    }

public  static  void  main(String[]  args)  { 
   SwingUtilities.invokeLater(() -> {
     DrawingExample  example  =  new  DrawingExample(); 
     example.setVisible(true);
   });
 }
} 
