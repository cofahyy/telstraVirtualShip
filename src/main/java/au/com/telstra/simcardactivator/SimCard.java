package au.com.telstra.simcardactivator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jajarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimCard {
    @ID
    @GeneratedValue(strategy=GenerationType.AUTO);
    public long id;
    private String iccid;
    private String customerEmail;
    private boolean active;

    protected SimCard() {
    }

    public SimCard(String iccid, String customerEmail, boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {return id;}

    @Override
    public String toString() {
        return "SimCard {iccid=" + iccid + ", customerEmail=" + customerEmail + ", active=" + active + "}";
    }
}