package Java_concept;
public class ReferenceVar {
    public static void main(String[] args) {
        int[] a = new int[4];
        int[][] a1 = new int[4][4];
        int[][][] a2 = new int[4][4][4];
        byte[] a3 = new byte[4];
        short[] a4 = new short[4];
        long[] a5 = new long[4];
        float[] a6 = new float[4];
        double[] a7 = new double[4];
        boolean[] a8 = new boolean[4];
        //Define
        //! object(reference variable).getClass().getName()
        System.out.println(a.getClass().getName());
        System.out.println(a1.getClass().getName());
        System.out.println(a2.getClass().getName());
        System.out.println(a3.getClass().getName());
        System.out.println(a4.getClass().getName());
        System.out.println(a5.getClass().getName());
        System.out.println(a6.getClass().getName());
        System.out.println(a7.getClass().getName());
        System.out.println(a8.getClass().getName());
        
        //if use toString method
        //! if variable is reference variable then output this type code [I@hexadecimal
        // or [classname@hashcode in hexadecimal .
        System.out.println(a);
        System.out.println(a8);
        //Other type
        System.out.println(a.toString());

    }
}
