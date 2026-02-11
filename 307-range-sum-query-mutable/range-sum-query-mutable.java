class NumArray {
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            tree = new int[4 * n];
            buildTree(nums, 0, 0, n - 1);
        }
    }

    private void buildTree(int[] nums, int i, int l, int r) {
        if (l == r) {
            tree[i] = nums[l];
            return;
        }

        int mid = l + (r - l) / 2;

        buildTree(nums, 2 * i + 1, l, mid);
        buildTree(nums, 2 * i + 2, mid + 1, r);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }

    public void update(int index, int val) {
        updateTree(index, val, 0, 0, n - 1);
    }

    private void updateTree(int idx, int val, int i, int l, int r) {
        if (l == r) {
            tree[i] = val;
            return;
        }

        int mid = l + (r - l) / 2;

        if (idx <= mid) {
            updateTree(idx, val, 2 * i + 1, l, mid);
        } else {
            updateTree(idx, val, 2 * i + 2, mid + 1, r);
        }

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }

    public int sumRange(int left, int right) {
        return queryTree(left, right, 0, 0, n - 1);
    }

    private int queryTree(int st, int end, int i, int l, int r) {
        // No overlap
        if (r < st || l > end) {
            return 0;
        }

        // Complete overlap
        if (l >= st && r <= end) {
            return tree[i];
        }

        // Partial overlap
        int mid = l + (r - l) / 2;

        int leftSum = queryTree(st, end, 2 * i + 1, l, mid);
        int rightSum = queryTree(st, end, 2 * i + 2, mid + 1, r);

        return leftSum + rightSum;
    }
}
