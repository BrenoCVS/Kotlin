package Atividade02

//  O cardápio de uma casa de lanches, especializada em sanduíches, é dado abai
//xo. Escreva um algoritmo que leia o código de cada item comprado por um clien
//te, calcule e exiba a quantidade e o valor de cada produto consumido e o total
// a pagar
//
//      Código                     Produto                     Preço (R$)
//        H                       Hamburguer                     1.50
//        C                      Cheeseburguer                   1.80
//        M                       Misto Quente                   1.20
//        A                        Americano                     2.00
//        Q                       Queijo Prato                   1.00
//
//
// OBS: Ao final só devem ser mostrados os produtos que forma vendidos
// OBS: Se for digitado um código de lanche fora do cardápio deve ser mostrada
// a mensagem Código Invalido
// OBS: O programa fecha a conta quando X for digitado

fun main(args: Array<String>){
    var cod = "A";
    var hamburger = 0;
    var cheese = 0;
    var misto = 0;
    var americano = 0;
    var queijo = 0;
    var conta = "";
    var precoHam = 0.0;
    var precoChe = 0.0;
    var precoMis = 0.0;
    var precoAme = 0.0;
    var precoQue = 0.0;
    while (cod != "X"){
        println("       Código                     Produto                     Preço (R\$)\n" +
                "        H                       Hamburguer                     1.50\n" +
                "        C                      Cheeseburguer                   1.80\n" +
                "        M                       Misto Quente                   1.20\n" +
                "        A                        Americano                     2.00\n" +
                "        Q                       Queijo Prato                   1.00");

        println("Faça o seu pedido: ")
        cod = readLine().toString();

            conta = "                        Comanda                      \n" +
                    "-----------------------------------------------------\n" +
                    "Quantidade              Produto                 Valor\n";

        when (cod){
            "H" -> hamburger++;
            "C" -> cheese++;
            "M" -> misto++;
            "A" -> americano++;
            "Q" -> queijo++;
            else -> println("O código inserido não é validoválido. ")
        }
    }
    if (hamburger > 0){
        precoHam = hamburger * 1.5;
        conta += "    " + hamburger +"                 Hamburger                 " + precoHam+"\n"
    }

    if (cheese > 0){
        precoChe = cheese * 1.8;
        conta += "    " + cheese +"                  Cheeseburguer             " + precoChe+"\n"
    }

    if (misto > 0){
        precoMis = misto * 1.2;
        conta += "    " + misto +"                 Misto Quente               " + precoMis+"\n"
    }

    if (americano > 0){
        precoAme = americano * 2.0;
        conta += "    " + americano +"               Americano                    " + precoAme+"\n"
    }

    if (queijo > 0){
        precoQue = queijo * 1.0;
        conta += "    " + queijo +"                Queijo Prato                 " + precoQue+"\n"
    }
    var valorTotal = precoChe + precoAme + precoHam + precoMis + precoQue;
    conta += "-----------------------------------------------------\n" +
            "                       Valor Total                    \n" +
            "                          " + valorTotal + "            ";
    println(conta);
}