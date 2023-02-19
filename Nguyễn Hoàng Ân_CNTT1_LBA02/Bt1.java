/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication285;
import java.util.Scanner;


public class Bt1
{

    public static void ptb1()
    {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a==0)
        {
            if (b==0)
            {
                System.out.println("phuong trinh vo so nghiem");
            }
            else 
            {
               System.out.println(" phuong trinh vo nghiem ");
            }
        }
        else
        {
            float x = (float) -b/a;
            System.out.println("phuoeng trinh co nghiem la: " + x);
        }
        
    }
    
    public static void main(String[] arg)
   {
       ptb1();
   }
}