import javax.swing.JOptionpane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.eventActionEvent;

public class TelaGrafica extends JFrame implements ActionListener{
   private JTextField txtTexto, txtMostrar, txtSair, txtLimpar;
   
   private JLabel lblMostrar, lblSair, lblLimpar, lblTexto;
   
   private JButton btnMostrar, btnLimpar, btnSair;
   
   public void actionPerformed (ActionEvent e){
      if(e.getSource() == btnLimpar){
         JOptionPane.showMessageDialog(null, "Limpar");
      }
      else if(e.getSource() == btnMostrar){
         JOptionPane.showMessageDialog(null, "Mostrar");
      }
      else if(e.getSource() == btnSair)
      }
      }
      public TelaGrafica(){
         JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
         JPanel painelEntrada = new JPanel(new FloutLayout());
         txtTexto = new JTextField(10);
         
         lblTexto = new JLabel("Texto: ");
         
         painelDadosEntrada.add(lblTexto);
         painelDadosEntrada.add(txxtTexto);
         painelEntrada.add(painelDadosEntrada);
         
         JPanel painelButoes = new JPanel(new FloutLayout());
         btnMostrar = new JButton("Mostrar");
         btnLimpar = new JButton("Limpar");
         btnSair = new JButton("Sair");
         painelBotoes.add(btnMostrar);
         painelButoes.add(btnLimpar);
         painelButoes.add(btnSair);
         
         Container caixa = getContentPane();
         caixa.setLayout(new BorderLayout());
         caixa.add(painelEntrada, BorderLayout.WEST);
         caixa.add(painelBotoes, BorderLayout.EAST);
         
         btnMostrar.addActionListener(this);
         btnLimpar.addActionListener(this);
         btnSair.addActionListener(this);
         
         setSize(500, 120);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);
         }
         
         public void actionPerformed(ActionEvent e){
            if(e.getSource == btnMostrar){
               Texto tex = new Texto();
               txtTexto.setText("Our duty as Soldiers is to Protect Humanity Whatever the Cost");
               JOptionpane.showMessageDialog(null, tex, INFORMATION_MESSAGE);
            }
            else if(e.getSource == btnLimpar){
               txtTexto.setText("");
            }
            else{
            System.exit(0);
            }
         }
         
      }
      public class Teste{
         public static void main (String [] args){
            new TelaGrafica();
         }
      }
