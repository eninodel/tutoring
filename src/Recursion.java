public class Recursion {
    public static void main(String[] args){
        System.out.println(fib(40));
        int[] test= {1,2,3,4};
        sum(test, 0);
    }

    // 0,1,1,2,3,5,8,13,21
    public static int fib(int i){
        if(i < 2){
            return i;
        }
        return fib(i - 1) + fib(i - 2);
    }

    public static int sumItr(int[]a){
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return sum;
    }

    public static int sum(int[] a, int i){
        if(a.length > i){
            return a[i] + sum(a, i + 1);
        }
        return 0;
    }
    // a[0] + sum(a, 1) => a[0] + a[1] +  a[2] + a[3] + 0
    // sum(a, 1) = a[1] + sum(a, 2) => a[1] + a[2] + a[3] + 0
    // sum(a, 2) = a[2] + sum(a,3) => a[2] + a[3] + 0
    // sum(a,3) = a[3] + sum(a,4)
    // sum(a,4) = 0
}
