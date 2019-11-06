package se.alten.java19project.transaction;

import se.alten.java19project.entity.Java;

import javax.ejb.Local;
import java.util.List;

@Local
public interface JavaTransactionAccess {
    List getAllNames();

    void addName(Java name);
}