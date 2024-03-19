public class Thirteenth {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);

        System.out.println("------------------------");

        printMatrix(2, 1, "8");System.out.println();
        printMatrix(2, 2, (Object) 8);System.out.println();
        printMatrix(2, 3, 8);System.out.println();
        printMatrix(2, 4, (byte) 8);System.out.println();
        printMatrix(2, 5, (long) 8);System.out.println();
        printMatrix(2, 6, (short) 8);System.out.println();
        printMatrix(2, 7, (Number) 8);System.out.println();
        printMatrix(2, 8, (int) 8);System.out.println();
        printMatrix(2, 9, (Integer) 8);System.out.println();
        printMatrix(2, 10, (char) 8);
    }

    public static void print(double i){
        System.out.println("Это double");
    }
    public static void print(Integer i){
        System.out.println("Это Integer");
    }
    public static void print(Number i){
        System.out.println("Это Object");
    }


    public static void printMatrix(int m, int n, long value){
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, Object value){
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
