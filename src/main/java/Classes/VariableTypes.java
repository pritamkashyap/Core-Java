package Classes;

public class VariableTypes {
    public int memberVariable;
    public static int staticVariable = 100;

    public VariableTypes(int memberVariable){
        this.memberVariable = memberVariable;
    }

    public void dummyMethod(int a, int b) {
        int sum = a + b; // sum -> local variable
        System.out.println(sum);
    }
}
