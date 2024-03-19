package Thirty_second;

public class Dollar {
    int cents;

    public Dollar(int cents) {
        this.cents = cents;
    }

    public Dollar(){
        this.cents = 100;
    }

    public void calc(char sign, int num){
        switch (sign) {
            case '+' -> this.cents += num;
            case '-' -> this.cents -= num;
            case '*' -> this.cents *= num;
            case '/' -> this.cents /= num;
        }
    }

    @Override
    public String toString() {
        return  (cents/100 + "." + cents%100);
    }

    public boolean equals(Dollar dollar){
        return this.cents == dollar.cents;
    }

    public int compareTo(Dollar dollar){
        return this.cents - dollar.cents;
    }
}
