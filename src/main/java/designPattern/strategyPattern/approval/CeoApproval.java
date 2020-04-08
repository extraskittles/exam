package designPattern.strategyPattern.approval;

import org.springframework.stereotype.Component;

@Component
public class CeoApproval implements UserApproval {
    private final String userCode="ceo";
    public String getUserCode() {
        return this.userCode;
    }

    public String approval() {
        String msg="CEO审批了";
        return msg;
    }
}
