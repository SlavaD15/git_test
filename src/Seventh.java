public class Seventh {
    public static void main(String[] args) {
        Solution firstSolution = new Solution(69);
        Solution secondSolution = new Solution(228);
        countTheResult(firstSolution);
        countTheResult(secondSolution);
    }
    public static void countTheResult(Solution solution){
        System.out.println(solution.getTemp());
    }
}
class Solution{
    private int temp;
    static int number;
    static final int CONST;
    static{
        number = 100;
        CONST = 228;
    }
    public Solution(int q){
        temp = q + number++ * CONST;
    }
    public int getTemp(){
        return temp;
    }
}
