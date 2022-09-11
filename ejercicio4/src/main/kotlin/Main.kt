fun main(args: Array<String>) {
    val dado = Dado()
    val dadoRecuadro = DadoRecuadro()


    dado.tirar()
    dado.imprimir()
    dado.nombres()

    dadoRecuadro.tirar2()
    dadoRecuadro.asteristicos()
    dadoRecuadro.imprimir2()
}