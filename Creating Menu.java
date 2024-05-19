import  javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent; 
import  java.awt.event.ActionListener;

public  class  MenuExample  extends  JFrame  {

  public MenuExample() { 
      setTitle("Menu  Example"); 
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setLocationRelativeTo(null);

      //  Create  a  menu  bar
      JMenuBar  menuBar  =  new  JMenuBar();
  
      //  Create  the File menu
      JMenu  fileMenu  =  new  JMenu("File");
      JMenuItem exitMenuItem = new JMenuItem("Exit"); 
      exitMenuItem.addActionListener(new  ActionListener()  {
         public  void  actionPerformed(ActionEvent  e)  { 
           System.exit(0);
    }
    });
    fileMenu.add(exitMenuItem); 
    menuBar.add(fileMenu);

    //  Create  the  Edit menu
    JMenu  editMenu  = new  JMenu("Edit");
    JMenuItem cutMenuItem = new JMenuItem("Cut"); 
    JMenuItem  copyMenuItem  =  new  JMenuItem("Copy"); 
    JMenuItem  pasteMenuItem  =  new  JMenuItem("Paste");  
    JMenuItem deleteMenuItem = new JMenuItem("Delete"); 
    JMenuItem selectAllMenuItem = new JMenuItem("Select All"); 
    JMenuItem  unselectAllMenuItem  =  new  JMenuItem("Unselect  All");

    //  ActionListener  for  menu  items
    ActionListener  menuActionListener  =  new  ActionListener()  { 
      public void actionPerformed(ActionEvent e) {
        String  command  =  e.getActionCommand(); 
        switch (command) {
          case  "Cut":
            // Perform cut operation 
            System.out.println("Cut  operation"); 
            break;

          case  "Copy":
            // Perform copy operation 
            System.out.println("Copy  operation"); 
            break;

          case  "Paste":
            // Perform paste operation 
            System.out.println("Paste  operation"); 
            break;

          case  "Delete":
            // Perform delete operation 
            System.out.println("Delete  operation"); 
            break;
          
          case  "Select  All":
            // Perform select all operation 
            System.out.println("Select  all  operation"); 
            break;
          
          case  "Unselect  All":
            // Perform unselect all operation 
            System.out.println("Unselect  all  operation"); 
            break;
          } 
        }
      };

      // Add ActionListener to menu items 
      cutMenuItem.addActionListener(menuActionListener); 
      copyMenuItem.addActionListener(menuActionListener); 
      pasteMenuItem.addActionListener(menuActionListener); 
      deleteMenuItem.addActionListener(menuActionListener); 
      selectAllMenuItem.addActionListener(menuActionListener); 
      unselectAllMenuItem.addActionListener(menuActionListener);

      // Add menu items to Edit menu 
      editMenu.add(cutMenuItem); 
      editMenu.add(copyMenuItem); 
      editMenu.add(pasteMenuItem); 
      editMenu.add(deleteMenuItem); 
      editMenu.add(selectAllMenuItem); 
      editMenu.add(unselectAllMenuItem); 
      menuBar.add(editMenu);

      //  Set  the  menu  bar  to  the  frame 
      setJMenuBar(menuBar);
 }

 public  static  void  main(String[]  args)  { 
  SwingUtilities.invokeLater(() -> {
    MenuExample  example  =  new  MenuExample(); 
      example.setVisible(true);
});
} 
