package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService table = new UserServiceImpl();
        table.dropUsersTable();
        table.createUsersTable();
        table.saveUser("name1", "lastName1", (byte) 20);
        table.saveUser("name2", "lastName2", (byte) 30);
        table.saveUser("name3", "lastName3", (byte) 25);
        table.saveUser("name4", "lastName4", (byte) 40);
        for (int i = 0; i < table.getAllUsers().size(); i++) {
            System.out.println(table.getAllUsers().get(i).toString());
        }
        table.cleanUsersTable();
        table.dropUsersTable();
    }
}
