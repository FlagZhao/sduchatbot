package com.sdu.chatbot.model;

import lombok.Data;
import lombok.Getter;

@Data
public class Output<T>
{
    private int code;
    private Code codeInfo;
    private T data;

    public Output(Code code, T data)
    {
        this.codeInfo = code;
        this.code = code.getCode();
        this.data = data;
    }

    public enum Code
    {
        OK(0),
        NotRegister(100),
        Error(200),
        NotLogin(201),
        MaxSessions(202),
        ParameterError(203),
        UserExists(204),
        NotBelong(205),
        MissionStatusError(206),
        MaxCount(207),
        InsufficientBalance(208),
        NotAuth(209),;

        @Getter
        private final int code;

        Code(int code)
        {
            this.code = code;
        }
    }

    public static <T> Output<T> output(Code code)
    {
        return new Output<>(code, null);
    }

    public static <T> Output<T> output(T data)
    {
        return new Output<>(Code.OK, data);
    }

    public static Output outputOk()
    {
        return output(Code.OK);
    }

    public static Output outputNotRegister()
    {
        return output(Code.NotRegister);
    }

    public static Output outputError()
    {
        return output(Code.Error);
    }

    public static Output outputNotLogin()
    {
        return output(Code.NotLogin);
    }

    public static Output outputMaxSessions()
    {
        return output(Code.MaxSessions);
    }

    public static Output outputParameterError()
    {
        return output(Code.ParameterError);
    }

    public static Output outputUserExists()
    {
        return output(Code.UserExists);
    }

    public static Output outputNotBelong()
    {
        return output(Code.NotBelong);
    }

    public static Output outputMissionStatusError()
    {
        return output(Code.MissionStatusError);
    }

    public static Output outputMaxCount()
    {
        return output(Code.MaxCount);
    }

    public static Output outputInsufficientBalance()
    {
        return output(Code.InsufficientBalance);
    }

    public static Output outputNotAuth()
    {
        return output(Code.NotAuth);
    }
}
