class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    String name;
    void eating(){
        System.out.println("Eating");
    }

}
class cat extends Animal{
    cat(){
        System.out.println("Cat constructor");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.eating();
    }
    
}
