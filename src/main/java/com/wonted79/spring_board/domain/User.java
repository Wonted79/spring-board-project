package com.wonted79.spring_board.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Getter
@NoArgsConstructor
public class User {

    private BigInteger id;

    private String userName;

    private String userPassword;

    private String userNickname;

    private String createdAt;
}
