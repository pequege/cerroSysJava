package cerrosys.componentes.dominio;

public class Proveedor {
	public String idProveedor;
	public String razonSocial;
	public String domicilioProveedor;
	public String telefonoProveedor;
	public String codigoPostalProveedor;
	public Provincia provinciaProveedor;
	public SituacionFiscal situacionFiscalProveedor;
	public String cuitProveedor;
	public String numeroCuentaProveedor;

	public Proveedor(String idProveedor, String razonSocial, String domicilioProveedor, String telefonoProveedor, String codigoPostalProveedor, Provincia provinciaProveedor, SituacionFiscal situacionFiscalProveedor, String cuitProveedor, String numeroCuentaProveedor) {
		this.idProveedor = idProveedor;
		this.razonSocial = razonSocial;
		this.domicilioProveedor = domicilioProveedor;
		this.telefonoProveedor = telefonoProveedor;
		this.codigoPostalProveedor = codigoPostalProveedor;
		this.provinciaProveedor = provinciaProveedor;
		this.situacionFiscalProveedor = situacionFiscalProveedor;
		this.cuitProveedor = cuitProveedor;
		this.numeroCuentaProveedor = numeroCuentaProveedor;
	}
	
}
