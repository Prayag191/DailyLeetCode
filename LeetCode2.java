class LeetCode2 {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }

    // Main method to run and test
    public static void main(String[] args) {
        LeetCode2 obj = new LeetCode2();
        String roman = "LVIII";
        int result = obj.romanToInt(roman);
        System.out.println("Roman numeral: " + roman);
        System.out.println("Integer value: " + result);
    }
}
