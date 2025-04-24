package pack1;
import java.util.HashMap;
import java.util.Map;

public class atmoperationimpl implements atmoperationinter{
    ATM atm=new ATM();
    Map<Double,String>ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
System.out.println("available balance is:" +atm.getbalance());
    }
    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
        if(withdrawAmount<=atm.getbalance()){
            ministmt.put(withdrawAmount,"amount withdraw");
System.out.println("collect the cash"+withdrawAmount);
atm.setbalance(atm.getbalance()-withdrawAmount);
viewBalance();
    }else {
            System.out.println("insufficient balance");
        }
        }else{
            System.out.println("please enter amounting multiple of 500");
        }
    }

    @Override
    public void depositAmount(double depositamount) {
        ministmt.put(depositamount,"amount deposit");

        System.out.println(depositamount+"deposited successfully.!!");
atm.setbalance(atm.getbalance()+depositamount);
viewBalance();

    }

    @Override
    public void viewMiniStatement() {
for(Map.Entry<Double,String> m:ministmt.entrySet()){
    System.out.println(m.getKey()+""+m.getValue());
}
    }
}

