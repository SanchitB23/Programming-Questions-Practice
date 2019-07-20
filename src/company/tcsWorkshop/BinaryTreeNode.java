package company.tcsWorkshop;

class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> left, right;

    T getData() {
        return data;
    }

    void setData(T data) {
        this.data = data;
    }

    BinaryTreeNode<T> getLeft() {
        return left;
    }

    void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    BinaryTreeNode<T> getRight() {
        return right;
    }

    void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

}
