/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emad Osama
 */
public class readingFileImplementation implements citiesDAO{
    List<City> Cities;
    public readingFileImplementation(){
        FileReader fr = null;
       try {
           Cities = new ArrayList<City>();
           // 1. open file for read
           fr = new FileReader("Cities.csv");
           BufferedReader br = new BufferedReader(fr);
           String line;
           String[] parts;
           City st;
            do {
                line = br.readLine();
                if (line != null) {
//                System.out.println(line);
                parts=line.split(",");
                st=new City(Integer.parseInt(parts[0]),parts[1], Integer.parseInt(parts[2]) ,parts[3] );
                Cities.add(st);
                
//                Cities.forEach(System.out::println);
                }
             
             
            } while (line != null);
             Cities.stream().map(City::getcountryName).distinct().forEach(System.out::println);
//            Map<String,String> map11 = null;
//             Cities.stream().map(City::getcountryName).forEach(ss::map11.put(ss,"a"));
             
            br.close();
            fr.close();
	
       } catch (FileNotFoundException ex) {
           Logger.getLogger(readingFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(readingFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
       }
   }
    }

