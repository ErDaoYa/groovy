package file
/**
 * @Description
 * @author zhaozhou
 * @date 2016/12/8
 */
new File('haiku.txt').withWriter('utf-8') { writer ->
    writer.writeLine 'Into the ancient pond'
    writer.writeLine 'A frog jumps'
    writer.writeLine 'Water’s sound!'
}

new File('haiku.txt') << '''Into the ancient pond
A frog jumps
Water’s sound!'''