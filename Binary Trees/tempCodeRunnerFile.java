
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maximum(root.left), maximum(root.right)));
    }
