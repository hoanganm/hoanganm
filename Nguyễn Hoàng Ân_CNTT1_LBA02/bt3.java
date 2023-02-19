/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication285;
import java.util.Scanner;

public class bt3 
{
  public static void tinhtiendien()
  {
   int sodien,tien;
   Scanner sc = new Scanner(System.in);
   System.out.println("nhap so dien : ");
   sodien = (int) sc.nextFloat();
   if ( sodien < 50)
   {
       tien = sodien*1000;
   }
   else 
   {
       tien = 50*1000+(sodien-50)*1200;
   }
   System.out.println("so tien can phai tra la " + tien);
  }
   public static void main(String[] arg)
   {
       tinhtiendien();
   }
}
