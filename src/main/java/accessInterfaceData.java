public class accessInterfaceData {

    SInterface sm = new Sum();


    public int SendSumData(int num1 , int num2)
    {
        int total = sm.SumofTwoNumbers(num1,num2);

        return total;


    }

    public void accessinterfacedefinedmethods()
    {
        SInterface.statimethod();
    }

    public void test()
    {
        Mul mm= new Mul();
        mm.defaultmethod();
    }

    extendinterface EI = new Mul();

    public void testEI()
    {
        EI.mullogic();
        EI.defaultmethod();

    }





}
