package com.learn.test;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    private static final int SLOTS_PER_DAY = 48; // 每日时间节点数
    private static final long MS_PER_SLOT = 30 * 60 * 1000; // 每个时间节点时长，单位：毫秒

    private LocalDate date;
    int slot; // 时间节点数量从0开始

    public DateTime(LocalDate date, int slot) {
        this.date = date;
        this.slot = slot;
    }

    public static DateTime now() {
        LocalDateTime now = LocalDateTime.now();
        LocalDate date = now.toLocalDate();
        long ms = Duration.between(
                date.atStartOfDay(), // 当天零时
                now.toLocalTime()     // 当前时刻
        ).toMillis();
        int slot = (int) (ms / MS_PER_SLOT); // 计算当前时间的时间节点
        return new DateTime(date, slot);
    }

    public boolean isBefore(DateTime other) {
        if (date.isBefore(other.date)) return true;
        if (date.isAfter(other.date)) return false;
        // 同一天的情况下，只有时间点编号才能判断先后
        return slot < other.slot;
    }

    public DateTime plusSlots(int slots) {
        int newSlot = this.slot + slots;
        int newDay = date.getDayOfMonth();
        if (newSlot >= SLOTS_PER_DAY) {
            newSlot -= SLOTS_PER_DAY;
            newDay += 1;
        }
        LocalDateTime newDateTime = LocalDateTime.of(date.getYear(), date.getMonth(), newDay,
                newSlot / 2, (newSlot % 2) * 30, 0);
        return new DateTime(newDateTime.toLocalDate(), newSlot);
    }

    @Override
    public String toString() {
        return date + " " + String.format("%02d:%02d", slot / 2, (slot % 2) * 30);
    }
}