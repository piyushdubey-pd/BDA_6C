object MyClass{
    
    def main(args: Array[String])
    {
        val fruits: List[String] = List("Hello", "World", "This", "is", "scala");
        val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        val empty: List[Nothing] = List();
        
        for(value <- fruits)
        {
            println(value);
        }
        
        println();
        
        for(value <- numbers)
        {
            println(value);
        }
        
        println();
        
        for(value <- empty)
        {
            println(value);
        }
    }
}

//output

// Hello
// World
// This
// is
// scala

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
