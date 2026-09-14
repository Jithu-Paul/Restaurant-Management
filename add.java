import javax.swing.*;
public class add {
  JFrame frame;
  JTextField userField;
  JLabel userLabel;
  public add()
  {
     frame=new JFrame("Add Item");
      JLabel title=new JLabel("Item");
      title.setBounds(100,50,200,30);
      userLabel = new JLabel("Add Item");
      userLabel.setBounds(100, 100, 100, 30);

      userField = new JTextField();
      userField.setBounds(150, 100, 150, 30);
      frame.add(userLabel);
      frame.add(userField);
      frame.add(title);
      frame.setSize(500,400);
      frame.setLayout(null);
      frame.setVisible(true);
  }  
}
