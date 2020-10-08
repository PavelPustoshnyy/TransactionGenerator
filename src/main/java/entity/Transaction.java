package entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;

@CustomAnnotation
public class Transaction {
    private String ClientPin;
    private Double ReqAmt;
    private String Merchant;
    private String UTime;

    public Transaction(){}

    public Transaction(String ClientPin, Double ReqAmt, String Merchant, String UTime) {
        this.ClientPin=ClientPin;
        this.ReqAmt=ReqAmt;
        this.Merchant=Merchant;
        this.UTime=UTime;
    }
    @Override
    public String toString() {
        return "{\"CLIENTPIN\":\"" + ClientPin +
                "\",\"REQAMT\":" + ReqAmt +
                ",\"MERCHANT\":\"" + Merchant +
                "\",\"UTIME\":\"" + UTime + "\"}";
    }

    @JsonAlias("CLIENTPIN")
    @JsonSetter("ClientPin")
    public void setClientPin(String clientPin) {
        this.ClientPin=clientPin;
    }

    @JsonAlias("REQAMT")
    @JsonSetter("ReqAmt")
    public void setReqAmt(Double reqAmt) {
        this.ReqAmt=reqAmt;
    }

    @JsonAlias("MERCHANT")
    @JsonSetter("Merchant")
    public void setMerchant(String Merchant) {
        this.Merchant=Merchant;
    }

    @JsonAlias("UTIME")
    @JsonSetter("UTime")
    public void setUTime(String UTime) {
        this.UTime=UTime;
    }

    public String GetClientPin() {
        return this.ClientPin;
    }
    public Double GetReqAmt() {
        return this.ReqAmt;
    }
    public String GetMerchant() {
        return this.Merchant;
    }
    public String GetUTime() {
        return this.UTime;
    }
}
