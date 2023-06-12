val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour

println(""+ oneTwo + "and " + threeFour + " are immutable")
println("Thus, "+ oneTwoThreeFour + "is new!")

/*
List(1, 2) and List(3, 4) are immutable
Thus, List(1, 2, 3, 4) is new!
*/

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val oneTwoThree = 1 :: 2 :: 3 :: Nil // prepending
println(oneTwoThree)

val emptyList = Nil // List()

// thrill(2)