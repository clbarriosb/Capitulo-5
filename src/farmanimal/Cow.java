/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmanimal;

/**
 *
 * @author Carmen_Lucia3
 */
public class Cow extends FarmAnimal {
    @Override
    public void makeSound() {
        System.out.println(getName() + " goes Moooooo ...");
    }
}