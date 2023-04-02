package service;

import com.quvideo.config.SpringConfig;
import com.quvideo.domain.AccountLog;
import com.quvideo.service.AccountLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountLogServiceTest {
    @Autowired
    private AccountLogService accountLogService;
    @Test
    public void testAllLogs() {
        List<AccountLog> logs = accountLogService.allLogs();
        System.out.println(logs);
    }

}
