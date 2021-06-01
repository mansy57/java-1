/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidDaoImplement implements pyramidDao {
    List<pyramid> pyramids;
    public PyramidDaoImplement(){
      FileReader fr = null;
       try {
           pyramids = new ArrayList<pyramid>();
           // 1. open file for read
           fr = new FileReader("pyramids.csv");
           BufferedReader br = new BufferedReader(fr);
           
           

           String line;
           String[] parts;
           pyramid st;
           int iteration = 0;
            do {
             line = br.readLine();
             if(iteration == 0) {
                iteration++;  
                continue;
                }
             else{
                if (line != null) {
                System.out.println(line);
                parts=line.split(",");

                   //System.out.println(line);
//                   System.out.println(parts[1]);
//                   System.out.println(parts[8]);
//                   System.out.println(parts[5]);
//                   System.out.println(parts[0]);
                   
                   boolean isDouble = true;
                    try {
                        Double num = Double.parseDouble(parts[8]);
                    } catch (NumberFormatException e) {
                        isDouble = false;
                    }
                    if(isDouble == true){
                        st=new pyramid(parts[1], Double.parseDouble(parts[8]) , parts[5] , Integer.parseInt(parts[0]));
                       pyramids.add(st);
                    }else{
                        st=new pyramid(parts[1], 0.0 , parts[5] , Integer.parseInt(parts[0]));
                       pyramids.add(st);
                    }
                    //System.out.println(parts[1]+parts[8]+ parts[5] + parts[0]);
                }
             }
             
            } while (line != null);
            br.close();
            fr.close();

           
           
           
           
//           do {
//                line = br.readLine();
//                if(iteration == 0) {
//                iteration++;  
//                continue;
//                }
//                else{
//                    if (line != null) {
//                    //System.out.println(line);
//                    parts=line.split(",");
//                    
//                    for(int i=0; i>=parts.length; i++)
//                    {
//                        if(parts[i] == null)
//                            break;
//                        else
//                            continue;
//                        
//                        st=new pyramid(parts[1], Double.parseDouble(parts[8]) , parts[5] , Integer.parseInt(parts[0]));
//                        pyramids.add(st);
//                        System.out.println("emad");     
//                    }
//                    
//                    
////                    for(int i=0; i>=parts.length; i++)
////                    {
////                        if(parts[i] == null)
////                            break;
////                        else
////                            continue;
////                        
////                        st=new pyramid(parts[1], Double.parseDouble(parts[8]) , parts[5] , Integer.parseInt(parts[0]));
////                        pyramids.add(st);
////                        System.out.println("emad");     
////                    }
//                    
////                    st=new pyramid(parts[1], Double.parseDouble(parts[8]) , parts[5] , Integer.parseInt(parts[0]));
////                    pyramids.add(st);
//                    
//                }
//                }
//                
//            } while (line != null);
//            br.close();
//            fr.close();
            
            
            
            
           
           
           
           
//      Student student1 = new Student("Robert",0);
//      Student student2 = new Student("John",1);
//      students.add(student1);
//      students.add(student2);		
       } catch (FileNotFoundException ex) {
           Logger.getLogger(PyramidDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(PyramidDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
       }
   }

    @Override
    public List<pyramid> getAllPyramids() {
        return pyramids;
    }

    @Override
    public pyramid getPyramid(int num) {
        return pyramids.get(num-1);
    }

    @Override
    public void updatePyramid(pyramid pyramid) {
        pyramids.add(pyramid);
//        System.out.println("pyramid: num " + pyramid.getNum()+ ", updated in the database");
    }

    @Override
    public void deletePyramid(pyramid pyramid) {
        pyramids.remove(pyramid);
    }
//        pyramids.remove(pyramid.getNum());
//        System.out.println("pyramid: num " + pyramid.getNum()+ ", updated in the database");}

}

