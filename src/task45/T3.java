/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task45;

import java.lang.Thread;
/**
 *
 * @author a.yusupova
 */
public class T3 extends Thread{
    
    protected String name;
    T3(String name)
    {
        this.name = name;
    }
    
    public int threadNum = 1;
    public void run(){
        
        for(threadNum = 1; threadNum<100; )
        {
            print10(10);
            System.out.println("");
        }

    }
    
    public synchronized void print10(int count){
        System.out.print(name + ": {");
        for(int i = 1; i <= count; ++i){
            System.out.print(threadNum + " ");
            threadNum++;
        }
        System.out.print("} ");
    }
}