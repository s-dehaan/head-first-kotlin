 fun main(args: Array<String>) {
     var x = 0
     var y = 20
     for (outer in 1..3) {
         for (inner in 4 downTo 2) {
             // custom insert
             x = y
             y++


             y++
             x += 3
         }
         y -= 2
     }
     println("$x $y")
 }