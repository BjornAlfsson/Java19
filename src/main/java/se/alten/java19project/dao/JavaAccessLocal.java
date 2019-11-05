package se.alten.java19project.dao;

import javax.ejb.Local;
import java.util.List;

@Local
public interface JavaAccessLocal {

    List getAllNames() throws Exception;
}
