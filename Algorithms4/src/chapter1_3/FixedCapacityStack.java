package chapter1_3;

public class FixedCapacityStack<Item> {
    private Item[] a; // stack entries
    private int N; // size

    public FixedCapacityStack(int n) {
//        a = new Item[n];  // 错误
        a = (Item[]) new Object[n];  // 强制转换成Item[]类型
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
     * 将大小为 N <= max 的栈移动到一个新的max大小的数组中
     * @param max
     */
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) temp[i] = a[i];
        a = temp;
    }

    /**
     * push元素
     * @param item
     */
    public void push (Item item) {
        if (N == a.length) resize(a.length * 2);
        a[N++] = item;
    }

    /**
     * 弹出最近添加的Item
     * @return
     */
    public Item pop() {
        Item item = a[--N];
        a[N] = null; // 避免对象游离
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }
}
