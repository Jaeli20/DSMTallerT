class numero {
    var a = 0
    var b = 0
    var c = 0
    var menor = 0
    var mayor = 0

    fun capturaA(){
        println("Ingrese el primer numero")
        a = readln().toInt()
        validarA()


    }fun validarA(){
        if ( a < 0){
            println("Error, El numero no puede ser negativo")
            capturaA()
        };if ( a == 0){
            println("Error, El numero no puede ser 0")

            capturaA()
        };if ( a == 9){
            capturaB()

        };if (a!=9){
            condicionPrimos()
        }
    }

    fun capturaB(){
        println("Ingrese el segundo numero")
        b = readln().toInt()
        validarB()


    }fun validarB(){
        if ( b < 0){
            println("Error, El numero no puede ser negativo")
            capturaB()
        };if ( b == 0){
            println("Error, El numero no puede ser 0")

            capturaB()
        };if ( b == a){
            println("Error, El numero no puede ser igual al primero")

            capturaB()
        };if (b!=9){
            condicionPrimos()
        }
    }
    fun capturaC(){
        println("Ingrese el tercer numero")
        c = readln().toInt()
        validarC()


    }fun validarC(){
        if ( c < 0){
            println("Error, El numero no puede ser negativo")
            capturaC()
        };if ( c == 0){
            println("Error, El numero no puede ser 0")

            capturaC()
        };if ( c == a){
            println("Error, El numero no puede ser igual al primero")

            capturaC()
        };if ( c == b){
            println("Error, El numero no puede ser igual al segundo")

            capturaC()
        };if (c!=9){
            condicionPrimos()
        }
    }


    fun mayor(){
        if ( a > b && a > c){
            println("el mayor $a")
            mayor = a
        };if (b > a && b > c){
            println("el mayor $b")
            mayor = b
        };if (c > a && c > b){
            println("el mayor $c")
            mayor = c
        }
    }
    fun menor(){
        if ( a < b && a < c){
            println("el menor $a")
            menor = a
        };if (b < a && b < c){
            println("el menor $b")
            menor = b
        };if (c < a && c < b){
            println("el menor $c")
            menor = c
        }
    }
    fun condicion(){
        var x = 0
        var y = 0
        if (menor>5){
            x=mayor+10
            println("$mayor + 10 = "+x)
        }

        if (mayor<100){
            y = menor-5
            println("$menor - 5 = "+y)
        }

    }

    fun condicionPrimos(){

        if (a%3!=0){
            println("Solo se deben ingresar multiplos de 3, excluyendo el 9")
            capturaA()
        };if (b%3!=0){
            println("Solo se deben ingresar multiplos de 3, excluyendo el 9")
            capturaB()
        };if (c%3!=0){
            println("Solo se deben ingresar multiplos de 3, excluyendo el 9")
            capturaC()
        }

    }
}