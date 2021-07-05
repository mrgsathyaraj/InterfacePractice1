
public interface SInterface {

    /*
    Concept is to hide the implementation of the interface and Provide only methods to outside too access
    So its an always act as public static final ,even the variables too
    To connect interface needs to assign the class to interface
    static methods cannot be overrides so we can't use in implementing class
    in terface supports static and non static method (am support) implmentation inside the interface from java 8
    interface supports the nested class
    all the Methods should be overrided in all the interfaced implemented class
    interface can be extended and nested interfaced will support.
    static block executed only when u make an call outside in the interface
    Extend interface should be implemented in the class and its able to access the methods declared in the exteded
    interface
    the purpose is to create the specific interface (able to add own methods and from extended interface and implemented class)
    default method with keyword as deafult and it can be overrided in any of the specific interface implemented projects
     */

    //static void TestStaticMethod();

   int mulofTwoNumbers(int num1,int num2);

   int SumofTwoNumbers(int num1 ,int num2);

    final int a = 10;

    default void defaultmethod()
    {
        System.out.println("hello");
    }

    static void statimethod()
    {
        System.out.println("hello");
    }


    public interface nestedinterface{

        static void nestedInterface()
        {
            System.out.println("This is an nested interface");
        }
    }

}
