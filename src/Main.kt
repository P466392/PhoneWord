//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Please enter a number: ")
    var word = readln()

    for (char in word) {
        when (char) {
            'a', 'b', 'c', 'A', 'B', 'C' -> {
                print("2")
            }
            'd', 'e', 'f', 'D', 'E', 'F' -> {
                print("3")
            }
            'g', 'h', 'i', 'G', 'H', 'I' -> {
                print("4")
            }
            'j', 'k', 'l', 'J', 'K', 'L' -> {
                print("5")
            }
            'm', 'n', 'o', 'M', 'N', 'O' -> {
                print("6")
            }
            'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S' -> {
                print("7")
            }
            't', 'u', 'v', 'T', 'U', 'V' -> {
                print("8")
            }
            'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z' -> {
                print("9")
            }
            else -> {
                print("$char")
            }
        }
    }
}