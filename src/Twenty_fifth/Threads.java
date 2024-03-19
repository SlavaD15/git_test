package Twenty_fifth;

public class Threads {
    static Second second;
    public static void main(String[] args) {
        second = new Second();
        System.out.println("start");
        second.start();

        for(int i = 0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("1");
            }
        }
        if(second.isAlive()){
            try{
                second.join();
            }catch(InterruptedException e){
                System.out.println("second won");
            }
        }else{
            System.out.println("first won");
        }
        System.out.println("end");
    }
}