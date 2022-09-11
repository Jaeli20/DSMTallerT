class salario {
    var salario = 0

    fun datos(){
        println("Ingrese su salario")
        salario= readln().toInt()
        validacion()
    }
    fun validacion(){
        if (salario ==0 || salario < 0){
            println("el salario no puede ser 0 o menor a 0")
            datos()
        }
    } fun deducciones (){
        var ISSS = (salario * 3)/100
        var AFP = (salario * 4)/100
        var RENTA = (salario * 5)/100
        var sueldoTotal = salario - (ISSS+AFP+RENTA)
        println("Sueldo: $salario")
        println("Cantidad a pagar: $"+(ISSS+AFP+RENTA)+"\n"
        +"1. ISSS 3% = $"+ISSS +"\n" +
                "2. AFP 4% = $"+AFP +"\n" +
                "3. Renta 5% = $"+RENTA)
        println("Sueldo despues de deduciones: $"+sueldoTotal)

    }
}