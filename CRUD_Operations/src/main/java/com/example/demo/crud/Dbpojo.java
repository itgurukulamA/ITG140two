package com.example.demo.crud;

import org.springframework.jdbc.core.RowCallbackHandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dbpojo {
private int id,age;
private String name,phno;
}
