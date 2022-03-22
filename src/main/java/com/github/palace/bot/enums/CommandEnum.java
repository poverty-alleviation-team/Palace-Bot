package com.github.palace.bot.enums;

/**
 * @author JHY
 * @date 2022/3/22 13:59
 */
public enum CommandEnum {

    HELP("-help");

    private final String code;

    CommandEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
