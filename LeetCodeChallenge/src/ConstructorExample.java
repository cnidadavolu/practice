public class ConstructorExample {
    private String name;
    private int var;

    ConstructorExample() {
        this("Constructor Begins");
    }

    ConstructorExample(String s) {
        this(s, 6);
    }

    ConstructorExample(String s, int num) {
        this.name = s;
        this.var = num;
    }

    public int getValue() {
        return var;
    }

    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println(ce.getValue());
    }

}
