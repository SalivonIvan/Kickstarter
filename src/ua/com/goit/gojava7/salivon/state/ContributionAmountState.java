package ua.com.goit.gojava7.salivon.state;

import ua.com.goit.gojava7.salivon.beans.Payment;
import ua.com.goit.gojava7.salivon.context.Console;
import ua.com.goit.gojava7.salivon.dao.DaoFactory;

class ContributionAmountState extends PaymentState {

    private Payment payment;

    public ContributionAmountState(Payment payment) {
        this.payment = payment;
        menu = "Enter the contribution amount:";
    }

    @Override
    public void outputContentState() {
        System.out.println("--------------------------------------------------");
        System.out.println(menu);
    }

    @Override
    public boolean validate(String data) {
        int amount = 0;
        try {
            amount = Integer.parseInt(data);
        } catch (NumberFormatException e) {

            return false;
        }
        return true;
    }

    @Override
    public void changeState(Console context) {
        String inData = getInData();
        int amount = Integer.parseInt(inData);
        savePayment(amount);
        context.setCurrentState(new ProjectState());
    }

    protected void savePayment(int amount) {
        payment.setTotal(amount);
        DaoFactory.getPaymentDao(getCurrentDataType()).savePayment(payment);
    }

}
