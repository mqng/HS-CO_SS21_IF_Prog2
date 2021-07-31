import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {

    private int count;
    private Vector<Word> words;

    public WordColl(String[] sentences) {
        words = new Vector<Word>();
        append(sentences);
    }

    public int size() {
        return count;
    }

    public int count(String s) {
        Word word = isInVector(s);
        if (word != null)
            return word.count;
        else
            return 0;
    }

    public void append(String[] sentences) {
        for (String s : sentences) {
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                addToVector(st.nextToken());
            }
        }
    }

    public void addToVector(String s) {
        Word word = isInVector(s);
        if (word != null)
            word.count++;
        else
            word = new Word(s);
        words.add(word);
        count++;
    }

    public Word isInVector(String s) {
        for (Word w : words) {
            if (w.s.equals(s))
                return w;
        }
        return null;
    }

    public String top() {
        Word topWord = words.elementAt(0);
        if (topWord != null) {
            for (Word w : words) {
                if (topWord.count < w.count)
                    topWord = w;
                
            }
            return "Top:" + topWord.s;
        }
            return null;
    }

    public String toString() {
        String s = "";
        String header = "Word Count";
        for (Word w : words) {
            
            s += w.s + " " + w.count + "\n";
        }
        return header + "\n" + s;
    }
}

class Word {
    String s;
    int count;

    Word(String s) {
        this.s = s;
        this.count = 1;
    }

    public String toString() {
        return "Word: " + s + " Count: " + count;
    }
}