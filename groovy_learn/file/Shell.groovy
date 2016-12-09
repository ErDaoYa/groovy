package file

/**
 * @Description 执行*nix命令。window如果安装了*nix客户端。
 * @author zhaozhou
 * @date 2016/12/8
 */

// 命令字符串.execute()
// execute() method returns a java.lang.Process
//  allow the in/out/err streams
def process = "ls -l".execute()

// 执行结果 .text
// println "Found text ${process.text}"
process.in.eachLine {
    line -> println line
}