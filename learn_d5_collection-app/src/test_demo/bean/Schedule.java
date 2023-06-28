package test_demo.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate today;
    //上午
    private boolean morning;  // 是否看诊
    private LocalTime m_start;
    private LocalTime m_end;
    private int mTotalNumber;
    private int mAppointNumber;

    private LocalTime a_end;
    private int aTotalNumber;
    private int aAppointNumber;

    // 下午
    private boolean afternoon; //是否看诊
    private LocalTime a_start;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getM_start() {
        return m_start;
    }

    public void setM_start(LocalTime m_start) {
        this.m_start = m_start;
    }

    public LocalTime getM_end() {
        return m_end;
    }

    public void setM_end(LocalTime m_end) {
        this.m_end = m_end;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getA_start() {
        return a_start;
    }

    public void setA_start(LocalTime a_start) {
        this.a_start = a_start;
    }

    public LocalTime getA_end() {
        return a_end;
    }

    public void setA_end(LocalTime a_end) {
        this.a_end = a_end;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }


}
