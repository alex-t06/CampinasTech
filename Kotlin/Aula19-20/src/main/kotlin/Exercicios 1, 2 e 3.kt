fun main() {
    /*
    * 1 - criar variaveis do tipo Boolean usando o operador XOR criar um cenário com o println() que a informação seja
    * "true"
    * */

    var x: Boolean = true
    var y: Boolean = false

    println("Exercício 1: " + (x xor y))

    /*
    * 2 - criar variaveis do tipo Boolean usando o operador || criar um cenário com o println() que deve retornar
    * "false"
    * */

    x = false

    println("Exercício 2: " + (x || y))

    /*
    * 3 - criar variaveis de tipo Boolean usando o operador && criar um cenário com o println() que deve retornar
    * "true"
    * */

    x = true
    y = true

    println("Exercício 3: " + (x && y))
}