package org.maumas.ADCapitulo5.AP5_30;

import java.util.Arrays;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String[] getStatesString() {
        return new String[]{"MA", "ME", "NH", "NJ", "NY", "PA", "VT"};
    }

    public String getState() {
        return state;
    }


    public void setState(String state) {

        if (Arrays.stream(getStatesString()).toList().contains(state)) {
            System.out.println("Alowed");
            this.state = state;
        } else {
            System.out.println("Error");
        }
    }
}
