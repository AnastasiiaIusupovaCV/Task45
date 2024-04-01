/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task45;

/**
 *
 * @author a.yusupova
 */
public class Task45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        T3 thread1= new T3("Thread1");
        T3 thread2= new T3("Thread2");
        
        thread1.start();
        thread2.start();
    }
    
}
