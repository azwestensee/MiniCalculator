public abstract class Calculator implements Multiplier, Divider {
    protected int total;

    public Calculator(){
        total = 1;
    }

    public abstract int calculate();

    @Override
    public void divide(int y) {
        if ( y == 0 ){
            System.out.println("FAILED CANNOT DIVIDE BY ZERO");
            return;
        }

        total = total/y;
    }

    @Override
    public void multiply(int y) {
        total = total*y;
    }
}
