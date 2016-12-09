// an inclusive range
def range = 5..8
assert range instanceof java.util.List
println range

range = 5..<8

range = 1..10
assert range.from == 1
assert range.to == 10

range = 'a'..'z'

// 

for (i in 1..10) {
    print "${i} "
}
(1..10).each { i ->
    println "Hello ${i}"
}

switch (years) {
    case 1..10: interestRate = 0.076; break;
    case 11..25: interestRate = 0.052; break;
    default: interestRate = 0.037;
}