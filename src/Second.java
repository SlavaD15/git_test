import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        switch(month){
            case 1:
                System.out.println("Месяц 1 - январь");
                break;
            case 2:
                System.out.println("Месяц 2 - фев");
                break;
            case 3:
                System.out.println("Месяц 3 - март");
                break;
            case 4:
                System.out.println("Месяц 4 - апрель");
                break;
            case 5:
                System.out.println("Месяц 5 - май");
                break;
            case 6:
                System.out.println("Месяц 6 - июнь");
                break;
            case 7:
                System.out.println("Месяц 7 - июль");
                break;
            case 8:
                System.out.println("Месяц 8 - авг");
                break;
            case 9:
                System.out.println("Месяц 9 - сент");
                break;
            case 10:
                System.out.println("Месяц 10 - окт");
                break;
            case 11:
                System.out.println("Месяц 11 - нояб");
                break;
            case 12:
                System.out.println("Месяц 12 - дек");
                break;
            default:
                System.out.println("No such month");
                break;
        }

        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        switch(n){
            case 1:
                System.out.println("Номер 1 - понедельник");
                break;
            case 2:
                System.out.println("Номер 2 - вторник");
                break;
            case 3:
                System.out.println("Номер 3 - среда");
                break;
            case 4:
                System.out.println("Номер 4 - четверг");
                break;
            case 5:
                System.out.println("Номер 5 - пятница");
                break;
            case 6:
                System.out.println("Номер 6 - суббота");
                break;
            case 7:
                System.out.println("Номер 7 - воскресенье");
                break;
            default:
                System.out.println("There is no such day");
                break;

        }
        int random = (int)(Math.random()*45);
        if(random == 14){
            System.out.println("Тор побудил с билетом №"+random);
        }else if(random == 25){
            System.out.println("Ж.Ч. победил с билетом №"+random);
        }else{
            System.out.println("Никто не победил");
        }
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        for(int i=0;i<=15;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum += i;
        }
        System.out.println(sum);

        for(int i=1;i<=10;i++){
            System.out.printf("1*%d=%d       ", i, 1*i);
            System.out.printf("2*%d=%d       ", i, 2*i);
            System.out.printf("3*%d=%d       ", i, 3*i);
            System.out.printf("4*%d=%d       ", i, 4*i);
            System.out.printf("5*%d=%d       ", i, 5*i);
            System.out.printf("6*%d=%d       ", i, 6*i);
            System.out.printf("7*%d=%d       ", i, 7*i);
            System.out.printf("8*%d=%d       ", i, 8*i);
            System.out.printf("9*%d=%d       ", i, 9*i);
            System.out.printf("10*%d=%d       \n", i, 10*i);
        }

        int sum = 0;
        for(int i=1;i<=333;i++){
            if(i%100==0){
                sum++;
            }
            if(i%10==9){
                sum++;
            }
        }
        System.out.println(sum);

        for(int i=1;i<=1000;i++){
            if(i%100==33){
                System.out.printf("Подарок №%d надо исправить!\n", i);
            }
        }

        Scanner in1 = new Scanner(System.in);
        int h = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int width = in2.nextInt();
        String star = "*";
        for(int j=0;j<=width-2;j++){
            star += "*";
        }
        for(int i=0;i<=h-1;i++){
            System.out.println(star);
        }

        */
        int attempts = 3;
        System.out.println("Рыбий хвост, но он – не рыба. Пасть – с клыками, но не зверь. Кто же это?");
        Scanner in = new Scanner(System.in);
        do {
            String input = in.next();
            switch (input.toLowerCase()) {
                case "крокодил":
                    System.out.println("Правильно!");
                    attempts = 0;
                    break;
                case "сдаюсь":
                    System.out.println("Правильный ответ: крокодил");
                    break;
                default:
                    System.out.println("Подумай ещё");
                    attempts--;
                    break;
            }
        }while(attempts > 0);
    }
}
