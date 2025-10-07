package exercicio2;

import java.util.Random;

public class Calculation {

    public void printResult(){
        double number1 = - Math.random()*100;
        double number2 = Math.random()*100;

        long rounded1 = Math.round(number1);
        long rounded2 = Math.round(number2);

        double result = rounded2 + rounded1;

        System.out.printf("O número é: %.0f\n",result);
        if(result == 0){
            System.out.println("O número é zero");
        }
        else if(result % 2 == 0 && result > 0){
            System.out.println("O número é par e positivo");
        }
        else if(result % 2 == 1 && result > 0){
            System.out.println("O número é impar e positivo");
        }
        else if(result % 2 == 0 && result < 0){
            System.out.println("O número é par e negativo");
        } else {
            System.out.println("O número é impar e negativo");
        }

    }



}
