module spring.app {
    exports com.clean.sample.springapp;

    requires usecase;
    requires domain;
    requires uuid.simple;
    requires sha256.simple;
    requires inmem;

    requires spring.boot;
    requires spring.boot.starter.web;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.context;
    requires spring.web;
    requires jackson.annotations;
}