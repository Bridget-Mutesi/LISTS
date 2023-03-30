fun main(){
    val str = takeStrings(listOf("Rita","boy","ben","nick","rick","john","safe","lek","girl","june"))
    println(str)

   val avgTotal = heights(listOf(3.5,5.67,4.5,78.0,90.5))
    println(avgTotal)

    human()

    val people = peoples()
    println(people)

    val cars = vehicles()
    println(cars)




}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6
fun takeStrings(names: List<String>): List<String>{
    val element = mutableListOf<String>()
    for (x in names.indices step 2){
        element.add(names[x])
    }
    return element


}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights(height: List<Double>): Pair<Double, Double>{
    val a = height.sum()
    val b = height.average()
    return Pair(a,b)
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name: String, var age: Int, var height: Double, var weight: Double){

}
fun human(){
    val person1 = Person("Rita",20,5.6,50.0)
    val person2 = Person("Joy",30,5.6,70.8)
    val person3 = Person("Mercy",50,5.5,60.5)

    val givenHuman = listOf(person1,person2,person3)
    val man = givenHuman.sortedByDescending {p -> p.age}
    println(man)
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun peoples(): List<Person>{
    val person4 = Person("Bridget",20,4.5,60.0)
    val person5 = Person("Anne",40,5.7,80.8)
    return mutableListOf(person4,person5)
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.



data class Car(var registration: String, var mileage: Double)

  fun vehicles(): Double{
      val car1 = Car("KCZ 999Z ",400.0)
      val car2 = Car("KAA 001A",500.0)
      val car3 = Car("KAZ 999Z",600.0)
      val car4 = Car("KDA 001A",700.0)
      val car5 = Car("KDZ 999Z",800.0)

      val carList = mutableListOf(car1,car2,car3,car4)
      val getavg = listOf(car1.mileage, car2.mileage, car3.mileage, car4.mileage, car5.mileage)
      return (getavg.average())
  }
