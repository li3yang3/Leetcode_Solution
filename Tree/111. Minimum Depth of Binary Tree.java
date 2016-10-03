111. Minimum Depth of Binary Tree 

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.



递归法：
public class Solution {
    public int minDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int leftH = minDepth(root.left);
    int rightH = minDepth(root.right);
    if(leftH == 0 && rightH != 0){
        leftH = rightH;
    }
    if(leftH != 0 && rightH == 0){
        rightH = leftH;
    }
    return 1 + Math.min(leftH,rightH);
    }
}

迭代法：
public int minDepth(TreeNode root) {
  if (root == null) return 0;
  Queue<TreeNode> q = new LinkedList<>();
  q.add(root);
  TreeNode rightMost = root;
  int depth = 1;
  while (!q.isEmpty()) {
    TreeNode node = q.poll();
    if (node.left == null && node.right == null) break;
    if (node.left != null) q.add(node.left);
    if (node.right != null) q.add(node.right);
    if (node == rightMost) {
        depth++;
        rightMost = (node.right != null) ? node.right : node.left;
      }
    }
        return depth;
  }
