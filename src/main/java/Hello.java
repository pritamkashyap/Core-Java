import Classes.VariableTypes;

public class Hello {

    public static void main(String[] a) {
        System.out.println("Hello world!!");

        // Down casting/ Explicit Conversion

        int intVariable = 129;
        byte byteVariable = (byte) intVariable;
        System.out.println("Downcast value is : " + byteVariable);

        VariableTypes variableTypes1 = new VariableTypes(10);
        VariableTypes variableTypes2 = new VariableTypes(20);
        System.out.println(variableTypes1.memberVariable);
        System.out.println(variableTypes2.memberVariable);
        System.out.println(VariableTypes.staticVariable);


    }
}

