package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Mercado Pago.");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Mercado Pago.");
    }
}
