#include <stdio.h>
int n, k;
int result;
int main(void) {
	scanf("%d %d", &n, &k );
	while (1) {

		if ((n % k) == 0 ) {
			n /= k; 
		} else {
			n = n -1; 
		}
		result++; 
		if (n < k) break;
	}

	result += (n - 1);
	printf("%d", result);
	return 0; 
}