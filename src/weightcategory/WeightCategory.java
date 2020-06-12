/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightcategory;

/**
 *
 * @author Trung_PC
 */
public class WeightCategory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMICategory sieuMap = new BMICategory("Sieu map", 40);
        BMICategory MapU = new BMICategory("Map U", 35);
        BMICategory map = new BMICategory("Map", 30);
        BMICategory mup = new BMICategory("Mup", 25);
        BMICategory chuan = new BMICategory("chuan", 18.5f);
        BMICategory hoiOm = new BMICategory("hoi om", 16);
        BMICategory om = new BMICategory("Om", 15);
        BMICategory QuaOM = new BMICategory("Qua om", 0);
        sieuMap.setNext(MapU)
                .setNext(map)
                .setNext(map)
                .setNext(mup)
                .setNext(chuan)
                .setNext(hoiOm)
                .setNext(om)
                .setNext(QuaOM);
        
        System.out.println(sieuMap.getCategory(15));
    }
    
}
