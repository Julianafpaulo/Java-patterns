package mercadopago;

import utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
