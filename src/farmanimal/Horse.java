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
public class Horse extends FarmAnimal {
    @Override
    public void setName (String n) {
        super.setName(n + " [a Horse]");
    }

}