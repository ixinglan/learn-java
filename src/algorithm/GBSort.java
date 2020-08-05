package algorithm;

/**
 * @description:
 * @author:zhaojq
 */
public class GBSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 4, 1, 8};
        ListNode rootNode = new ListNode();
        rootNode.setVal(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            treeSort(arr[i], rootNode);
        }

        print(rootNode);
    }

    public static void treeSort(int val, ListNode node) {
        if (val < node.val) {
            if (node.getLeft() == null) {
                node.setLeft(new ListNode(val));
            } else if (node.getLeft() != null) {
                treeSort(val, node.getLeft());
            }
        }

        if (val > node.val) {
            if (node.getRight() == null) {
                node.setRight(new ListNode(val));
            } else if (node.getRight() != null) treeSort(val, node.getRight());
        }
    }

    public static void print(ListNode node) {
        System.out.println(node.getVal());
        if (node.getLeft() != null) {
            print(node.getLeft());
        }
        if (node.getRight() != null) {
            print(node.getRight());
        }
    }
}

class ListNode {
    int val;
    ListNode left;
    ListNode right;

    public int getVal() {
        return val;
    }

    public ListNode getLeft() {
        return left;
    }

    public void setLeft(ListNode left) {
        this.left = left;
    }

    public ListNode getRight() {
        return right;
    }

    public void setRight(ListNode right) {
        this.right = right;
    }

    ListNode() {

    }

    public void setVal(int val) {
        this.val = val;
    }

    ListNode(int val) {
        this.val = val;
    }
}
