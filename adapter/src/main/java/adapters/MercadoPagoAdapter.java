package adapters;

import mercadopago.MercadoPago;
import paypal.IPaypalPayments;
import utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago usando os métodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePayment();
    }
}
