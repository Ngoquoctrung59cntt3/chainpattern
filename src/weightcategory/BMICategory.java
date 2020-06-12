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
public class BMICategory
{ 
    String category;
    float from;
    BMICategory next;

    public BMICategory(String category, float from) {
        this.category = category;
        this.from = from;
    }
    
    public BMICategory setNext(BMICategory next)
    {
        this.next = next;
        return next;
    }
    

    
    public String getCategory (float bmi) 
    {
        if(bmi>=from)
        {
            return this.category;
        }
        return next.getCategory(bmi);
    }
    
}
