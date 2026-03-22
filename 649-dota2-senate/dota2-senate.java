public class Solution {
    public String predictPartyVictory(String senate) {
        List<Character> s = new ArrayList<>();
        for (char c : senate.toCharArray()) {
            s.add(c);
        }

        while (true) {
            int i = 0;
            while (i < s.size()) {
                if (!s.contains('R')) {
                    return "Dire";
                }
                if (!s.contains('D')) {
                    return "Radiant";
                }
                if (s.get(i) == 'R') {
                    int j = (i + 1) % s.size();
                    while (s.get(j) == 'R') {
                        j = (j + 1) % s.size();
                    }
                    s.remove(j);
                    if (j < i) {
                        i--;
                    }
                } else {
                    int j = (i + 1) % s.size();
                    while (s.get(j) == 'D') {
                        j = (j + 1) % s.size();
                    }
                    s.remove(j);
                    if (j < i) {
                        i--;
                    }
                }
                i++;
            }
        }
    }
}