package ru.tronina.test_rest.modelTR;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class RequestRT {
    @NotBlank
    @Size (max=32)
    private String uid;

    @NotBlank
     @Size (max=32)
    private String operationUid;

    @NotBlank
    private String systemTime;

    private String code;
    private String errorCode;
    private String errorMessage;


}
