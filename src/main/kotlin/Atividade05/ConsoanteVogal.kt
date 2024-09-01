//Construa um algoritmo que solicite 20 letras
//Ao final o algoritmo deve informar quantas vogais e quantas consoantes
//foram digitadas.

package Atividade05

fun main(args: Array<String>){

    var numVog = 0;
    var numCon = 0;

    for (cont in 1..5){
        println("Informe a " + cont + " letra: ")
        var letra = readln();

        when(letra) {
            "A" -> numVog++;
            "E" -> numVog++;
            "I" -> numVog++;
            "O" -> numVog++;
            "U" -> numVog++;
            "a" -> numVog++;
            "e" -> numVog++;
            "i" -> numVog++;
            "o" -> numVog++;
            "u" -> numVog++;
            else -> numCon++;
        }
    }

    println("O número de vogais digitadas foi: " + numVog);
    println("O número de consoantes digitadas foi: " + numCon);

}