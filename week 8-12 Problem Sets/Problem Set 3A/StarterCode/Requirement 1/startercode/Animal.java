import java.util.Objects;

public abstract class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String makeSound();
    
    // override toString(), equals() and hashCode()

}