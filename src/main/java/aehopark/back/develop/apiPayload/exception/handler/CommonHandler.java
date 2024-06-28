package aehopark.back.develop.apiPayload.exception.handler;

import aehopark.back.develop.apiPayload.code.BaseErrorCode;
import aehopark.back.develop.apiPayload.exception.GeneralException;

public class CommonHandler extends GeneralException {
    public CommonHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
