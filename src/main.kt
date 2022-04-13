fun main(){
  //  var name = "Tom"
  //  if (name=="tom"){
   //     println("Hello Tom")
   // }
  //  else{
    //    println("Who are you?")
   // }
    //numbers(25)
 //   hasVisitedCapital("Rwandese")
   // println( myPasswords("Ilovefood")
  //  println(myPasswords("mmdlaoahfcncaloivd3")
 //   println(myPasswords("password")
    hasVisitedCapital("Rwandese")
    hasVisitedCapital("Tanzanian")
   // Language()
   // numbers()
    //squareOfNumbers()
    multiplesOf()
}

//write a function that prints out odd
//or even depending on the number passed to it
fun numbers(number:Int){
    if (number%2==0){
        println("even")
    }else{
        println("odd")
    }
    squareOfNumbers()
}
/*fun hasVisitedCapital(nationality:String){
    if (nationality.equals("Kenyan")){
        println("Have you visited Nairobi")
        }
        else if (nationality.equals("Ugandan")){
            println("Have you visited Kampala")
        }
    else if (nationality.equals("Tanzania")){
            println("Have you visited Dodoma")
        }
        else{
            println("Have you visited East Africa")
    }*/

//Create a function that takes in a password as a parameter
// For password to be valid it must meet the following Conditions:
//1. Must be at least 8 characters long
//2. must be at most 16 characters long
//must not be "password"
//Use if/else statements to determine whether the password
//provided is valid or not. Function returns true/false
fun myPasswords(password:String):Boolean{
    var x= "password"
    if (password.length >= 8 && password.length <=16 && !password.equals("password")) {
        return true
        }
    return false
}
fun hasVisitedCapital(nationality:String){
    when(nationality){
        "Kenyan"-> println("Have you ever visited Nairobi")
        "Ugandan"-> println("Have you ever visited Kampala")
        "Tanzanian"-> println("Have you ever visited Dodoma")
        else -> println("Have you ever been to E.A?")
    }
}fun Language(){
    var languages = arrayOf("Kiswahili", "English", "KInyarwanda", "Luganda")
    for (lang in languages)
        println(lang)
}
fun numbers(){
    for (n in 23..64){
        println(n)
    }
}
//write a function that prints out the square of all
// the odd numbers between 1 and 10
fun squareOfNumbers(){
    for (y in 1..10){
        if(y%2!==0){
            println(y*y)
        }

    }
}
//Create a function that prints out multiples of 6 and 8
//between 1 and 1000. For multiples of both 6 and 8
//it should print out "Bingo"
fun multiplesOf() {
    for (b in 1..1000) {
    }
}

