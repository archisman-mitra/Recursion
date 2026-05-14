import java.util.*;
public  class Recursion {
// Print Name N times using Recursion
// Problem Description: Given an integer N, write a program to print your name N times.
    public static void printName(String name,int n, int count)
    {
        if (count==n)
            return;
        System.out.println(name);
        printName(name,n,count+1);
    }
// Print 1 to N using Recursion
// Problem Description: Given an integer N, write a program to print numbers from 1 to N.
    public static void print1toN(int n)
    {
        if (n==0)
            return;
        print1toN(n-1);
        System.out.print(n + " ");
    }
// Print N to 1 using Recursion
// Problem Description: Given an integer N, write a program to print numbers from N to 1.
    public static void printNto1(int n)
    {
        if (n==0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }
// Sum of first N Natural Numbers
// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers.
    public static int sumOfN(int n)
    {
        if  (n==1)
            return 1;
        return n+sumOfN(n-1);
    }
// Factorial of a Number : Iterative and Recursive
// Problem Statement: Given a number X,  print its factorial.
// To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
// Note: X  is always a positive number.
    public static int factorial(int n)
    {
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }
// Reverse a given Array
// Problem Statement: You are given an array. The task is to reverse the array and print it.
    public static void reverseArray(int arr[], int l, int r)
    {
        if (l>=r)
            return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverseArray(arr, l+1, r-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter number of times you want to print your name: ");
        int no=sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        int c=0;
        printName(name,no,c);
        */
        System.out.println(); // print a newline after printing the name
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        //printNto1(n);
        //System.out.println("Sum of first " +n+" natural numbers is: "+sumOfN(n));
        System.out.println("Factorial of " +n+" is: "+factorial(n));
    }
}