public class Start {

    public static int TimeMerge(float t1, float t2, float t3, float t4) {
        // t=0这一行没有参与运算，写完检查一下，有没有不需要的内容，把他删掉
        float t = 0;
        float tt1 = t2 - t1;
        float tt2 = t4 - t3;
        float tt3 = t1, tt4 = t2, tt5 = t3, tt6 = t4;
        if (tt2 > tt1) {
            tt3 = t3;
            tt4 = t4;
            tt5 = t1;
            tt6 = t2;
        }//保障tt4-tt3永远大于tt6-tt5
        if (tt4 >= tt5) {
            t = (tt4 - tt3) + (tt6 - tt5);
        } else if (tt3 >= tt5 && tt6 >= tt4) {
            t = tt4 - tt3;
        } else t = (tt4 - tt3) + (tt6 - tt5) - (tt4 - tt5);

        // return的值是你在函数名上定义的，
        // 【public static int TimeMerge(float t1, float t2, float t3, float t4)】中的int是你的返回值，需要你定义成float
        // 改为【public static float TimeMerge(float t1, float t2, float t3, float t4)】
        return (int) t;//如何return小数
    }

    public static void main(String[] args) {
        Time time1 = new Time(12, 13);
        Time time2 = new Time(11, 11.5F);
        int h = TimeMerge(time1.startTime, time1.endTime, time2.startTime, time2.endTime);
        System.out.println(h);
    }
}
