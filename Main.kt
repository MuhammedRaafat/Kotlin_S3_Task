fun main() {
    //1: Ask the user to enter one integer (Int).
    println("Enter Your Integer Value.")
    var intNum:Int = readln().toInt()

    //2: Ask the user to enter one double (Double).
    println("Enter Your Double Value")
    var doubleNum:Double = readln().toDouble()

    //3: Calculate the quotient of the double divided by the integer.
    val divResult:Double = doubleNum / intNum

    //4: Calculate the remainder when the integer is divided by 3.
    val remDef:Double = doubleNum % 3

    //5: Print the results of both calculations.
    println("The result of $doubleNum / $intNum = $divResult \n" +
            "The remainder of $doubleNum / 3 = $remDef ")

    //6: Check if the double is greater than the integer.
    val isGreater:Boolean = doubleNum > intNum

    //7: Print the result of this comparison.
    println("Double value > Integer Value: $isGreater")

    //8: check if the double is greater than 5 and the integer is greater than 5.
    //9: check if the double is greater than 5 or the integer is greater than 5.
    //10: Print the results of these logical operations.
    println("The Integer > 5: ${intNum > 5}\n"+
            "The Double > 5: ${doubleNum > 5}\n"+
            "Both > 5: ${intNum > 5 && doubleNum > 5}\n"+
            "one of them > 5: ${intNum > 5 || doubleNum > 5}")


    //11: Prompt the user to enter an email address.
    println("Please Enter a valid Email Address")
    val email = readln()

    //12: Validate the entered email using a regular expression (regex).
    val emailRegex =Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\$")
    val validation:Boolean = email.matches(emailRegex)

    //13: Print whether the entered email is valid or not.
    println("The validation of The Email: $email is $validation")
}