class Solution {
    public String convertToTitle(int columnNumber) {
    StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-based indexing
            char ch = (char) ('A' + (columnNumber % 26));
            result.insert(0, ch);
            columnNumber /= 26;
        }

        return result.toString();
    }
}