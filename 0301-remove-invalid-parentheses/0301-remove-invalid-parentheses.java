import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int remOpen = 0, remClose = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                remOpen++;
            } else if (c == ')') {
                if (remOpen > 0) {
                    remOpen--;
                } else {
                    remClose++;
                }
            }
        }

        Set<String> res = new HashSet<>();
        solve(s, 0, remOpen, remClose, res);
        return new ArrayList<>(res);
    }

    public void solve(String s, int start, int remOpen, int remClose, Set<String> res) {
        if (remOpen == 0 && remClose == 0) {
            if (isValid(s)) {
                res.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (i > start && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            char c = s.charAt(i);
            if (remClose > 0 && c == ')') {
                String next = s.substring(0, i) + s.substring(i + 1);
                solve(next, i, remOpen, remClose - 1, res);
            }
            else if (remOpen > 0 && c == '(') {
                String next = s.substring(0, i) + s.substring(i + 1);
                solve(next, i, remOpen - 1, remClose, res);
            }
        }
    }

    public boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }
}