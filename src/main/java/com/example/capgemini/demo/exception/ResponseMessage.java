package com.example.capgemini.demo.exception;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseMessage {
    private String responseMessage = "Something went wrong. Your input is not correct";
}