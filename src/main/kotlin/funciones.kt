fun main(){
    println("Hello")
    sayHello()
    sayHelloToFrom(name = "Sruce Wayne", city = "Get")
    sayHelloTo(name = "Peter")
    println("El doble de 25 es${duplicate(25)}")
    val result= divide(99, 15.0)
    println("El resultado de 99/15 es $result")
    println(fullName("Jonh", "Snow"))

    welcomeToMexico()
    welcomeToMexico("Spiderman")

    // Params with name
    sayHelloToFrom("Superman", "Metropolis")
    sayHelloToFrom("Namekusel", "Pikoro")
}

// fuctions without params and wilhout return
fun sayHello(){
    println("Hellooo")
}

// Funtions with params ans without return
fun sayHelloTo(name: String){
    println("Hello $name")
    println("Wlcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city)
}

// Fuctions with return
// We must specify the datatype

fun duplicate(num: int): int {
    return num * 2
}

fun divide(num1: int, num2: Double): Double{
    return num1 / num2
}

fun fulName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// functions with optional Params
fun welcomeToMexico(name: String="Invitado"){
    println("Welcome to Mexico $name")
}