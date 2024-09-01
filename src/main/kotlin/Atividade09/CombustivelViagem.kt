// Calcular a quantidade de litros de combustível gastos em uma
//viagem. Para obter o cálculo, o usuário deverá fornecer o
//tempo gasto, quantos km/l o carro faz e a velocidade média
// durante a viagem. O programa deverá apresentar os valores da
//velocidade média, tempo gasto na viagem,
//a distância percorrida e a quantidade
//de litros utilizados na viagem.

package Atividade09

fun main(args: Array<String>){
    println("Informe qual foi o tempo da viagem em horas: ")
    var tempo = readln().toDoubleOrNull()?: 0.0;

    println("Informe quantos km/l o carro faz: ")
    var kmpl = readln()?.toDoubleOrNull()?: 0.0;

    println("Informe a velocidade média da viagem: ")
    var vm = readln()?.toDoubleOrNull()?: 0.0;

    var distancia = vm * tempo;
    var litros = distancia / kmpl;

    println("A distância da viagem foi de " + distancia + " km");
    println("Foram usados " + litros + " litros de combustível nessa viagem");
}