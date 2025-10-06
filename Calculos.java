package exercicio1;

public class Calculos {

   public void printResult(){

       double somaAB = (Math.random()*5) + (Math.random()*5);
       double numberC = Math.random()*10;

       long somaAABrredondada = Math.round(somaAB);
       long numeroCArredondado = Math.round(numberC);

        System.out.printf("O resultado de A + B é: %.0f\n", somaAB);
        System.out.printf("O número C é: %.0f\n", numberC);

        if(somaAABrredondada > numeroCArredondado){
        System.out.println("O resultado de A + B é maior que C");
        }

        else if (somaAABrredondada == numeroCArredondado) {
        System.out.println("O resultado de A + B é igual a C");

        }

        else {
        System.out.println("O resultado de A + B é menor que C");

        }
    }

}
