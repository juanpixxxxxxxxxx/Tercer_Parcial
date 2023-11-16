package E_4;

public class CuentaCorriente extends Cuenta {
    float sobreG = 0;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
    }

    public void retirar(float monto) {
        float newSaldo = getSaldo() - monto;
        if (newSaldo < 0) {
            sobreG -= newSaldo;
            setSaldo(0);
        } else {
            super.retiro(monto);
        }
    }

    public void consignar(float monto) {
        float residuo = sobreG - monto;
        if(sobreG > 0){
            if(residuo > 0){
                sobreG = 0;
                setSaldo(0);
            }else{
                sobreG = -residuo;
                setSaldo(0);
            }
        }else{
            super.asignar(monto);
        }
    }
    public void extractoMensual(){
        super.extractoMensual1();
    }
    public void imprimir() {
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Cargo mensual: "+getComisionMensual());
        System.out.println("Número de transacciones: "+(getNumConsignaciones()+getNumRetiros()));
        System.out.println("Valor de soregiro: "+(sobreG));
        System.out.println();
    }
}
