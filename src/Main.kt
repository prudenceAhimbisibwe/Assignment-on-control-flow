fun main() {
    oddNumbers()
    var y =longNames(arrayOf("prudence","kansiime","Minage","Joy"))
    println(y)
    party(12)
    party(4)
    party(20)
    numbers()

}
fun oddNumbers(){
    for (num in 1..100){
        if (num%2!=0){
            println(num)
        }
    }
}
fun longNames(names:Array<String>):Int{
    var x =0
    names.forEach { name->
        if (name.length>5){
            x++
        }
    }
    return x
}
fun party(age:Int){
    if (age<6){
        println("You get a glass of milk")
    }
    else if (age<15 && age>6){
        println("You get Fanta Orange")

    }
    else{
        println("You get Coca Cola")
    }
}
fun numbers(){
    var total=0
    for (numbers in 1..100)
        if (numbers%3==0 && numbers%5==0) {
            println("FizzBuzz")
        }

     else if (numbers%3==0){
        println("Fizz")
        }
    else if (numbers%5==0) {
            println("Buzz")
        }
    else {
            println(numbers)
        }
    }






