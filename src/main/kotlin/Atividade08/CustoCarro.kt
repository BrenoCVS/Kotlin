// O custo ao consumidor de um carro novo é a soma do preço de fábrica com o
//percentual de lucro do distribuidor e dos impostos ao preço de fábrica. Faça
//um programa que receba o preço de fábrica de um veículo, o percentual de lucro
//do distribuidor e o percentual de impostos.
//Calcule e mostre
//       a) o valor correspondente ao lucro do distribuidor;
//       b) o valor correspondente ao imposto;
//       c) o preço final de veículo

package Atividade08

fun main(args: Array<String>){
    println("Informe o preço de fábrica do veículo: ")
    var precoFab = readln()?.toDoubleOrNull()?: 0.0;

    println("Informe o percentual de lucro do distribuidor: ")
    var porcentDis = readln()?.toDoubleOrNull()?: 0.0;

    println("Informe o percentual de impostos: ")
    var porcentImpost = readln()?.toDoubleOrNull()?: 0.0;

    var valorDis = precoFab * porcentDis / 100;
    var valorImpost = precoFab * porcentImpost / 100;

    var precoCarroTotal = precoFab + valorDis + valorImpost;

    println("O valor do lucro do distribuidor é de: R$" + valorDis);
    println("O valor total dos impostos é de: R$" + valorImpost);
    println("O valor total do veículo é de: R$" + precoCarroTotal);
}