public class maiordedoisnumeros {
    public static void main(String[] args) {

        double n1, n2;

        System.out.print("Digite o Primeiro Número: ");

        n1 = Double.parseDouble(System.console().readLine());

        System.out.print("Digite o Segundo Número: ");

        n2 = Double.parseDouble(System.console().readLine());

        if(n1 > n2) {

            System.out.printf("Maior Número: %f\n", n1);
        }

        if(n2 > n1) {

            System.out.printf("Maior Número: %f\n", n2);
        }

        if(n1 == n2) {

            System.out.println("Os Números São Iguais !!");
        }

    }
}