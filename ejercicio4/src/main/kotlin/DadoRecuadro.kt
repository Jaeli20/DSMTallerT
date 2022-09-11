class DadoRecuadro: Dado() {

    val asteriscos: MutableList<String> = mutableListOf()


    fun tirar2() {
        dado = (1..100).random()
        println(dado)

    }

    fun asteristicos() {
val y = "*"
        for (x in (1..dado)) {

            asteriscos.add(y)
        }

    }
    fun imprimir2(){
        println( asteriscos)
    }
}