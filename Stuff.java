public class Stuff {
    private int value;

    public Stuff(int value) {
        this.value = value;
    }

    public void printAddAmount(int amount) {
        int value = amount;
        value += 5;
        System.out.println(value);
    }

    public void printAmountMystery(int value) {
        int mystery = value + 6;
        System.out.println(mystery);
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Stuff stuff = new Stuff(10);
        stuff.printAddAmount(6);
        System.out.println(stuff.getValue());
    }
}
