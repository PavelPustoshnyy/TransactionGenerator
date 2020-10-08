import entity.Transaction;
import entity.TransactionGenerator;
import kafka.MessageSender;

import java.util.ArrayList;
import java.util.List;

public class TestGenerator {
    public static void main(String[] args) {
        //TransactionGenerator defaulttg = new TransactionGenerator();
        //Transaction defaultTransaction = defaulttg.get();
        //System.out.println("ClintPin:" + defaultTransaction.GetClientPin() +
        //        ", ReqAmt:" + defaultTransaction.GetReqAmt() +
        //        ", Merchant:" + defaultTransaction.GetMerchant() +
        //        ", UTime:" + defaultTransaction.GetUTime());
//
        //ArrayList<String> ClientPinValues;
        //ArrayList<String> MerchantValues;
        //Double minValue;
        //Double maxValue;
        //int deviation;
//
        //ClientPinValues = new ArrayList<String>();
        //ClientPinValues.add("IsTher");
        //ClientPinValues.add("eAnyBo");
        //ClientPinValues.add("dyOutT");
        //ClientPinValues.add("hereIs");
        //minValue = 12.2;
        //maxValue = 183.4;
        //deviation = 500000;
        //MerchantValues = new ArrayList<String>();
        //MerchantValues.add("Any");
        //MerchantValues.add("one");
        //MerchantValues.add("home");
        //MerchantValues.add("Numb");
//
        //TransactionGenerator tg = new TransactionGenerator(ClientPinValues, MerchantValues, minValue, maxValue, deviation);
        //List<Transaction> transactionList = tg.get(5);
        //transactionList.forEach(x->System.out.println("ClintPin:" + x.GetClientPin() +
        //        ", ReqAmt:" + x.GetReqAmt() +
        //        ", Merchant:" + x.GetMerchant() +
        //        ", UTime:" + x.GetUTime()));
        String topic = "first_topic";
        MessageSender sender = new MessageSender(topic);
        TransactionGenerator tg = new TransactionGenerator();
        List<Transaction> transactionList = tg.get(1000);
        transactionList.forEach(x->sender.send(x.toString()));
        sender.flush();
        sender.close();
    }
}

