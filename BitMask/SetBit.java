package BitMask;

public class SetBit {
    public static void main(String[] args) {

        //! Set bit, that mean 0 convert to 1 .
        
        int x = 5;
        int postion = 1;
        int bitmask = 1<<postion;
        int newNumber = x | bitmask;
        System.out.println(newNumber);
    }
}
