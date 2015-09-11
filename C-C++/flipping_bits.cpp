#include <iostream>

int main(){
	int T;
	std::cin >> T;
	for (int i = 0; i < T; ++i) {
		unsigned N;
		std::cin >> N;
		std::cout << ~N << std::endl;
	}
}