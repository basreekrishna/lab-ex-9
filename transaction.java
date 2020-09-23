/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;
import java.util.*;
class DebitTransaction extends Exception
        
{
    string msg;
    Debit Transaction(string a)
            
    {
        msg=a;
    }         
public string to string()
        
{
    return msg;
}    
}
/**
 *
 * @author sksba
 */
public class transaction {
    public static void main(string[]args){
        try
            
        {
            scanner sc=new scanner(system.in);
            double a;
            system.out.println("Enter amount:");
            a=sc.nextDouble();
            if(a>=5000)
                
            {
                throw new DebitTransaction("can't transfer");
            }
            else
            {
                system.out.println("Amount transfered");
            }
            
        }
        
        catch(DebitTransaction e)
            
        {
            system.out.println(e);
        }    
    }
}
