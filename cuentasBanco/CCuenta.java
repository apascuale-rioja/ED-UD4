package cuentasBanco;
/**
 * @author Ana Pascual Escudero
 * @version 0.1
 *
 */
public class CCuenta {


    private String nombrepersona;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Metodo constructor de la clase CCuenta por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Metodo constructor de la clase CCuenta
     * @param nom nombre que se introduce
     * @param cue cuenta que se introduce
     * @param sal saldo actual de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Metodo para obtener el estado de la cuenta
     * @return Devuelve el saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para ingresar dinero en la cuenta
     * @param cantidad Numero de tipo double que es la cantidad a ingresar
     * @throws Exception Si la cantidad es negativa se eia un mensaje de error
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar dinero de la cuenta
     * @param cantidad Numero de tipo double que es la cantidad a retirar
     * @throws Exception Si la cantidad es negativa (o cero) da error. Si la cantidad es mayor que el saldo actual, da error.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Metodo para consultar el nombre
	 * @return Devuelve el nombre
	 */
	private String getNombre() {
		return nombrepersona;
	}

	/**
	 * Metodo para modificar el nombre
	 * @param nombre String con el nombre que se quiere introducir
	 */
	private void setNombre(String nombre) {
		this.nombrepersona = nombre;
	}

	/**
	 * Metodo para consultar la cuenta
	 * @return Devuelve la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo para modificar la cuenta
	 * @param cuenta String con el numero de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo para consultar el saldo
	 * @return Devuelve el saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo para modificar el saldo
	 * @param saldo Numero de tipo double que es el saldo que queremos configurar
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo para consultar el tipo de interes
	 * @return Devuelve el tipo de interes
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo para modificar el tipo de interes
	 * @param tipoInteres Numero de tipo double que es el tipo de interes que queremos configurar
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
