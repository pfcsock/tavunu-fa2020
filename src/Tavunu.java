
/**
 Develop some code
Complete the definition of the Tavunu class so it represents tavuni (that's plural for tavunu)
* according to the specifications below and the JUnit4 test file here.

A Tavunu instance should have a name of the tuvunu, the amount of pava the tavunu holds,
* and their year of birth.

A Tavunu instance should also have the following methods:

setName(name): gives the tavunu a new name. All tavunu names begin with the letters 'T' or 'D'.
* If the desired new name does not meet this criterion, the method does not change
* the name and returns false. Otherwise it changes the tavunu's name and returns true.
* 
getName(): returns the tavunu's name.
spendPava(amount): decreases the amount of pava held by the tavunu. If the amount is zero or
* less the method does not change the pava and returns false.
* Otherwise it subtracts the amount from the tavunu's pava and returns true.
* 
receivePava(amount): increases the amount of pava held by the tavunu. If the amount is zero or less
* it does not change the pava and it returns false.
* Otherwise it adds the amount to the tavunu's pava and returns true.
* 
getPava(): returns the amount of pava held by this tavunu.
Accessor and mutator for the year of their birth. Negative values are OK ---
* they correspond to BCE dates.
* 
An appropriate toString() method.
No-argument (default) and parameterized constructors.
You don't need to do anything with the project's "app" class in this part of the project.

As you are developing the code, commit your changes at least two times. */
public class Tavunu {
    
    
    private String name;
    private int birthYear;
    private int pava;
    
    public boolean setName(String newName){//set firstname, make sure it starts with T or D
        Character first = newName.charAt(0);
        Character T='T',D='D';
        
        if (first.equals(T)||first.equals(D))  {
        name = newName; // set name
        return true;
        }
        
        else 
            return false; // or if false to nothing
        
    }
            
    public String getName(){ // returne name
        return name;
    
    }
    
    public int spendPava(int amount) { // take away pava
        pava  =- amount;
                return pava;
    }
    
    public int receivePava(int amount) { // add pava
        pava =+ amount;
        return pava;
    }
    
    public int getPava() { // retune howmuch pava the tavunu has
            return pava;
    }
            
    
   
    public String toString(){ // return the full sting, name, pava, and birth year
        return "Name:" + name + " Pava:" + pava + " Birth Year:" + birthYear;
       
    }
}
