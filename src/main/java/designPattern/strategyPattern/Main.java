package designPattern.strategyPattern;

import designPattern.strategyPattern.Service.ServiceImpl.UserService;
import designPattern.strategyPattern.approval.CeoApproval;
import designPattern.strategyPattern.approval.DirectorApproval;
import designPattern.strategyPattern.approval.MangerApproval;
import designPattern.strategyPattern.approval.UserApproval;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UserApproval> userApprovals = new ArrayList<UserApproval>();
        userApprovals.add(new CeoApproval());
        userApprovals.add(new MangerApproval());
        userApprovals.add(new DirectorApproval());
        UserService userService=new UserService(userApprovals);
        String s = userService.approval2("ceo");
        System.out.println(s);
        String s2 = userService.approval("manager");
        System.out.println(s2);
    }
}
