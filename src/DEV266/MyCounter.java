package DEV266;

public class MyCounter {
    private int counter;

    public MyCounter() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incCounter() {
        this.counter++;
    }
}
