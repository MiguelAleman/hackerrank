#include <stdio.h>
#include <stdbool.h>

// This solution doest pass because of time-out
bool mod(int n, int m){
	while(n > 0){
		n-=m;
	}
	return n == 0;
}

int main(){
	int T;
	scanf("%d", &T);
	for (int i = 0; i < T; ++i){
		int result = 0;
		int N;
		scanf("%d", &N);
		for (int j= 1; j < N; ++j) {
			if(mod(j,3) || mod(j,5)){
				result+=j;
			}
		}
		printf("%d\n", result);
	}
}