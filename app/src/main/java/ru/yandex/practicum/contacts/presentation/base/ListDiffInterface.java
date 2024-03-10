package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T>{

    boolean theSameAs(T theSameAsValue);

    boolean equals(Object o);
}
