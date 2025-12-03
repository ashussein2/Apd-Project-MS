package com.hotel.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.AbstractModule;

public class AppConfig {

    private static final Injector injector = Guice.createInjector(new CoreModule());

    public static Injector getInjector() {
        return injector;
    }

    private static class CoreModule extends AbstractModule {
        @Override
        protected void configure() {
            // Milestone 1: basic wiring only.
            // You will bind repositories, services, etc. in later milestones.
        }
    }
}
