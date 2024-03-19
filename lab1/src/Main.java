import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.print("Ingrese lo que desea hacer: ");
        System.out.println("1: sumar, 2: restar, 3: multimplicar, 4: dividir, cualquier otro numero es salir");
        int option = sc.nextInt();
        while(option==4 ||option==3 ||option==2 ||option==1){

            System.out.println("Ingrese el primer numero");
            float number1 = sc.nextFloat();
            System.out.println("Ingrese el segundo numero");
            float number2 = sc.nextFloat();

                switch (option) {
                    case 1:
                     System.out.println(Suma(number1,number2));
                        break;

                    case 2:

                        System.out.println(Resta(number1,number2));
                        break;

                    case 3:

                        System.out.println(Multi(number1,number2));
                        break;

                    case 4:

                        System.out.println(Divi(number1,number2));
                        break;
                }
                System.out.println("Desea continuar?");
                System.out.println("1: sumar, 2: restar, 3: multimplicar, 4: dividir, cualquier otro numero es salir");
                option = sc.nextInt();
            }
        System.out.println("Adios");
    }

    public static float Suma(float num1, float num2 ){
        return num1+num2;
    }
    public static float Resta(float num1, float num2){
        return num1-num2;
    }
    public static float Multi(float num1, float num2){
        return num1*num2;
    }
    public static float Divi(float num1, float num2){
        return num1/num2;
    }
}
