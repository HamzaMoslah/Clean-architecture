module config {
    exports com.clean.sample.config;

    requires usecase;
    requires domain;
    requires uuid.simple;
    requires sha256.simple;
    requires inmem;
}