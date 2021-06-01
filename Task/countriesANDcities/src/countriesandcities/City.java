/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

/**
 *
 * @author Emad Osama
 */
public class City {
    private int num;
    private String cityname;
    private int population;
    private String countryName;
    
    
    public City(int num,String cityname,int population,String countryName){
        this.num = num;
        this.cityname = cityname;
        this.population = population;
        this.countryName = countryName;
    }
    
    public int getNum() {
       return num;
    }

    public void setNum(int num) {
       this.num = num;
    }
    
    public String getcityname() {
       return cityname;
    }

    public void setcityname(String cityname) {
       this.cityname = cityname;
    }
    public int getpopulation() {
       return population;
    }

    public void setpopulation(int population) {
       this.population = population;
    }
    public String getcountryName() {
       return countryName;
    }

    public void setcountryName(String countryName) {
       this.countryName = countryName;
    }
    
    
}


