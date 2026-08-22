class Solution { 
    public boolean checkDivisibility(int n) { 
        int m = n; 
        int digSum = 0; 
        int digMul = 1; // Must start at 1 for multiplication
        
        while (m > 0) { 
            int digit = m % 10;
            digSum += digit; 
            digMul *= digit; 
            m = m / 10; 
        } 
        
        // Check if n is completely divisible by (sum + product)
        return n % (digSum + digMul) == 0; 
    } 
}
