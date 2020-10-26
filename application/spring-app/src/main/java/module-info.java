module spring.app {
    exports com.clean.sample.springapp.config;
    exports com.clean.sample.springapp.model;
    exports com.clean.sample.springapp.controller;
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

    opens com.clean.sample.springapp.config to spring.core;
    opens com.clean.sample.springapp to spring.core;
}