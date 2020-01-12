package p46孩子们的游戏;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 9:31
 * @Author SonnSei
 */
public class Solution {
    /**
     * 循环链表
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution2(int n, int m) {
        Children children = new Children(n);
        Child begin = children.getHead();
        while (children.size > 1) {
            int count = 0;
            while (count < m - 2) {
                count++;
                begin = begin.next;
            }
            children.removeChild(begin);
            if(children.size==1)return begin.index;
            begin = begin.next;
        }
        return -1;
    }

    // Node
    class Child{
        int index;
        Child next;
        public Child(int index){
            this.index = index;
        }
    }

    // 循环链表
    class Children{
        private Child head;
        int size;
        public Children(int n){
            size = n;
            head = new Child(0);
            Child point = head;
            for(int i = 1;i<n;i++){
                Child child = new Child(i);
                point.next = child;
                point = point.next;
            }
            point.next = head;
        }
        public Child getHead(){
            return head;
        }

        public void removeChild(Child pre){
            Child del = pre.next;
            pre.next = del.next;
            del.next = null;
            size--;
        }
    }

    /**
     * 数学方法，约瑟夫环
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0)
            return -1;
        if(n == 1)
            return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }

}
