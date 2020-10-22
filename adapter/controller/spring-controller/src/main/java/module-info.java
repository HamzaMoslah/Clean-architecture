module spring.controller {
    exports com.clean.sample.controller;
    exports com.clean.sample.controller.model;

    requires domain;
    requires usecase;
}