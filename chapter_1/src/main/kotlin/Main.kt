fun main() {
    var x = 0
    var y = 0
    while (x < 5) {
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3

        print("$x$x ")
        x += 1
    }
}