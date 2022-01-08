package com.sample.chapter6;

public class MethodExctract {

    public void extractVariable(){

        // Calendar c = new GregorianCalendar(Locale.KOREA);

        int num = 0;
        extracted(num);
    }

    private void extracted(int num) {
        for (int i = 0; i < 100; i++) {
            num = getNum(num, i);
        }
    }

    private int getNum(int num, int i) {
        num = num + i;
        return num;
    }
}
