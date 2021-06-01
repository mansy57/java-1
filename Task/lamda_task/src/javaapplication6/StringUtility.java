package javaapplication6;


import java.util.function.BiPredicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emad Osama
 */


public class StringUtility {
    
    
    
    
    
    public static String betterString(String a , String b , BiPredicate pd)
    {
        if(pd.test(a, b) == true){return a;}
        else{return b;}
    }
}
