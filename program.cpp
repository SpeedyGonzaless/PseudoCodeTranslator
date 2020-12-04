#include <vector>

std::vector<int> InsetSort(std::vector<int> a) {
	int i=1;
	while (i < 10) {
		int elem=a[i];
		int loc=i - 1;
		while (loc >= 0 && a[loc] > elem) {
			a[loc + 1]=a[loc];
			loc=loc - 1;
		}		
		a[loc + 1]=elem;
		i=i + 1;
	}	
	return a;
}

float findMaxBiggerThanElem(std::vector<float> array, float elemCompare) {
	float max=-1;
	for (auto elem : array) {
		if (elem > elemCompare) {
			max=elem;
		}		
	}	
	return max;
}

int main() {
	int size=10;
	std::vector<float> floatArray(size);
	map(std::string, int )stringToIntMap;
	for (auto i=0; i < size; i++) {
		floatArray[i]=i;
	}	
	float maxValue=findMaxBiggerThanElem(floatArray, 10);
	
	if (maxValue < 100) {
		maxValue=size;
	} else {
		maxValue=100;
	}	
	return 0;
}
