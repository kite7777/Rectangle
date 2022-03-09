/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author jarek
 */
public class Rectangle {

    // Area = length * Breadth
    // Perimeter = 2 * (Length + Breadth)
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        int length = 0;
        int breadth = 0;
        int area = 0;
        int perimeter = 0;
        
        
        System.out.print("Enter the length of rectangle: ");
        length = scanner.nextInt();
        
        System.out.print("Enter the breadth of rectangle: ");
        breadth = scanner.nextInt();
        
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        
        System.out.println("The area of Rectangle is : " + area);
        System.out.println("The perimeter of rectangle is : " + perimeter);
        
        
       
                
        
    }
    
}
