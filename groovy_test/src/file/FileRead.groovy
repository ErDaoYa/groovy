package file
/**
 * @Description
 * @author zhaozhou
 * @date 2016/12/8
 */

// read file
new File('../README.md').eachLine {
    line, nb -> println "line $nb:$line"
}

// 如果遇到异常，groove会自动关闭资源
def count = 0, MAXSIZE = 100
new File("../README.md").withReader { reader ->
    while (reader.readLine()) {
        if (++count > MAXSIZE) {
            throw new RuntimeException('Jenkins,groovy should only have 3 verses')
        }
    }
}

// 把每一行搜集到集合list中
def list = new File("../README.md").collect{ it }
println list

// 把每一行搜集到数组中
def array = new File("../README.md") as String[]
println(array)

// 文件变成byte
byte[] contents = new File("../README.md").bytes

// InputStream
new File("../README.md").withInputStream { stream ->
    // do something ...
}