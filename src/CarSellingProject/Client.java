package CarSellingProject;

import java.io.Serializable;
import java.util.ArrayList;

public class Client extends User implements Serializable{

    Integer id;

    public Client(Integer id, String name, String surname, String login, String password) {
        super(name, surname, login, password);
        this.id = id;
    }

    public Client(String name, String surname, String login, String password) {
        super(name, surname, login, password);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return " Name: " + name + '\n' +
                " Surname: " + surname + '\n' +
                " Login: " + login + '\n' +
                " Password: " + password + '\n';
    }
}
