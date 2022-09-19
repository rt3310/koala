#include<stdio.h>

int main() {

	int n, sum = 0;
	scanf_s("%d", &n);

	char a[100];
	scanf_s("%s", a);
	
	for (int i = 0; i < n; i++)
	{
		
		sum += a[i]-'0';
	}
	printf("%d", sum);
}
