package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Alisha", "Obelix", (byte) 22);
        userDaoJDBC.saveUser("Alisia", "Obion", (byte) 25);
        userDaoJDBC.saveUser("Alistar", "Oboz", (byte) 48);
        userDaoJDBC.saveUser("Alik", "Obern", (byte) 31);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
