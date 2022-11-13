/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt12;
import java.util.*;
/**
 *
 * @author sweth
 */
public class minimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer y[]={11,20,44,1,23,765,10,34,2};
        mini obj=new mini();
        obj.m(y);
    }
}
class mini
{
    <t extends Comparable <t>> void m(t[] y){
        t m;
        m=y[0];
        for(int i=1;i<y.length;i++)
         {
           if(m.compareTo(y[i])<0)
          {
             m=y[i];
          }
         }
     System.out.println("The maximum number in the array "+ m);
    }
  }
