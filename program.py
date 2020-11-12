def InsetSort(a):
	i=1
	while (i<10):
		elem=a[i]
		loc=i-1
		while (loc>=0 and a[loc]>elem):
			a[loc+1]=a[loc]
			loc=loc-1
		a[loc+1]=elem
		i=i+1
	return a

def findMaxBiggerThanElem(array,elemCompare):
	max=-1
	for elem in array:
		if (elem>elemCompare):
			max=elem
	return max

size=10
floatArray = [None] * size
for i in range(0, size):
	floatArray[i]=i
maxValue=findMaxBiggerThanElem(floatArray,10)
