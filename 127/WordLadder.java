public class WordLadder {

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        int res = 1;

        Queue<String> q = new LinkedList<String>();
        q.add(beginWord);
        wordList.remove(beginWord);

        while(!q.isEmpty()) {
            int size = q.size();

            for (int k = 0; k < size; k++) {
                String s = q.poll();

                if (s.equals(endWord)) return res;

                StringBuilder sb = new StringBuilder(s);
                for (int i = 0; i < beginWord.length(); i++) {
                    char c = sb.charAt(i);

                    for (char j = 'a'; j <= 'z'; j++) {
                        sb.setCharAt(i, j);
                        String ss = new String(sb);

                        if (wordList.contains(ss)) {
                            q.add(ss);
                            wordList.remove(ss);
                        }
                    }

                    sb.setCharAt(i, c);
                }
            }
            res++;
        }

        return 0;
    }

}