# HACKERRANK - TREE: LEVEL ORDER TRAVERSAL
# QUESTION LINK - "https://www.hackerrank.com/challenges/tree-level-order-traversal/problem"

def levelOrder(root):
    if root is None:
        return

    queue = [root]

    while queue:
        current = queue.pop(0)
        print(current.info, end=" ")

        if current.left:
            queue.append(current.left)
        if current.right:
            queue.append(current.right)
