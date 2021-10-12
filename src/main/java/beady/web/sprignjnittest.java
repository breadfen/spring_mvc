package beady.web;

import beady.config.SpringConfiguration;
import beady.domain.Account;
import beady.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.security.auth.login.AccountException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {SpringConfiguration.class})
@ContextConfiguration("classpath:applicationContext.xml")
public class sprignjnittest {
    @Autowired
    private UserService service;

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testjdbcqueryno() {
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(count);
    }


    @Test
    public void testjdbcqueryaone() {
       Account account = jdbcTemplate.queryForObject("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), 1);
        System.out.println(account);
    }

    @Test
    public void testjdbcqueryall() {
        List<Account> accountlist = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountlist);
    }

    @Test
    public void testjdbc() {
        int tianqi = jdbcTemplate.update("update account set balance=? where aname=?", 2500, "tianqi");
    }

    @Test
    public void testjdbcdelete() {
        int tianqi = jdbcTemplate.update("delete from account where aname=?", "tianqi");
        System.out.println(tianqi);
    }


    @Test
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        service.save();
    }

}
