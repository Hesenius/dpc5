/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

public interface Contact {
    void sendMail(String msg);
    default void add(Contact contact) { }
    default void remove(Contact contact) { }
}
