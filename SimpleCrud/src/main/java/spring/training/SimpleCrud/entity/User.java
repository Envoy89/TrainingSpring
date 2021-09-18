package spring.training.SimpleCrud.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userId;
    private String userName;
    private String email;
    private String password;
}
