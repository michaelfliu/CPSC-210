public class WordTree {
    public String wd;
    public int count;
    public WordTree left, right;

    public WordTree(String wd) {
        this.wd = wd;
        this.left = null;
        this.right = null;
    }
}
