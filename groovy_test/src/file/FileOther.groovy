package file

import groovy.io.FileType
import groovy.io.FileVisitResult

/**
 * @Description
 * @author zhaozhou
 * @date 2016/12/8
 */
// 列出目录下所有文件和目录
File dir = new File(".")
dir.eachFile { file ->
    println file.name
}

// 列出目录下所有.txt文件
dir.eachFileMatch(~/.*\.txt/) { file ->
    println file.name
}


dir.eachFileRecurse { file ->
    println file.name
}

// 只列出文件
dir.eachFileRecurse(FileType.FILES) { file ->
    println file.name
}


// 更多复杂操作
dir.traverse { file ->
    if (file.directory && file.name == 'bin') {
        // 如果遇到bin目录，停止遍历
        FileVisitResult.TERMINATE
    } else {
        println file.name
        FileVisitResult.CONTINUE
    }

}