public class staticMethodTest {

        int x;
        public void nonstaticmethod()
        {
            x= 10;
            defaultruncheck();
        }

    private staticMethodTest()
    {
        System.out.println("load first");
    }

    public staticMethodTest testM()
    {
        return testM();
    }

    public static void defaultruncheck()
    {
        System.out.println("This method run when the class is gets loaded ");

    }

    public static void method1()
    {
        System.out.println("method 1");

    }


    public static void method2()
    {
        System.out.println("method 2");

    }


    public static void method3()
    {
        System.out.println("method 3");

    }

    public static void main(String[] args) {

        staticMethodTest.defaultruncheck();

    }
}
