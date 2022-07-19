
object MyClass {
    
    def main(args: Array[String]) {
        println("Enter a number");
        
        val a = scala.io.StdIn.readInt();
        
        if(a == 0)
        {
            println("Number is 0");
        }
        else if(a > 0)
        {
            println("Number is positive");
        }
        else
        {
            println("Number is negative");
        }
    
        
    }
}
