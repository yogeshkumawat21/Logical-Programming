public class Main {
    static void checkPalindrome(int n) {
        int temp = n;
        int rem, newNo = 0;
        
        while (temp > 0) {
            rem = temp % 10;
            newNo = (newNo * 10) + rem;
            temp = temp / 10;
        }
        
        if (n == newNo) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        int n = 153;
        checkPalindrome(n);
    }
}

