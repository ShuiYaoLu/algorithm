public class Start {

    public static float TimeMerge (float t1, float t2,float t3,float t4){
        float t;
        float tt1=t2-t1;
        float tt2=t4-t3;
        float tt3=t1,tt4=t2,tt5=t3,tt6=t4;
        if(tt2>tt1){
            tt3=t3;
            tt4=t4;
            tt5=t1;
            tt6=t2;
        }//保障tt4-tt3永远大于tt6-tt5
        if(tt4>=tt5){
            t=(tt4-tt3)+(tt6-tt5);
        }else if(tt3>=tt5&&tt6>=tt4){
            t=tt4-tt3;
        }else t = (tt4 - tt3) + (tt6 - tt5) - (tt4 - tt5);
        return t;
    }
    public static void main(String[] args) {
    Time time1=new Time(12,13);
    Time time2=new Time(11,11.5F);
    float h=TimeMerge(time1.startTime,time1.endTime,time2.startTime,time2.endTime);
        System.out.println(h);
    }
}
