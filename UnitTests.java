public class UnitTests {
    public static void main (String[] args){
        MiniCalculator miniCalculator = new MiniCalculator();

        multiplyTest();

        divideTest();

        calculateTest();


    }

    public static void multiplyTest(){
        MiniCalculator miniCalculator = new MiniCalculator();

        miniCalculator.multiply(0);

        if (miniCalculator.total != 0){
            System.out.println("FAILED MULTIPLY");

        }else{
            System.out.println("SUCCESS MULTIPLY");
        }

    }

    public static void divideTest(){
        MiniCalculator miniCalculator = new MiniCalculator();

        miniCalculator.divide(2);

        if (miniCalculator.total != 0){
            System.out.println("FAILED DIVIDE");
        }else{
            System.out.println("SUCCESS DIVIDE");
        }

    }

    public static void calculateTest(){
        MiniCalculator miniCalculator = new MiniCalculator();

        miniCalculator.multiply(8);

        miniCalculator.multiply(2);

        miniCalculator.divide(4);

        if ( miniCalculator.calculate() != 4 ){
            System.out.println("FAILED CALCULATE");
        }else{
            System.out.println("SUCCESS CALCULATE");
        }

    }
}
