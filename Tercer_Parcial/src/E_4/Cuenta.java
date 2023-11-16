package E_4;

public class Cuenta {
    private float saldo;
    private int numConsignaciones=0;
    private int numRetiros=0;
    private float tasaAnual;
    private float comisionMensual;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void asignar(float monto){
        if(monto>0){
            saldo+=monto;
            System.out.println("Saldo asignado correctamente");
            numConsignaciones++;
        }else{
            System.out.println("Solo se admiten montos mayores a 0 Bs.");
        }
    }
    public void retiro(float monto){
        if(monto>0&&monto<=saldo){
            System.out.println("Saldo retirado exitosamente");
            saldo-=monto;
            numRetiros++;
        }else{
            if(saldo>monto){
                System.out.println("Usted no posee esa cantidad de saldo");
            }
            if(saldo==0){
                System.out.println("Ingrese numeros mayores a 0 BS.");
            }
        }
    }
    public void interes(){
        float tasaMensual=tasaAnual/12;
        float intMensual=tasaMensual*saldo;
        saldo+=intMensual;
    }
    public void extractoMensual1(){
        saldo-=comisionMensual;
        interes();
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConsignaciones() {
        return numConsignaciones;
    }

    public void setNumConsignaciones(int numConsignaciones) {
        this.numConsignaciones = numConsignaciones;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public void setNumRetiros(int numRetiros) {
        this.numRetiros = numRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
}
