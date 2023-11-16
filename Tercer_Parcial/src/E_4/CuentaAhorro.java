package E_4;


public class CuentaAhorro extends Cuenta{
    private boolean ACTIVA;
    public CuentaAhorro(float saldo, float tasaAnual) {
        super (saldo,tasaAnual);
        ACTIVA= saldo > 10000;
    }
    public void consignar(float monto){
        if(ACTIVA){
            super.asignar(monto);
        }
    }
    public void retirar(float monto){
        if(ACTIVA){
            super.retiro(monto);
        }
    }

    public void extractoMensual2(){
        int mayoresCuatro;
        if(getNumRetiros()>4){
            mayoresCuatro=(getNumRetiros()-4);
            setComisionMensual(mayoresCuatro*1000);
        }
        super.extractoMensual1();
        if(getSaldo()<10000){
            ACTIVA=false;
        }
    }
    public void imprimir(){
        System.out.println("Saldo: "+getSaldo()+" Bs.");
        System.out.println("Comisión mensual: "+getComisionMensual());
        System.out.println("Número de transacciones: "+(getNumRetiros()+getNumConsignaciones()));
        System.out.println();
    }
}