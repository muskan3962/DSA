class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorderIterative(root, arr);
        return build(arr, 0, arr.size() - 1);
    }

    private void inorderIterative(TreeNode root, List<Integer> arr) {
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            arr.add(root.val);
            root = root.right;
        }
    }

    private TreeNode build(List<Integer> arr, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode node = new TreeNode(arr.get(mid));
        node.left = build(arr, l, mid - 1);
        node.right = build(arr, mid + 1, r);
        return node;
    }
}
