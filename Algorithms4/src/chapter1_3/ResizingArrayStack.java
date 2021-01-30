package chapter1_3;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>{
    private Item[] a; // stack entries
    private int N; // size

    public ResizingArrayStack(int n) {
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
        // 数组长度改变之后，状态是半满；下次改变数组大小之前，仍能多次push和pop
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    /**
     * 嵌套类：可以访问包含它的类的实例变量（即：a[]和 N）
     * 支持先进后出的迭代
     */
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
