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
public class T4 extends Thread{
    
    protected String name;
    T4(String name)
    {
        this.name = name;
    }
    
    public int threadNum = 1;
    public void run(){
        
        for(threadNum = 1; threadNum<100; )
        {
            threadNum = print10(10,threadNum,name);
            System.out.println("");
        }

    }
    
    public static synchronized int print10(int count, int val, String name){
        System.out.print(name + ": {");
        for(int i = 1; i <= count; ++i){
            System.out.print(val + " ");
            val++;
        }
        System.out.print("} ");
        return val;
    }
}