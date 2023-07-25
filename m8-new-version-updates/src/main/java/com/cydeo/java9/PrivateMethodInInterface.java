package com.cydeo.java9;

import java.time.LocalDate;
import java.util.Locale;

public interface PrivateMethodInInterface {

    boolean idHoliday(LocalDate date);

    default boolean idBusinessDay(LocalDate date) {
        validate(date);
        return !idHoliday(date);
    }

    default LocalDate nextDay(LocalDate date) {
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return idHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }


        private void validate(LocalDate date){
            if (date.isBefore(LocalDate.of(2001, 1, 1))) {
                throw new IllegalArgumentException();
            }
        }

}