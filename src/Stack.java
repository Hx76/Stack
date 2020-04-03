/**
 * @author Administrator
 */
public class Stack {
    /**
     *  存储数据的字符数组
     */
    private char[] chars = null;
    /**
     *  栈的大小
     */
    private int size;
    /**
     *  栈顶指针
     */
    private int top = -1;

    Stack(int size){
        this.size = size;
        chars = new char[this.size];
    }

    /**
     *  打印栈
     */
    void printStack(){
        for (var i = 0;i < top+1;i++){
            System.out.print(chars[i]+",");
        }
        System.out.println();
    }

    /**
     *  入栈
     */
    void push(char c){
        if (isFull()){
            System.out.println("栈内元素已满！");
        }else {
            chars[top+1] = c;
            top++;
        }
    }

    /**
     *  出栈
     */
    void pop(){
        if (isEmpty()){
            System.out.println("当前栈内没有元素");
        }else {
            top--;
        }
    }

    /**
     *  获取栈顶元素
     */
    char peek(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("当前栈内没有元素");
        }
        return chars[top];
    }

    /**
     *  判断栈是不是空
     */
    boolean isEmpty(){
        return top == -1;
    }

    /**
     *  判断栈是不是满
     */
    boolean isFull(){
        return size == top;
    }
}
