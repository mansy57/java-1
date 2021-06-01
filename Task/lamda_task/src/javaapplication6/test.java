/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
/**
 *
 * @author Emad Osama
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<String> list=Arrays.asList();
        BiPredicate<String,String> pb = new BiPredicate<String, String>() {
            @Override
            public boolean test(String t, String u) {
                return t.equals(u);   
            }
        };
        BiPredicate<String,String> pb1 = (String t, String u) -> t.length()>u.length();
        
        String t = "string 1";
        String u = "string 2";
        System.out.println(StringUtility.betterString(t, u,pb1));
        System.out.println(StringUtility.betterString(t, u,((c,d) -> true)));    
    

//******************************************************************************************************//
        myvalue<Integer> m = new myvalue<Integer>() {
            @Override
            public boolean test1(Integer x, Integer y) {
                return x>y;
            }
        };
      //the same but with lamda expression  
        myvalue<Integer> firstLarger = (aa,bb) -> aa>bb;
        myvalue<Double> SecondLarger = (aa,bb) -> aa<bb;
        myvalue<Double> TwoEqual = (aa,bb) -> aa==bb;
    
        System.out.println(firstLarger.test1(10, 20));
        System.out.println(SecondLarger.test1(10.2, 20.55));
        System.out.println(TwoEqual.test1(10.45, 20.11));
    }
    
}
