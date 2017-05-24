package Algorithm;

/**
 * Project: LearnJava
 * Package: Algorithm
 * Author:  Novemser
 * 2017/5/5
 */
public class SegmentTree {
    private int[] data;
    private int[] segmentTree;

    public SegmentTree(int[] data) {
        this.data = data;
        int height = (int) Math.ceil(Math.log(data.length) / Math.log(2));
        int size = (int) (Math.pow(2, height)) * 2 - 1;
        segmentTree = new int[size];
//        constructSTUtil(data, 0, data.length - 1, 0);
        constructTree(0, data.length - 1, 0);
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 5, 7, 9, 11};
        SegmentTree tree = new SegmentTree(data);
        String s = null;
        System.out.println(s);
    }

    public int constructTree(int ss, int se, int current) {
        if (ss == se) {
            segmentTree[current] = data[se];
            return data[se];
        }

        int mid = (ss + se) >> 1;
        segmentTree[current] = constructTree(ss, mid, current * 2 + 1) + constructTree(mid + 1, se, current * 2 + 2);
        return segmentTree[current];
    }

//    public TreeNode constructTree(int start, int end) {
//        if (start == end) {
//            TreeNode node = new TreeNode();
//            node.val = data[start];
//            return node;
//        }
//        int mid = (start + end) >> 1;
//        TreeNode left = constructTree(start, mid);
//        TreeNode right = constructTree(mid + 1, end);
//        TreeNode cur = new TreeNode();
//        cur.val = left.val + right.val;
//        cur.left = left;
//        cur.right = right;
//        return cur;
//    }
//
//    class TreeNode {
//        public int val;
//        public TreeNode left;
//        public TreeNode right;
//    }
}
