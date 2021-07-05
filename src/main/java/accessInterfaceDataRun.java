public class accessInterfaceDataRun {

    public static void main(String args[])
    {
        accessInterfaceData sum = new accessInterfaceData();
        int total = sum.SendSumData(10,20);
        System.out.println("sum of two number is :"+total);
        sum.accessinterfacedefinedmethods();

        sum.testEI();

    }
}
