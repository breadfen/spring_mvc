package beady.domain;

import java.util.List;

public class VO {
    private List<User> userlist;

    @Override
    public String toString() {
        return "VO{" +
                "userlist=" + userlist +
                '}';
    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }
}
