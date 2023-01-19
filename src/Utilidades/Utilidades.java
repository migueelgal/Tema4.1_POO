/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author miguel.galera
 */
public class Utilidades {
    public static boolean checkEmail(String email){
        
        int arroba=0;
        int punto=0;
        
        if(email.contains("@")&& email.contains(".")){
            for (int i = 0; i < 10; i++) {
                if(email.charAt(i)=='@'){
                    arroba=i;
                }
                if(email.charAt(i)=='.'){
                    punto=i;
                }
            }
            
            if(punto<arroba){
                System.out.println("Error: email incorrecto");
                return false;
            }else{
                return true;
            }

            

        }
        return false;
        
    }
    
}
