
object MyClass {
    
    def main(args: Array[String]) {
        println("This program prints the largest of two numbers: ");
        
        val a = scala.io.StdIn.readInt();
        val b = scala.io.StdIn.readInt();
        
        if(a == b)
        {
            println("Both the numbers are equal");
        }
        else if(a > b)
        {
            println(a + " is greater than " + b);
        }
        else
        {
            println(b + " is greater than " + a);
        }
        
        
    }
}
