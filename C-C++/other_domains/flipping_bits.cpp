#include <iostream>
using namespace std;

int main(){
	int T;
	cin >> T;
	for (int i = 0; i < T; ++i) {
		unsigned N;
		cin >> N;
		cout << ~N << endl;
	}
}