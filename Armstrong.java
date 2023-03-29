class Armstrong
{
public static void main(String args[])
{
int m = 153;
int temp = m;
int p = 0;
while (m > 0) {
int rem = m % 10;                                                                                                                                                                                                                                                                    
p = (p) + (rem * rem * rem);
m = m / 10;
}
if (temp == p) 
{
System.out.println("Yes. It is Armstrong No.");
}
else 
{
System.out.println("No. It is not an Armstrong No.");
}
}
}

