public class Start {

    public static void ee (float t1, float t2,float t3,float t4){
        float t=0;
        if(t2>=t3){
            t=(t2-t1)+(t4-t3);
        }else if(t1>=t3&&t4>=t2){
            t=t2-t1;
        }else if(t1>t3&&t3>t2&&t2>t4){
            t=(t2-t1)+(t4-t3)-(t2-t3);
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
    Time time1=new Time(12,13);
    Time time2=new Time(11,11.5F);
    float tt1=time1.endTime-time1.startTime;
    float tt2=time2.endTime-time2.startTime;
    float tt3=time1.startTime,tt4=time1.endTime,tt5=time2.startTime,tt6=time2.endTime;
    if(tt2>tt1){
        tt3=time2.startTime;
        tt4=time2.endTime;
        tt5=time1.startTime;
        tt6=time1.endTime;
    }//保障tt4-tt3永远大于tt6-tt5
    ee(tt3,tt4,tt5,tt6);
    }
}


