#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
    
	for(int curr_row = 1; curr_row <= n; ++curr_row)
	{
	    for(int curr_col = 1; curr_col <= n; ++curr_col)
        {
	        if((curr_row == curr_col) ||
	          (curr_row + curr_col == n + 1))
	        {
	            printf("*");
	        }
            
	        else
	        {
	            printf(" ");
	        }
	    }
	    printf("\n");
	}
	return 0;
}