package ru.tronina.test_rest.controllerTR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tronina.test_rest.modelTR.RequestRT;
import ru.tronina.test_rest.modelTR.ResponseRT;

@RestController
public class MyControllerTR {



    ResponseRT responseRT;

    @PostMapping(value = "/feedback")

    public ResponseEntity<ResponseRT> feedback (@RequestBody RequestRT requestRT){


        ResponseRT responseRT = ResponseRT.builder()
                .uid(requestRT.getUid())
                .operationUid((requestRT.getOperationUid()))
                .systemTime(requestRT.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();

        System.out.println("Пришел запрос 111");
        return new ResponseEntity<>(responseRT, HttpStatus.OK);
    }

}
