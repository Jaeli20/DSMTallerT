import kotlin.math.sqrt

class formula {

    var a = 0
    var b = 0
    var c = 0


    fun datoA() {
        println("Ingrese el dato A")
        a = readln().toInt()

        if (a == 0) {
            println("Error!, ingrese un valor diferente a 0")
            datoA()
        }

    }

    fun datoB() {
        println("Ingrese el dato B")
        b = readln().toInt()

        if (b == 0) {
            println("Error!, ingrese un valor diferente a 0")
            datoB()
        }
    }
    fun datoC() {
        println("Ingrese el dato c")

    c = readln().toInt()

    if (c == 0) {
        println("Error!, ingrese un valor diferente a 0")
        datoC()
    }
}

    fun formulaGeneral(){
        var raiz : Float = 0.0F
        var bElevada : Float = 0.0F
        var primerResultado: Float = 0.0F
        var segundoResultado : Float = 0.0F

        bElevada = Math.pow(b.toDouble(), 2.0).toFloat()

        raiz = (bElevada - (4*a*c))
        raiz = sqrt(raiz)

        primerResultado = ((-b)+raiz)/(2*a)
        segundoResultado = ((-b)-raiz)/(2*a)

        println("x1 = $primerResultado")
        println("x2 = $segundoResultado")

    }

}


