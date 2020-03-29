package strategyPattern.approval;

import org.springframework.stereotype.Component;

@Component
public class MangerApproval implements UserApproval {
    private final String userCode="manager";
    public String getUserCode() {
        return this.userCode;
    }

    public String approval() {
        String msg="经理审批了";
        return msg;
    }
}
