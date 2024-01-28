package Java_concept;

public class Abc {
    int x, y;

    void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void sum(float a, float b) {

        float c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Abc digit = new Abc();
        digit.sum(30, 40);
        digit.sum(30.5f, 40.5f);

    }
}
