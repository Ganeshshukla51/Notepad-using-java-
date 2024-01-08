import java.awt.*;
import java.awt.event.*;
import java.io.*;
 class MenuA implements ActionListener
{
 Frame f;
 TextArea ta;
  Font font;

MenuA()
{
 f=new Frame("Menu & SubMenu");
 ta=new TextArea();
 font= new Font("Copper",Font.ITALIC,35);
 ta.setFont(font);
 
MenuBar mb=new MenuBar();
Menu m1=new Menu("File");
MenuItem i11=new MenuItem("Open");
MenuItem i12=new MenuItem("Save");
MenuItem i13=new MenuItem("Exit");
m1.add(i11);
m1.add(i12);
m1.add(i13);

Menu m2=new Menu("Edit");
MenuItem i21=new MenuItem("Cut");
MenuItem i22=new MenuItem("Copy");
MenuItem i23=new MenuItem("Paste");
m2.add(i21);
m2.add(i22);
m2.add(i23);

Menu m3=new Menu("Help");

mb.add(m1);
mb.add(m2);
mb.add(m3);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);

 

 f.add(ta);
 f.setMenuBar(mb);
 f.setSize(500,500);
 f.setVisible(true);
}
 void wf()
{
try{
String str=ta.getText();
FileWriter fw=new FileWriter("t.txt");
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
fw.close();
}
catch(Exception e)
{
 e.printStackTrace();
}
}

public void actionPerformed(ActionEvent ae)
{
 String cmd=ae.getActionCommand();

 if(cmd.equals("Exit"))
 f.dispose();
 
if(cmd.equals("Save"))
 wf();
}

public static void main(String s[])
{
 MenuA obj=new MenuA();
}

}












