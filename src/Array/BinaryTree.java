//package Array;
//
//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BinaryTree {
//
//    public boolean isSysmatric (TreeNode root){
//
//        if (root == null || (root.left == null && root.right == null)) return  true;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root.left);
//        q.offer(root.right);
//        while (!q.isEmpty()){
//            TreeNode t1 = q.poll();
//            TreeNode t2 = q.poll();
//
//            if(t1 == null && t2 == null) continue;
//            if (t1 == null || t2 == null || t1.val !=  t2.val) return false;
//
//            q.offer(t1.left);
//            q.offer(t2.right);
//            q.offer(t1.right);
//            q.offer(t2.right);
//        }
//
//        return  true;
//
//    }
//
//
//
//    ///////////
//
//    boolean isSysmentric (TreeNode root){
//        return  isMirror(root, root);
//    }
//
//    boolean isMirror (TreeNode t1, TreeNode t2){
//
//        if (t1 == null && t2 == null ) return true;
//        if (t1 == null || t2 == null ) return false;
//        return (t1.cal == t2.val) && isMirror(t1.right, t2.left)
//                                    && isMirror(t1.left, t2.right);
//
//    }
//
//
//
//}
