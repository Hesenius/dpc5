/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */
package visitor.solution1b;

public interface Contact {
    default void sendMail(String msg) {
        accept(new EmailSendingVisitor(msg));
    }
    void accept(Visitor visitor);

    default void add(Contact contact) {}
    default void remove(Contact contact) {}
}
