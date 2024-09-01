// Fça um sistema que receberá o nuúmero da CNH e o número
// de multas que o motorista já levou e se o número de multas
// for maior que 0 o motorista deve informar o valor da multa
// O sistema deverá imprimir o valor total arrecadado com as multas
// e imprimir também o número de carteira do motorista
//que obteve o maior numero de multas. Para encerrar digite zero.

package Atividade03

fun main(argas: Array<String>){

    var numcart =1;
    var maiorMulta = 0;
    var valorTotal = 0.0;
    var numMultas = 0;
    var cont = 1
    var valorMulta = 0.0;
    var cartMariorMulta = 0;

    println("Informe o número da CNH: ");
    numcart = readLine()?.toIntOrNull() ?: 0;

    while(numcart != 0) {

        println("Digite o número de multas tomadas: ");
        numMultas = readLine()?.toIntOrNull() ?: 0;

        if (numMultas > 0)
            for (cont in 1..numMultas) {
                println("Informe o valor da multa número " + cont + ": ")
                valorMulta = readLine()?.toDoubleOrNull() ?: 0.0;

                valorTotal += valorMulta;
            }

        if (numMultas > maiorMulta){
            cartMariorMulta = numcart;
        }
        println("Informe o número da CNH: ");
        numcart = readLine()?.toIntOrNull() ?: 0;
    }

    println("A carteira de motorista que levou o maior número de multas foi: " + cartMariorMulta)
    println("A valor total arrecadado com as multas foi de: R$" + valorTotal);
}



