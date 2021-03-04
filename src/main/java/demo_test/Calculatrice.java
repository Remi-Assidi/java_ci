package demo_test;

public class Calculatrice {

    public int add(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }
    
    public int mul(int a, int b) {
        return a * b;
    }
    
    public int div(int a, int b) {
        return a / b;
    }
    
    public boolean isPair(int a) {
        return ((a % 2) == 0);
    };
}
