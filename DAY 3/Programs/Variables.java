public class Variables {
    
    // Class variable or static variable
    static int staticVariable = 20;

    // Instance variable
    int instanceVariable = 30;

    public void printLocalVariable(){
        // Local Variable
        int localVariableInMethod = 40;
        System.out.println("Value of Local Variable in a Method: "+localVariableInMethod);
    } 

    public static void main(String[] args) {
        // Local variable
        int localVariable = 10;
        System.out.println("Value of localVariable: " + localVariable);

        // Accessing static variable
        System.out.println("Value of staticVariable: " + staticVariable);

        // Creating object of class
        Variables obj = new Variables();
        // Accessing instance variable
        System.out.println("Value of instanceVariable: " + obj.instanceVariable);

        // Printing a Local variable in a method
        obj.printLocalVariable();
    }
}