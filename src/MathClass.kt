import java.util.Scanner


    fun main (args: Array<String>)

    {
       // დავალება 1
     println("Greatest common divider of two numbers is: ${dividingNumbers(a = 81, b = 153)}")


        //დავალება 2
        println("${leastCommonMultiple(a = 81, b = 153)}")

        // დავალება 3
        val scann = Scanner(System.`in`)
        println("Enter text: ")
        val text:String = scann.nextLine()
        val checkingText = checkingCharacter()
        println("$checkingText")

       //დავალება 4
        println("Sum of numbers from 1 till 100 is: ${sumOfEvenNumbers()}")


        //დავალება 5
        val scanner = Scanner(System.`in`)
        println("Enter number: ")
        val inNumber:Int = scanner.nextInt()
        val reverseNumber = reversingNumber(inNumber)
        println("Reverse Number is: $reverseNumber")


        // დავალება 6
        val sc = Scanner(System.`in`)
        println("Enter String: ")
        val inString: String = sc.nextLine()
        if (isPalindrome(inString))
        {
            println("$inString is a Palindrome String")
        } else
        {
            println("$inString is not a Palindrome String")
        }
    }



    //დავალება 1
    fun dividingNumbers(a:Int,b:Int)
    {
        var a = 81
        var b = 153
        while (a != b)
        {
           if (a > b)
               a -=b
            else
                b -= a
        }
    }

    //დავალება 2

    fun leastCommonMultiple(a:Int,b:Int)
    {
        val a = 72
        val b = 120
        var lcm:Int

        lcm = if (a > b) a
                else b

        while (true){
            if (lcm % a == 0 && lcm % b == 0 )
            {
                println("The least common multiple of $a and $b is $lcm")
                break
            }
            ++lcm
        }
    }

    //დავალება 3
    fun checkingCharacter():Boolean{
        var text:String = ""
        var char:Char = '$'
        val result = text.contains(char)
        return result
    }

    // დავალება 4
    fun sumOfEvenNumbers():Int
    {
        val total = (1..100).filter { it % 2 == 0 }.sum()
        return total
    }

  // დავალება 5
    fun reversingNumber(number: Int):Int
    {
        var a = number
        var sum = 0

        while (number > 0) {
            val b = number % 10
            sum = sum * 10 + b
            a /= 10
        }
        return sum
    }

   // დავალება 6
    fun isPalindrome(inputString: String):Boolean
    {
        val sb = StringBuilder(inputString)
        val reverseString = sb.reverse().toString()
        return inputString.equals(reverseString,ignoreCase = true)
    }
