//Construa um algoritmo que determine quanto será gasto para encher o
//tanque de um carro. O usuário fornecerá os seguintes dados: Tipo de
//carro (tc) (G - gasolina ou A - álcool) e Capacidade do tanque (CT),
//o sistema irá imprimir uma mensagem falando o tipo do carro
//(Gasolina ou Álcool) e pedirá para o usuário informar o
//valor do preço do litro do combustível.
//Como saída, será informado para o usuário, o valor,
//em reais, do preço de se encher o tanque de combustível.

package Atividade04

fun main(args: Array<String>){
    var preco = 0.0;
    println("Informe o tipo do automóvel (Gasolina = G ou Álcool = A): ")
    var tc = readln();

    println("Informe a quantidade de litros necessários para encher o tanque: ")
    var cpd = readln().toIntOrNull()?: 0;

    if (tc == "G") {
        println("Informe o valor da gasolina: ");
        preco = readln()?.toDoubleOrNull()?: 0.0;
    } else {
        println("Informe o valor do álcool: ");
        preco = readln().toDoubleOrNull()?: 0.0;
    }

    var valorTanq = cpd * preco;

    println("Serão necessários R$" + valorTanq + " para encher o tanque do automóvel")
}