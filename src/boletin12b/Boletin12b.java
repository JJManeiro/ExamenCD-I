/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin12b;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author dam1
 */
public class Boletin12b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p1 = (int)(Math.random()*(50-1)+1);
        int p2 =0;
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Cuantas intentas?"));
        if (intento==0){
        JOptionPane.showMessageDialog(null,"No me seas vago ten 5 intentos");
        intento=intento+5;
        }
        else if (intento<0){
        JOptionPane.showMessageDialog(null,"supongo que dices "+(-intento)+" intentos no?");
        intento = -intento;
        }
        for (int i=0;i<intento;i++){
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta"));
            if ((p2<1)||(p2>50)){
                JOptionPane.showMessageDialog(null,"Es del 1 al 50 eso no vale."); 
                break;
            }
            else if (p2>(p1+20)||p2<(p1-20)){
            JOptionPane.showMessageDialog(null,"muy lejos");    
            }
            else if (p2>(p1+9)||p2<(p1-9)){
            JOptionPane.showMessageDialog(null,"lejos");   
            }
            else if (p2>(p1+5)||p2<(p1-5)){
            JOptionPane.showMessageDialog(null,"cerca");   
            }
            else if (p2<p1||p2>p1){
            JOptionPane.showMessageDialog(null,"muy cerca");    
            }
            else{
                JOptionPane.showMessageDialog(null,"Enhorabuena!");
                break;
            }
        }
        if (p2!=p1)
        JOptionPane.showMessageDialog(null,"Mas suerte la proxima vez.");
    }
    
}
