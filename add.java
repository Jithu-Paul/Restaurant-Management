import javax.swing.*;
public class add {
  JFrame frame;
  public add()
  {
     frame=new JFrame("Add Item");
      JLabel title=new JLabel("Add New Item");
       title.setBounds(100,50,200,30);
       frame.add(title);
       frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
  }  
}
