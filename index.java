import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class index extends Applet implements ActionListener
{
TextField t1 = new TextField();
TextField t2 = new TextField();
Button boton;
Label l;
public void init()
{
l = new Label("Ingresa tu fecha de nacimiento");
boton = new Button("Calcular");
add(l);
add(t1);
add(boton);
add(t2);
boton.addActionListener(this);
t1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Button b = (Button)e.getSource();
if(b == boton)
{
String s = t1.getText();
int a = Integer.parseInt(s);
int edad = 2021-a;
t2.setText("Tu edad es de: "+edad);
}
}
}
