package com.jitu.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {
    void inject(MainActivity activity);
}
