#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
	for(int factor = 1; factor <= n; factor++){
	   if(n % factor == 0){
	        printf("%d\n", factor);  
	   }
	}
	return 0;
}