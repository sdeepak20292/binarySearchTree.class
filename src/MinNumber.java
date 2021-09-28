public class MinNumber {

    public static int termDivisible(int a, int b, int num){
        int lcm = a*b;
        return num/a + num/b - num/lcm;
    }

//    public static int nMinTerm(int a, int b, int n){
//        int low = 1;
//        int lcm = a*b;
//        int high = lcm*n;
//
//        while(low < high){
//            int mid = low + (high - low)/2;
//            if(termDivisible(a, b, lcm, mid) < n){
//                low = mid + 1;
//            }
//
//            else if(termDivisible(a, b, lcm , mid) == n){
//                return mid;
//
//            }
//
//            else{
//                high = mid - 1;
//            }
//        }
//
//        return -1;
//    }

    public static int nMinTerm(int a, int b, int n, int low, int high){
        if(low < high){
            int mid = (low + (high - low)/2);

            if(termDivisible(a, b, mid) == n){
                return mid;

            }
            if(termDivisible(a, b, mid) > n){
                return nMinTerm(a, b, n, 1, mid - 1);
            }

            return nMinTerm(a, b, n, mid + 1, high);

        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(nMinTerm(2, 5, 10, 1, 2*5*10));
    }
}
