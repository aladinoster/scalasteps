// 1
val greetStrings: Array[String] = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

// 2
val greetStrings = Array.apply("Hello",", ","world!\n")

// 3
val greetStrings = Array("Hello",", ","world!\n")

for (i <- 0 to 2)
    print(greetStrings(i))