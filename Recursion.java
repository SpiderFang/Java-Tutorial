public class Recursion {

public static void main(String[] args) {
    System.out.println(f(4));
}

//function
static int f(int n) {
    if(n==1) {
        return 1;
    } else if(n==2) {
        return 3;
    } else return 3*f(n-1)+2*f(n-2)+3;
}
}
