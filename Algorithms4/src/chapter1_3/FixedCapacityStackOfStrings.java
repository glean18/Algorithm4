package chapter1_3;

/**
 * 定容字符串栈
 */
public class FixedCapacityStackOfStrings {
    private String[] a; // stack entries
    private int N; // size

    public FixedCapacityStackOfStrings(int n) {
        a = new String[n];
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 字符串数量
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * push元素
     * @param item
     */
    public void push (String item) {
        a[N++] = item;
    }

    /**
     * 弹出最近添加的String
     * @return
     */
    public String pop() {
        return a[--N];
    }
}
