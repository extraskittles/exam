package designPattern.strategyPattern.approval;

import org.springframework.stereotype.Component;

@Component
public class DirectorApproval implements UserApproval{
    private final String userCode="director";
    public String getUserCode() {
        return this.userCode;
    }

    public String approval() {
        String msg="直接部门审批了";
        return msg;
    }
}
