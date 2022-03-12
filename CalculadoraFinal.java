import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalculadoraFinal extends JFrame implements ActionListener {

   JButton btnsuma,btnresta,btnmulti,btndiv,btnlimpiar,btnsalir;
   JTextField valor1,valor2,result;
   JLabel label1,label2,label3,etiqueta;
  
   public CalculadoraFinal() {
  
      super("Calculadora Final");
      Controles();
      setSize(450,800);
      setVisible(true);
    }
 
   public void Controles() {
 
      Container panel = getContentPane();
      panel.setLayout( new FlowLayout());
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      label1 = new JLabel("Numero 1");
      
      label1.setBounds(2,2, 80, 80);
      panel.add(label1);
      
      etiqueta = new JLabel(new ImageIcon("Calculadora.jpg"));
      etiqueta.setBounds(12,250,1000,720);
      panel.add(etiqueta);
      
      valor1 = new JTextField(30);
      
      valor1.setBounds(65, 30, 110, 30);
      panel.add(valor1);
      
      label2 = new JLabel("Numero 2");
      
      label2.setBounds(2, 35, 80, 80);
      panel.add(label2);

      valor2 = new JTextField(33);
      valor2.setBounds(65, 60, 110, 30);
      panel.add(valor2);
      
      label3 = new JLabel("Resultado");
      
      label3.setBounds(2, 75, 80, 80);
      panel.add(label3);
      
      result = new JTextField(10);
      result.setBounds(65, 100,110, 30);
      panel.add(result);
      
      btnsuma = new JButton("+");
      
      btnsuma.setBounds(200,20, 50, 40);
      panel.setLayout(null);
      
      panel.add(btnsuma);
      btnsuma.addActionListener(this);

      btnresta = new JButton("-");
      
      btnresta.setBounds(250, 20, 50, 40);
      panel.add(btnresta);
      btnresta.addActionListener(this);

      btnmulti = new JButton("x");
      
      btnmulti.setBounds(200, 60, 50, 40);
      panel.add(btnmulti);
      btnmulti.addActionListener(this);
      
      btndiv = new JButton("/");
      
      btndiv.setBo    label2.setBounds(2, 35, 80, 80);
      panel.add(label2);

      valor2 = new JTextField(33);
      valor2.setBounds(65, 60, 110, 30);
      panel.add(valor2);
      
      label3 = new JLabel("Resultado");
      
      label3.setBounds(2, 75, 80, 80);
      panel.add(label3);
      
      result = new JTextField(10);
      result.setBounds(65, 100,110, 30);
      panel.add(result);
      
      btnsuma = new JButton("+");
      
      btnsuma.setBounds(200,20, 50, 40);
      panel.setLayout1,num2,resu;
      String resultadoFinal;
      
      if (e.getSource()==btnsuma) {//suma
          if(valor1.getText().equals("") || valor2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los datos no están completos",
            "Error",JOptionPane.WARNING_MESSAGE); 
         }
         
         else { //suma operaciones
          
          num1 = Double.parseDouble(valor1.getText());
          num2 = Double.parseDouble(valor2.getText());
          resu = num1 + num2;
          resultadoFinal=String.valueOf(resu);
          result.setText(resultadoFinal);
         }          
      }
        
      if (e.getSource()==btnresta) {//resta
      
         if(valor1.getText().equals("") || valor2.getText().equals("")){
         
         JOptionPane.showMessageDialog(null, "Los datos no están completos",
         "Error",JOptionPane.ERROR_MESSAGE); 
         
         }
         
         else{//resta operaciones
         
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1-num2;
          resultadoFinal=String.valueOf(resu);
          result.setText(resultadoFinal);
          
         }          
      } 
      
      if (e.getSource()==btnmulti) {//multiplicacion
         
         if(valor1.getText().equals("") || valor2.getText().equals("")){
         
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
          
         }
         
         else{//Multiplicacion Operaciones
         
          num1 = Double.parseDouble(valor1.getText());
          num2 = Double.parseDouble(valor2.getText());
          resu = num1*num2;
          resultadoFinal = String.valueOf(resu);
          result.setText(resultadoFinal);
          
          
         }          
      }
      
      
      if (e.getSource() == btndiv) {//division
         if(valor1.getText().equals("") || valor2.getText().equals("")) {
          
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE);
          
         }
         
      else 
           
         if ( valor2.getText().equals("0")) {

             JOptionPane.showMessageDialog(null, "La division entre 0 no es posible",
             "Error",JOptionPane.ERROR_MESSAGE);
             valor2.setText(null);

          }
 
          else {
            num1 = Double.parseDouble(valor1.getText());
            num2 = Double.parseDouble(valor2.getText());
            resu = num1/num2;
            resultadoFinal =String.format("%.3f",resu);
            result.setText(resultadoFinal);
         }
      }
          
      if (e.getSource()==btnlimpiar) {
      
         valor1.setText("");
         valor2.setText("");
         result.setText("");
            
      } 
      
      if(e.getSource()==btnsalir) {
         System.exit(0);   
      }
   }
}