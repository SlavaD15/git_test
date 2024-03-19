public class Fifth {
    public static void main(String[] args) {
        /*
        int[] array = {5, 1, 3, 8, 9, 2, 4, 7, 6};
        for(int j=0;j<array.length;j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        for(int j:array){
            System.out.println(j);
        }
         */
            int array[] = new int[6];
            int a = 0;
            for(int i=0;a<3;i++){
                array[i] = a++;
                if(i%2==0){
                    a--;
                }
            }
            int result = array[1]+array[4]-array[2];
            System.out.println(result);
        }
    }


