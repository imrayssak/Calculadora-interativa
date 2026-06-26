import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    double num1, num2, resultado, resto, novoNum;
    short subOpcao;
    byte opcao = -1;
    while (opcao != 0) {
        menuPrincipal();
        opcao = sc.nextByte();

        switch (opcao) {
            case 1: {
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                resultado = soma(num1, num2);
                System.out.println("O resultado é de: " + resultado);

                while (true) {
                    submenu();
                    subOpcao = sc.nextShort();

                    if (subOpcao == 1) {
                        System.out.print("Digite o próximo número: ");
                        novoNum = sc.nextDouble();

                        resultado = soma(resultado, novoNum);
                        System.out.println("Resultado acumulado: " + resultado);

                    } else if (subOpcao == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                break;
            }

            case 2:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                resultado = subtracao(num1, num2);
                System.out.println("O resultado é: " + resultado);

                while (true) {
                    submenu();
                    subOpcao = sc.nextShort();

                    if (subOpcao == 1) {
                        System.out.print("Digite o próximo número: ");
                        novoNum = sc.nextDouble();

                        resultado = subtracao(resultado, novoNum);
                        System.out.println("Resultado acumulado: " + resultado);

                    } else if (subOpcao == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                break;

            case 3:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                resultado = multiplicacao(num1, num2);
                System.out.println("O resultado é: " + resultado);
                break;

            case 4:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                resultado = divisao(num1, num2);
                resto = resto(num1, num2);

                System.out.println("O resultado é: " + resultado);
                System.out.println("O resto da divisão é " + resto);
                break;

            case 5:
                System.out.print("Digite o número da base: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o expoente: ");
                num2 = sc.nextDouble();

                resultado = potenciacao(num1, num2);
                System.out.println("O resultado é: " + resultado);
                break;

            case 0:
                System.out.println("Obrigada por usar a calculadora!");
                break;

            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }
}

void menuPrincipal() {
    System.out.println("Menu Principal");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtracão");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão/Resto");
    System.out.println("5 - Potenciação");
    System.out.println("0 - Sair");
    System.out.println("Escolha qual dessas operacões deseja executar?");
}

void submenu() {
    System.out.println("\n=== SUBMENU ===");
    System.out.println("1 - Informar mais um número e continuar");
    System.out.println("2 - Voltar ao menu principal");
}

double soma(double num1, double num2) {
    return num1 + num2;
}

double subtracao(double num1, double num2) {
    return num1 - num2;
}

double multiplicacao(double num1, double num2) {
    return num1 * num2;
}

double divisao(double num1, double num2) {
    return num1 / num2;
}

double resto(double num1, double num2) {
    return num1 % num2;
}

double potenciacao(double num1, double num2) {
    return Math.pow(num1, num2);
}