// Iterating
def map = [
        Bob  : 42,
        Alice: 54,
        Max  : 33
]

// `entry` is a map entry
map.each { entry ->
    println "Name: $entry.key Age: $entry.value"
}

map.eachWithIndex { entry, i ->
    println "$i - Name: $entry.key Age: $entry.value"
}

map.each { key, value ->
    println "Name: $key Age: $value"
}
map.eachWithIndex { key, value, i ->
    println "$i - Name: $key Age: $value"
}