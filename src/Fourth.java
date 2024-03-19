import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        for(int o=0;o<array.length;o++){
            for(int l=0;l<array[o].length;l++){
                int c = in.nextInt();
                array[o][l] = c;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }



        char[][] array = new char[5][5];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==j || i+j==4){
                    array[i][j] = '@';
                }
            }
        }
        for(int o=0;o<array.length;o++){
            for(int l=0;l<array[o].length;l++){
                System.out.print(array[o][l]);
            }
            System.out.println("");
        }



        int[][] array = new int[3][3];
        for(int o=0;o<array.length;o++){
            for(int l=0;l<array[o].length;l++){
                array[o][l] = (int)(Math.random()*9);
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[j][i]);
            }
            System.out.println("");
        }



        int[][] array = new int[3][3];
        for(int o=0;o<array.length;o++){
            for(int l=0;l<array[o].length;l++){
                array[o][l] = (int)(Math.random()*9);
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        int min = array[0][0];
        int min_index_i = 0;
        int min_index_j = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(min>array[i][j]) {
                    min = array[i][j];
                    min_index_i = i;
                    min_index_j = j;
                }
            }
        }
        int max = array[0][0];
        int max_index_i = 0;
        int max_index_j = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(max<array[i][j]) {
                    max = array[i][j];
                    max_index_i = i;
                    max_index_j = j;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println(min);
        System.out.println(min_index_i);
        System.out.println(min_index_j);
        System.out.println("------------------------");
        System.out.println(max);
        System.out.println(max_index_i);
        System.out.println(max_index_j);
        int diff = (((min_index_i*3)+min_index_j)-((max_index_i*3)+max_index_j))-1;
        System.out.println("------------------");
        System.out.println(diff);



        int[][] array = new int[5][5];
        for(int o=0;o<array.length;o++){
            for(int l=0;l<array[o].length;l++){
                array[o][l] = (int)(Math.random()*120);
            }
        }
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                int c = (array[i][j] / 100) + ((array[i][j] % 100) / 10) + (array[i][j] % 10);
                if(c>7 && c<13){
                    System.out.printf("%d(%d, %d); ", array[i][j], i, j);
                    System.out.println("");
                }
            }
        }
         */
        int a = 123123;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);

    }
}



