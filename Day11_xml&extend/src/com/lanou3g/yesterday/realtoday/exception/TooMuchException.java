package com.lanou3g.yesterday.realtoday.exception;

public class TooMuchException extends EatException {

    @Override
    public String getMessage() {


        return "不知不觉，撑死了";

    }
}
