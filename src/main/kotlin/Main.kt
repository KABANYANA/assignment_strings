//Function for sorting the characters on 1st, 3rd and 4th indices
fun Chars(str: String) {
    val result = "${str[0]}${str[2]}${str[3]}"
    println(result)
}
//Function for displaying my name and age
fun credentials(name: String, age: Int): String {
    return "Hi, my name is $name and I am $age years old."
}
//function for returning the length of a string
fun Length(str: String): Int {
    return str.length
}
//function of checking if the name is mine or not
fun NameCheck(name: String) {
    val Name = "catherine" 
    if (name == Name) {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}

//The main function
fun main(args: Array<String>) {
   Chars("Akirachix")
    println(credentials("Joyeuse",20))
    println("the length of the word is"+Length("mississippi"))
    NameCheck("Joyeuse")
    NameCheck("catherine")

}

