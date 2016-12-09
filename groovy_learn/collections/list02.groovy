// list 遍历
def list = ['A','B','C','D']

list.each{
	print "Item: $it"
}

list.eachWithIndex{
	it,index ->print "$index:$it"
}

// 创建新list
def list2 = list.collect{
	it + "1"
}

assert [1, 2, 3]*.multiply(2) == [1, 2, 3].collect { it.multiply(2) }