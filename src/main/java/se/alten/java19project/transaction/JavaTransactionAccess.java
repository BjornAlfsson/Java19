package se.alten.java19project.transaction;

import javax.ejb.Local;
import java.util.List;

@Local
public interface JavaTransactionAccess {
    List getAllNames();
}
