package org.studentManagement;

import lombok.Data;

@Data
public class Student<T,E> {
    T name;
    E id;

    public Student(T name, E id) {
        this.name = name;
        this.id = id;
    }
}
