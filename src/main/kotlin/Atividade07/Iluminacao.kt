// Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para
//cada metro quadrado, deve-se usar 18 W de potência. Faça um programa que
//receba as duas dimensões de um cômodo (em metros), calcule e mostre a sua
//área (em metros quadrados) e a potência de iluminação que deverá
//ser utilizada.

package Atividade07

fun main(args: Array<String>){

    println("Informe a primeira dimensão do cômodo: ")
    var d1 = readln()?.toDoubleOrNull()?: 0.0;

    println("Informe a segunda dimensão do cômodo: ")
    var d2 = readln()?.toDoubleOrNull()?: 0.0;

    var kwTotal = d1 * d2 * 18;

    println("Serão necessários " + kwTotal + " w de potência para iluminar o cômodo");
}