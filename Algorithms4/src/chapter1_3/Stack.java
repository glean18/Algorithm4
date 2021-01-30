package chapter1_3;

import java.util.Iterator;

/**
 * 下压堆栈（链表实现）
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {
    // 节点嵌套类
    private class Node {
        Item item;
        Node next;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
