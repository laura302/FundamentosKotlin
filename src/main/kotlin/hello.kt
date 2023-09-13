fun main(){
    println("hello world")

    //variables
    // val para declarar constantes (solo lectura)
    // ver para variables

    val pi = 3.14
    var x = 34

    println("pi")
    x = 24
    x = x +1
    x++
    x--
    x+=10
    x-=2
    x *=2
    x/=5
    println(x)

    val firstName ="Frank"
    val lastName: String = "Lopez"
    val fullName = firstName+ " " + lastName

    val age: int =39
    val heigth: Double =1.68

    var stars = 10

    // String Templete
    // $ para imprimir variables
    // $ para procesar antes de imprimir

    peintln("I'm $age years old")
    println("I'm $heigth de altura")
    println("Obtendre un ${ stars + 10 } estrellas")

    println(fullName)


}
