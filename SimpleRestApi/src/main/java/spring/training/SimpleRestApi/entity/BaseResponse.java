package spring.training.SimpleRestApi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BaseResponse {
    private final String status;
    private final Integer code;
}
