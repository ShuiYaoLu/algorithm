public class Dog extends Animal implements Member {

    /**
     * 属性
     */
    public int leg;

    /**
     * 方法
     */
    public void eat() {
        System.out.println("wang wang wang");
    }

    /**
     * 构造方法 无参
     */
    public Dog() {
        this.leg = 1;
    }

    public Dog(int leg) {
        this.leg = leg;
    }

    // 这个方法干什么用？
    // 定义一个有参构造器，传入/接收一个String类型的参数叫head，将Dog的head属性的值赋值为head.
    public Dog(String head) {
        super.head = head;
    }

}
