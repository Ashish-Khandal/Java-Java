package BitMask;

public class GetBit{
    public static void main(String[] args) {

        //! Get Bit concept.
        
        int x = 5;
        int postion = 2;
        int bitmask = 1<<postion;
        if((bitmask & x)==0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is one");
        }
    }
}