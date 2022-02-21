import adapters.MercadoPagoAdapter;
import adapters.PayoneerAdapter;
import mercadopago.MercadoPago;
import payoneer.Payoneer;
import paypal.IPaypalPayments;
import paypal.Paypal;

public class Main {


    public static void main(String[] args){

        //utilizando Paypal
        IPaypalPayments paymentPaypal = new Paypal();
        paymentPaypal.paypalPayment();
        paymentPaypal.paypalReceive();

        //utilizando o PayonnerAdapter
        IPaypalPayments paymentPayoneer = new PayoneerAdapter(new Payoneer());
        paymentPayoneer.paypalPayment();
        paymentPayoneer.paypalReceive();

        //utilizando o MercadoPagoAdapter
        IPaypalPayments mercadoPagoAdapter = new MercadoPagoAdapter(new MercadoPago());
        mercadoPagoAdapter.paypalPayment();
        mercadoPagoAdapter.paypalReceive();

    }


}
