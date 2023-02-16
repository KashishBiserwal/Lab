package Feb16Lab;
// Class A serves as a base class for the derived class B, which in turn serves
// as a base class for the derived class C.
// The above statement represents multilevel inheritance.

class Animal{
    Animal(){
        System.out.println("Walks");
    }
}
class Wild extends Animal{
    Wild(){
        System.out.println("Lives in the wild");
    }
}
class Lion extends Wild{
    Lion(){
        System.out.println("Roars");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Lion l = new Lion();
    }
}
