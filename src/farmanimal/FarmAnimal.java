/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmanimal;
    public class FarmAnimal {
    private String name;
    
    public String getName() {
        return name;
    }
     
    public void setName (String n){
        name = n;
    }
    
    public void makeSound() {
        System.out.println(getName() + " makes a sound ...");
    }
    
    public static void main(String[] args) {
        Cow c = new Cow();
        Horse h= new Horse();
        c.setName ("Elsie");
        h.setName("Mr. Ed");
        c.makeSound();
        h.makeSound();
        
    }
    
}