#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
	int val = n;
	for(int curr_row = 1; curr_row <= n; curr_row++)
	{
        // Handle numbers for each row
	    for(int curr_col = val; curr_col >= 1; curr_col--)
	    {
	        printf("%d", curr_col);
	    }
	    val--;
	    printf("\n");
	}
	return 0;
}