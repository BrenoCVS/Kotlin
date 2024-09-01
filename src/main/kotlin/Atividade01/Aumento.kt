package Atividade01

//Faça um programa que receba o salário de um funcionário,
//calcule e mostre o novo salário desse funcionário,
//acrescido de bonificação e de auxílio escola.
//Salário                            Bonificação
//Até R$ 500,00                      5%
//Entre R$ 500,00 e R$ 1200,00       12%
//Acima de R$ 1200,00                0%

//Salário                      Auxílio Escola
//Até R$ 600,00                R$ 150,00
//Mais que 600,00              R$ 100,00

fun main(args: Array<String>) {
    println("Insira seu salário: ");
    var sal = readLine()?.toDoubleOrNull() ?: 0.0;
    var novoSal = 0.0;

    if (sal <= 500){
        novoSal = sal*1.05;
    } else if ((sal > 500) && (sal <= 1200)){
        novoSal = sal*1.12;
    } else {
        novoSal = sal;
    }

    if (sal <= 600){
        novoSal += 150;
    } else {
        novoSal += 100;
    }
    println("Seu salário com o aumento é: " + novoSal);
}