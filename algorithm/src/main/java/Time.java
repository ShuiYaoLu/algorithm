import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Time {

    float startTime;
    float endTime;


    public Time(float startTime, float endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Time{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time time)) return false;
        return Float.compare(time.startTime, startTime) == 0 && Float.compare(time.endTime, endTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }


}
