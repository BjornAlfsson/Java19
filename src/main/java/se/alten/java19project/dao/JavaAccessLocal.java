package se.alten.java19project.dao;

import se.alten.java19project.entity.Java;

import javax.ejb.Local;
import java.util.List;

@Local
public interface JavaAccessLocal {

    List getAllNames() throws Exception;

    void addName(Java name);
}
