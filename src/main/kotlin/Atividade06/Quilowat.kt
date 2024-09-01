// Sabe-se que o quilowatt de energia custa um quinto do
//salário mínimo. Faça um programa que receba o valor
//do salário mínimo e a quantidade de quilowatts consumida
//por uma residência. Calcule e mostre:
//  a) o valor, em reais, de cada quilowatt;
//  b) o valor, em reais, a ser pago por essa residência;
//  c) o valor, em reais, a ser pago com desconto de 15%;

package Atividade06

fun main(args: Array<String>){
    println("Informe o valor do salário mínimo: ")
    var salMin = readln()?.toDoubleOrNull()?: 0.00;

    println("Informe quantos quilowatt são consumidos na residência: ")
    var kw = readln()?.toDoubleOrNull()?: 0.00;

    var valorKw = salMin / 5;

    var valorTotal = valorKw * kw;

    var valorDesc = valorTotal * 0.85;

    println("O valor total a ser pago nesta residencia é: R$" + valorTotal);
    println("E o valor com o desconto de 15% é: R$" + valorDesc);
}
