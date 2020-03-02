package by.patsei.factory;

import by.patsei.factory.model.User;

import java.sql.ResultSet;

public class Demo {
    public static void main(String[] args) {
        Builder userbuilder = BuilderFactory.create("user");
       //userbuilder.build( ResultSet);
    }
}