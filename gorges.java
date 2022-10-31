import java.util.Scanner;

public class gorges {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int decisao, mesesTrabalhados;
        double salario, salarioFinalAno;

        System.out.println("1.Novo sálario \n2.Férias \n3.Décimo Terceiro \n4.Sair ");
        decisao = ler.nextInt();

        switch (decisao) {
            case 1:
                System.out.println("Digite seu sálario: ");
                salario = ler.nextDouble();

                if(salario < 350) {
                    System.out.println("Salario Novo igual a: "+salario*1.15);
                }
                else if(salario > 350 & salario<600) {
                    System.out.println("Salario Novo igual a: "+salario*1.10);
                }
                else if(salario > 600) {
                    System.out.println("Salario Novo igual a: "+salario*1.05);
                }

            case 2:
                System.out.println("Digite seu sálario: ");
                salario = ler.nextDouble();

                System.out.println("Suas férias equivalem a: "+salario*1.33);

            case 3:
                System.out.println("Digite seu sálario: ");
                salario = ler.nextDouble();

                System.out.println("Digite quantos meses você trabalhou: ");
                mesesTrabalhados = ler.nextInt();
                if(mesesTrabalhados > 12) {
                    System.out.println("Digite quantos meses você trabalhou: ");
                }

                salarioFinalAno = (salario * mesesTrabalhados) / 12;
                System.out.println("Seu décimo terceiro equivale a: "+salarioFinalAno);

            case 4:
                System.exit(0);
        }
    }
}
