package designPattern.strategyPattern.Service.ServiceImpl;

import org.springframework.stereotype.Service;
import designPattern.strategyPattern.approval.UserApproval;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private static Map<String, UserApproval> userApprovals=new HashMap<String,UserApproval>();
    public UserService(List<UserApproval> UserApprovals){
        for(UserApproval approval:UserApprovals){
            this.userApprovals.put(approval.getUserCode(),approval);
        }
    }
    public String approval(String code){
        UserApproval userApproval = userApprovals.get(code);
        if(userApproval==null){
            throw new IllegalArgumentException("用户代码没有找到");
        }else {
            return userApproval.approval();
        }
    }
    public String approval2(String code){
        if("ceo".equals(code)){
            return "ceo审批";
        }else if("manager".equals(code)){
            return "主管审批";
        }else if("director".equals(code)){
            return "直接部门审批";
        }else {
            return "没有审核人审批";
        }
    }
}
