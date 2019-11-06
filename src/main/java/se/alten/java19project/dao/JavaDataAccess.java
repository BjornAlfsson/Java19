package se.alten.java19project.dao;

import se.alten.java19project.entity.Java;
import se.alten.java19project.transaction.JavaTransactionAccess;

import javax.inject.Inject;
import java.util.List;

public class JavaDataAccess implements JavaAccessLocal {

    @Inject
    JavaTransactionAccess javaTransactionAccess;

    @Override
    public List getAllNames() {
        System.out.println("IN JavaDataAccess-----------------------------------------------------------");
        return javaTransactionAccess.getAllNames();
    }

    @Override
    public void addName(Java name) {
        javaTransactionAccess.addName(name);
    }
}
