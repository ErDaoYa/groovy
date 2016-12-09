//  list  []
// get add size instanceof 
// getAt() 下标越界null
def list = [5, 6, 7, 8]
assert list.get(2) == 7
assert list[2] == 7
assert list instanceof java.util.List
assert list.size() == 4
list.add(9)

// copy clone 
def list1 = new ArrayList(list)
assert list1 == list

def list2 = list.clone()
assert list2 == list

// get -1  index
assert list[-1] == 9
list.set(4,99)
assert list[-1] == 99

try{
	println list.get(5)
}catch(e){
	assert e instanceof IndexOutOfBoundsException
}
assert list.getAt(5) == null

// 空list false
assert ![]   



