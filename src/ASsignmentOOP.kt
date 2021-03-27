fun main() {
var result=Human("Zillah",22,57.876543)
    println(result.eat(2))
    result.speak("Hello world!")
    result.birthday()
    var login=User("Mwimali","Zillaah","zillahmwimmali","0720273728","idon'tknow")
    println(login.email)
println(login.password)
}
class Human(var name:String,var age:Int,var weight:Double){
  fun eat(foodWeight:Int){
    println("I am eating $foodWeight kgs of food")
      weight=foodWeight+weight
      println(weight)
  }
    fun speak(speech:String){
     println(speech)
    }
    fun birthday(){
        ++age
        println(age)
    }

}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){


}
