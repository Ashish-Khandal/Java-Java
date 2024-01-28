package BitMask;

public class ClearBit {
    public static void main(String[] args) {

        //! Clear bit, that mean 1 convert to 0 .
        
        int x = 5;
        int postion = 2;
        int bitmask = 1<<postion;
        int newNumber = ~bitmask;
        newNumber = newNumber & x;
        System.out.println(newNumber);
    }
}
