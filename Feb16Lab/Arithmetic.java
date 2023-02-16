package Feb16Lab;

interface Arithmetic {
    default void add(int a, int b){
        System.out.println("sum: " + (a+b));
    }
}
