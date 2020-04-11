package 并发泛型反射.线程;

/**
 * @ClassName Punishment
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 20:24
 */
public class Punishment {
    private int leftCopyCount;
    private String wordToCopy;

    public Punishment(int leftCopyCount, String wordToCopy) {
        this.leftCopyCount = leftCopyCount;
        this.wordToCopy = wordToCopy;
    }

    public int getLeftCopyCount() {
        return leftCopyCount;
    }

    public void setLeftCopyCount(int leftCopyCount) {
        this.leftCopyCount = leftCopyCount;
    }

    public String getWordToCopy() {
        return wordToCopy;
    }

    public void setWordToCopy(String wordToCopy) {
        this.wordToCopy = wordToCopy;
    }
}