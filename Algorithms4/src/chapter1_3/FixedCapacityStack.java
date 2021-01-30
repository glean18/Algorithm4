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
     * push元素
     * @param item
     */
    public void push (Item item) {
        a[N++] = item;
    }

    /**
     * 弹出最近添加的Item
     * @return
     */
    public Item pop() {
        return a[--N];
    }
}
